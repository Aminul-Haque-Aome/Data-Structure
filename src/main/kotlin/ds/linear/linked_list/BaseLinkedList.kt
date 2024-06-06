package ds.linear.linked_list

abstract class BaseLinkedList<T>: ILinkedList<T> {

    private var head: Node<T>? = null
    private var tail: Node<T>? = null

    private fun isEmpty(): Boolean {
        return head == null
    }

    private fun init(node: Node<T>) {
        head = node
        tail = node
    }

    private fun dismissList() {
        head = null
        tail = null
    }

    protected fun addNodeAtFirstIndex(node: Node<T>) {
        if (isEmpty()) {
            init(node)
        } else {
            node.next = head
            head = node
        }
    }

    protected fun addNodeAtLastIndex(node: Node<T>) {
        if (isEmpty()) {
            init(node)
        } else {
            tail?.next = node
            tail = node
        }
    }

    protected fun getNodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0

        while (currentNode != null && currentIndex < index) {
            currentNode = currentNode.next
            currentIndex++
        }

        return currentNode
    }

    protected fun isNodeInTheList(node: T): Boolean {
        var currentNode = head

        while (currentNode != null) {
            if (currentNode.item == node) return true
            currentNode = currentNode.next
        }

        return false
    }

    protected fun addNodeAt(index: Int, node: Node<T>) {
        if (index < 0) throw IndexOutOfBoundsException("Index cannot be negative")

        var current = head
        var currentIndex = 0

        while (current != null && currentIndex < index - 1) {
            current = current.next
            currentIndex++
        }

        if (current == null) throw IndexOutOfBoundsException("Index out of bounds")

        node.next = current.next
        current.next = node

        if (node.next == null) {
            tail = node
        }
    }

    protected fun deleteFirstNodeOfTheList() {
        if (!isEmpty()) {
            head = head?.next

            if (head == null) {
                tail = null
            }
        }
    }

    protected fun deleteLastNodeOfTheList() {
        if (!isEmpty()) {
            if (head?.next == null) {
                dismissList()
            } else {
                deleteLastItemIfListHasMultipleItem()
            }
        }
    }

    private fun deleteLastItemIfListHasMultipleItem() {
        var current = head

        while (current?.next != tail) {
            current = current?.next
        }

        current?.next = null
        tail = current
    }

    protected fun deleteItemAt(index: Int) {
        if (index < 0) throw IndexOutOfBoundsException("Index cannot be negative")
        if (isEmpty()) throw NoSuchElementException("List is empty")

        if (index == 0) {
            deleteFirstNodeOfTheList()
        } else {
            var current = head
            var currentIndex = 0

            while (current != null && currentIndex < index - 1) {
                current = current.next
                currentIndex++
            }

            if (current?.next == null) {
                throw IndexOutOfBoundsException("Index out of bounds")
            }

            current.next = current.next?.next

            if (current.next == null) {
                tail = current
            }
        }
    }

    override fun traverse() {
        var current = head

        while (current != null) {
            println("Item -> ${current.item}")
            current = current.next
        }
    }

    override fun reverse() {
        var previous: Node<T>? = null
        var current = head

        while (current != null) {
            val next = current.next
            current.next = previous
            previous = current
            current = next
        }

        head = previous
    }

    override fun getItemsAsSequence(): String {
        return if (isEmpty()) "Empty list"
        else head.toString()
    }

    protected fun sizeOfTheList(): Int {
        var current = head

        var count = 0
        while (current != null) {
            count++
            current = current.next
        }

        return count
    }

}
