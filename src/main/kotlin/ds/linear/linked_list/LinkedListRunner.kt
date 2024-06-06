package ds.linear.linked_list

fun main() {
    val linkedList = LinkedList<Int>()

    linkedList.apply {
        push(Node(3))
        append(Node(1))
        append(Node(2))
        append(Node(3))
        push(Node(2))
        append(Node(7))
        push(Node(1))
        append(Node(5))
        addAt(3, Node(4))
        addAt(10, Node(4))
        println(getItemsAsSequence())
        reverse()
        println(getItemsAsSequence())
    }



}