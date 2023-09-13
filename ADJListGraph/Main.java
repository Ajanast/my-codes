public class Main {
    public static void main(String[] args) {

        graphList graphlist=new graphList(5);
        graphlist.addEdges(0,1);
        graphlist.addEdges(0,4);
        graphlist.addEdges(1,4);
        graphlist.addEdges(1,2);
        graphlist.addEdges(2,3);
        graphlist.addEdges(3,4);


        for (int i=0;i<graphlist.adjacencyList.size();i++){
            System.out.println("Adjacency list : "+i);
            for(int j=0;j<graphlist.adjacencyList.get(i).size();j++){
                System.out.println(graphlist.adjacencyList.get(i).get(j));
            }
        }
    }
}