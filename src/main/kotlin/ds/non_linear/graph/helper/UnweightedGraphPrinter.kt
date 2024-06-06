package ds.non_linear.graph.helper

class UnweightedGraphPrinter(
    private val adjacencyList: Array<MutableList<Int>>
): GraphPrinter {

    override fun print() {
        for (i in adjacencyList.indices) {
            print("Vertex $i: ")
            for (j in adjacencyList[i]) {
                print("$j ")
            }
            println()
        }
    }

}
