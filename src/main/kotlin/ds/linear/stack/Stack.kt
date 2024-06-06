package ds.linear.stack

import ds.linear.LinearDataStructure

class Stack<T>: IStack<T>, LinearDataStructure<T>() {

    override fun push(item: T) {
        addItemAtTheEndOfList(item)
    }

    override fun pop(): T? {
        return if(!isEmpty()) removeItemFromLast()
        else null
    }

    private fun removeItemFromLast(): T? {
        return items.removeAt(size() - 1)
    }

    override fun peek(): T? {
        return items.lastOrNull()
    }

}
