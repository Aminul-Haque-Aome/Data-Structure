package search

interface Search {
    /**
     * @return index of [item] if found.
     *
     * otherwise -1
     */
    fun getIndexOf(item: Int) : Int
}