public class Main {
    public static <T> void main(String[] args) {
        Linkedlist<String>list=new Linkedlist<String>();
        list.insetAtBeginning("Anast");
        list.insetAtBeginning("raj");
        //list.display();
        //System.out.println();
        list.insertAtPosition(1,"Ganesh");
       list.display();
       /*
        System.out.println();
        list.deleteAtPosition(0);
        for(String x:list){
            System.out.print(x+" ");
        }
        System.out.println();
        list.insertAtPosition(1,"Ajin");
        for(String x:list){
            System.out.print(x+" ");
        }
        */
        System.out.println();
        list.reverseList();
        for(String x:list){
            System.out.print(x+" ");
        }
    }
}