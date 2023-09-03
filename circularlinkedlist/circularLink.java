public class circularLink<T> {
    Node last;
    class Node{
            T data;
            Node next;
            Node(T val){
                data=val;
                next=null;
            }
    }
    circularLink(){
        last=null;
    }
    public void insertAtBegin(T val){
        Node newNode=new Node(val);
        if(last==null){
            newNode.next=newNode;
            last=newNode;
        }
        else
            newNode.next=last.next;
           last.next=newNode;
    }
    public void insertAtEnd(T val){
        Node newNode=new Node(val);
        if(last==null){
            newNode.next=newNode;
            last=newNode;
        }
        newNode.next=last.next;
        last.next=newNode;
        last=newNode;

    }
    public void display(){
        Node temp=last.next;
        if(temp==null){
            System.out.println("Emptylist");
        }
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }while (temp!=last.next);
    }
}
