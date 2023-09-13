import java.util.ArrayList;

public class graphList {
    ArrayList<ArrayList<Integer>> adjacencyList=new ArrayList<>();
    graphList(int val){
        for(int i=0;i<val;i++){
            adjacencyList.add(new ArrayList<Integer>());
        }
    }
    public void addEdges(int x,int y){
        adjacencyList.get(x).add(y);
        adjacencyList.get(y).add(x);
    }
   /* public void printGraph(){
        for(int i=0;i<adjacencyList.size();i++){
            System.out.println("adjacency list : "+i);
            for (int j=0;adjacencyList.get(i).size();j++){

            }
        }
    }*/
}
