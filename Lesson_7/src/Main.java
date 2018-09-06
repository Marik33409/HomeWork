public class Main {

    public static void main(String[] args) {
//        testDfs();
        testBfs();

//        graph.display();
    }

    private static void testBfs() {
        Graph graph = new GraphImpl(8);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        graph.addEdge("B", "E");
        graph.addEdge("C", "F");
        graph.addEdge("D", "G");
        graph.addEdge("E", "H");

        graph.addEdge("C", "G");
        graph.addEdge("D", "H");



        //A B C D E F G H
        graph.bfs("A");
    }

    private static void testDfs() {
        Graph graph = new GraphImpl(7);
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("A", "D");

        graph.addEdge("B", "E");
        graph.addEdge("D", "F");
        graph.addEdge("F", "G");
        graph.addEdge("C", "F");


        graph.dfs("A");
    }
}