import search.bs.BinarySearch

fun main(args: Array<String>) {
    val search = BinarySearch(arrayOf(1, 24, 35, 44, 56, 78, 99, 123))
    println("${search.getIndexOf(24)}")
}