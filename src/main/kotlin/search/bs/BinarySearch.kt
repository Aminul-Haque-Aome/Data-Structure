package search.bs

import search.Search

class BinarySearch(
    private val items: Array<Int>
): Search {

    override fun getIndexOf(item: Int): Int {
        var leftIndex = 0
        var rightIndex = items.size - 1

        while (leftIndex <= rightIndex) {
            val midIndex = leftIndex + (rightIndex - leftIndex) / 2

            if (items[midIndex] == item) {
                return midIndex
            } else if (items[midIndex] > item) {
                rightIndex = midIndex - 1
            } else {
                leftIndex = midIndex + 1
            }
        }

        return -1
    }

}
