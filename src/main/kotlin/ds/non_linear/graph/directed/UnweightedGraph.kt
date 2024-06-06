package ds.non_linear.graph.directed

import ds.non_linear.graph.Graph
import ds.non_linear.graph.UnweightedEdge
import ds.non_linear.graph.helper.UnweightedGraphPrinter

class UnweightedGraph(
    numberOfVertices: Int
): Graph(numberOfVertices), UnweightedEdge {

    private val adjacencyList: Array<MutableList<Int>> = Array(numberOfVertices) { mutableListOf() }
    private val unweightedGraphPrinter = UnweightedGraphPrinter(adjacencyList)

    override fun addEdge(source: Int, destination: Int) {
        adjacencyList[source].add(destination)
    }

    override fun printGraph() {
        unweightedGraphPrinter.print()
    }

}
