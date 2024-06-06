package ds.linear.queue

import ds.linear.LinearDataStructure

class Queue<T>: IQueue<T>, LinearDataStructure<T>() {

    override fun enqueue(item: T) {
        addItemAtTheEndOfList(item)
    }

    override fun dequeue(): T? {
        return if(!isEmpty()) removeItemFromFirst()
        else null
    }

    override fun peek(): T? {
        return items.firstOrNull()
    }

    private fun removeItemFromFirst(): T? {
        return items.removeAt(0)
    }

}
