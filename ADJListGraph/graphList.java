import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class graphList {
    ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();

    graphList(int val) {
        for (int i = 0; i < val; i++) {
            adjacencyList.add(new ArrayList<Integer>());
        }
    }

    public void addEdges(int x, int y) {
        adjacencyList.get(x).add(y);
        adjacencyList.get(y).add(x);
    }

    public void bfs(int v) {
        int arraySize = adjacencyList.size();
        boolean[] visited = new boolean[arraySize];
        visited[v] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);
        while (queue.size() != 0) {
            int vertex = queue.remove();
            System.out.println(vertex + " ");
            for (int i = 0; i < adjacencyList.get(vertex).size(); i++) {
                int av = adjacencyList.get(vertex).get(i);
                if (!visited[av]) {
                    queue.add(av);
                    visited[av] = true;
                }
            }

        }

    }
    public void dfs(int v){
        int arraySize = adjacencyList.size();
        boolean[] visited = new boolean[arraySize];
        dfs2(v,visited);
    }
    public void dfs2(int v,boolean[] visited){
        visited[v]=true;
        System.out.print(v+" ");
        for(int i=0;i<adjacencyList.get(v).size();i++){
            int av=adjacencyList.get(v).get(i);
            if (!visited[av]){
                dfs2(av,visited);
            }
        }
    }
}
