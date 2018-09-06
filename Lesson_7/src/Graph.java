public interface Graph {

    public void addVertex(String  label);

    public boolean addEdge(String fromLabel, String toLabel);

    public boolean remove(String label);

    public Vertex find(String  label);

    int indexOf(String label);

    boolean isEmpty();

    int getSize();

    void display();

    //Depth-first search, DFS
    void dfs(String startVertexLabel);

    // breadth-first search, BFS
    void bfs(String startVertexLabel);

    String findShortestPath(String startLabel, String finishLabel);
}