package ds.linear.queue

fun main() {
    val queue = Queue<Int>()

    queue.apply {
        enqueue(1)
        enqueue(2)
        enqueue(3)
    }

    println("Queue: $queue")
    println("Peek: ${queue.peek()}")
    println("Dequeue: ${queue.dequeue()}")
    println("Queue after pop: $queue")
    println("Is Queue empty? ${queue.isEmpty()}")
    println("Queue size: ${queue.size()}")

}