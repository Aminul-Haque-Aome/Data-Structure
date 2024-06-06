package ds.linear.queue

interface IQueue<T> {
    fun enqueue(item: T)
    fun dequeue(): T?
}
