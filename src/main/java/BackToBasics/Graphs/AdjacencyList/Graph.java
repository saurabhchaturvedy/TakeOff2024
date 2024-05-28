package BackToBasics.Graphs.AdjacencyList;

import java.util.LinkedList;
import java.util.Queue;

public class Graph {


    LinkedList<Integer>[] adjList;
    int V;
    int E;


    Graph(int nodes) {
        this.V = nodes;
        this.E = 0;

        this.adjList = new LinkedList[nodes];

        for (int i = 0; i < nodes; i++) {

            this.adjList[i] = new LinkedList<>();
        }
    }


    public void addEdge(int u, int v) {

        this.adjList[u].add(v);
        this.adjList[v].add(u);
        E++;
    }


    public String toString() {

        StringBuilder sb = new StringBuilder();

        sb.append(V + " , vertices " + E + " , edges" + "\n");

        for (int i = 0; i < V; i++) {

            sb.append(i + " : ");

            for (int x : adjList[i]) {

                sb.append(x + " ");
            }

            sb.append("\n");
        }

        return sb.toString();
    }


    public void bfs(int startingNode) {

        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        visited[startingNode] = true;
        queue.offer(startingNode);


        while (!queue.isEmpty()) {

            int visitedNode = queue.poll();

            System.out.print(visitedNode + " ");

            for (int neighbour : adjList[visitedNode]) {

                if (!visited[neighbour]) {

                    visited[neighbour] = true;
                    queue.offer(neighbour);
                }
            }
        }
    }


    public static void main(String[] args) {


        Graph graph = new Graph(5);

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 0);
        graph.addEdge(2, 4);

        System.out.println(graph);

        System.out.print(" BFS Traversal :");
        graph.bfs(0);
    }
}
