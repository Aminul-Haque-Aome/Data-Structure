package ds.linear

abstract class LinearDataStructure<T> {

    protected val items: MutableList<T> = mutableListOf()

    abstract fun peek(): T?

    fun addItemAtTheEndOfList(item: T) {
        items.add(item)
    }

    fun isEmpty(): Boolean {
        return items.isEmpty()
    }

    fun size(): Int {
        return items.size
    }

    override fun toString(): String {
        return items.toString()
    }

}
