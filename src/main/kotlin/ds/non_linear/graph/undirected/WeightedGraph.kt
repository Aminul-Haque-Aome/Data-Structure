package ds.non_linear.graph.undirected

import ds.non_linear.graph.Graph
import ds.non_linear.graph.WeightedEdge
import ds.non_linear.graph.helper.WeightedGraphPrinter

class WeightedGraph(
    numberOfVertices: Int
): Graph(numberOfVertices), WeightedEdge {

    private val adjacencyList: Array<MutableList<Pair<Int, Int>>> = Array(numberOfVertices) { mutableListOf() }
    private val weightedGraphPrinter = WeightedGraphPrinter(adjacencyList)

    override fun addEdge(source: Int, destination: Int, weight: Int) {
        adjacencyList[source].add(Pair(destination, weight))
        adjacencyList[destination].add(Pair(source, weight))
    }

    override fun printGraph() {
        weightedGraphPrinter.print()
    }

}
