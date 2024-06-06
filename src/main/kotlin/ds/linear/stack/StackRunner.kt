package ds.linear.stack

fun main() {
    val stack = Stack<Int>()

    stack.apply {
        push(1)
        push(2)
        push(3)
    }

    println("Stack: $stack")
    println("Peek: ${stack.peek()}")
    println("Pop: ${stack.pop()}")
    println("Stack after pop: $stack")
    println("Is stack empty? ${stack.isEmpty()}")
    println("Stack size: ${stack.size()}")
}