package ds.non_linear.graph

import ds.non_linear.graph.undirected.UnweightedGraph

fun main() {
    val unweightedGraph: UnweightedGraph = UnweightedGraph(6)

    unweightedGraph.addEdge(0, 1)
    unweightedGraph.addEdge(0, 2)
    unweightedGraph.addEdge(0, 3)
    unweightedGraph.addEdge(1, 2)
    unweightedGraph.addEdge(1, 3)
    unweightedGraph.addEdge(2, 4)
    unweightedGraph.addEdge(2, 5)
    unweightedGraph.addEdge(3, 4)
    unweightedGraph.addEdge(4, 5)

    unweightedGraph.printGraph()
}