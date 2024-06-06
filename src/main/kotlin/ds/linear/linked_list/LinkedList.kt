package ds.linear.linked_list

class LinkedList<T>: BaseLinkedList<T>() {

    override fun push(node: Node<T>) {
        addNodeAtFirstIndex(node)
    }

    override fun append(node: Node<T>) {
        addNodeAtLastIndex(node)
    }

    override fun addAt(index: Int, node: Node<T>) {
        try {
            addNodeAt(index, node)
        } catch (ex: IndexOutOfBoundsException) {
            println(ex.message)
        }
    }

    override fun pop() {
        deleteFirstNodeOfTheList()
    }

    override fun removeLast() {
        deleteLastNodeOfTheList()
    }

    override fun deleteAt(index: Int) {
        deleteItemAt(index)
    }

    override fun nodeAt(index: Int): Node<T> {
        return getNodeAt(index) ?: throw NoSuchElementException("This Node is not in the list")
    }

    override fun contains(node: T): Boolean {
        return isNodeInTheList(node)
    }

    override fun size(): Int {
        return sizeOfTheList()
    }

}
