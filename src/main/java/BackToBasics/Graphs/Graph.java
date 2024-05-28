package BackToBasics.Graphs;

public class Graph {


    int V;
    int E;

    int[][] adjMatrix;


    Graph(int nodes) {

        this.V = nodes;
        this.E = 0;
        this.adjMatrix = new int[nodes][nodes];
    }


    public void addEdge(int u, int v) {

        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;   // undirected graph, that's why
        E++;
    }


    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(V + " , vertices , " + E + " Edges " + "\n");
        for (int i = 0; i < V; i++) {

            sb.append(i + " : ");

            for (int x : adjMatrix[i]) {
                sb.append(x + " ");
            }

            sb.append("\n");
        }

        return sb.toString();
    }


    public static void main(String[] args) {

        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);

        System.out.println(graph);
    }
}
