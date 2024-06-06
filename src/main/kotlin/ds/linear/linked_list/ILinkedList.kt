package ds.linear.linked_list

import java.util.NoSuchElementException

interface ILinkedList<T> {

    /**
     * Inserts element at the front of this list.
     * If the list is empty, the element will be the only item in the list.
     *
     * @param node the node to be inserted at the front.
     */
    fun push(node: Node<T>)

    /**
     * Inserts element at the end of this list.
     *
     * @param node the node to be inserted at the end.
     */
    fun append(node: Node<T>)

    /**
     * Add node at index-th position.
     *
     * @param index the position to insert the node at.
     * @param node the node to be inserted.
     * @throws IndexOutOfBoundsException if the index is invalid.
     */
    @Throws(IndexOutOfBoundsException::class)
    fun addAt(index: Int, node: Node<T>)

    /**
     * Delete the first element of this list.
     */
    fun pop()

    /**
     * Delete the last element of this list.
     */
    fun removeLast()

    /**
     * Delete node at index-th position.
     *
     * @param index the position of the node to be deleted.
     * @throws NoSuchElementException if this list is empty.
     * @throws IndexOutOfBoundsException if the index is invalid.
     */
    @Throws(
        NoSuchElementException::class,
        IndexOutOfBoundsException::class
    )
    fun deleteAt(index: Int)

    /**
     * Fetch node at index-th position.
     *
     * @param index the position of the node to be fetched.
     * @return [Node] the node at the specified position.
     * @throws NoSuchElementException if this list is empty.
     */
    @Throws(NoSuchElementException::class)
    fun nodeAt(index: Int): Node<T>

    /**
     * Check whether [node] is in the list or not.
     *
     * @param node the value to check for presence in the list.
     * @return [Boolean] - true if the value is in the list, false otherwise.
     */
    fun contains(node: T): Boolean

    /**
     * Print list items.
     */
    fun traverse()

    /**
     * Reversed the order of the list.
     */
    fun reverse()

    /**
     * Fetch the list items as a sequence (A -> B -> C).
     *
     * @return [String] - the sequence as a string.
     */
    fun getItemsAsSequence(): String

    /**
     * Return the size of the LinkedList.
     *
     * @return [Int] - the size of the LinkedList.
     */
    fun size(): Int

}
