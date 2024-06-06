package ds.linear.linked_list

/**
 * Data class representing a Node.
 *
 * @property item Value of the node.
 * @property next Reference of the next Node.
 *
 * @return A new instance of the [Node] class.
 */
data class Node<T>(
    var item: T,
    var next: Node<T>? = null
) {

    override fun toString(): String {
        return if (next != null) {
            "$item -> ${next.toString()}"
        } else {
            "$item"
        }
    }

}
