import java.util.Iterator;

public class Linkedlist<T> implements Iterable<T>{
    Node head;
    Linkedlist(){
        head=null;
    }
    public class Node {
        T Data;
        Node Next;
        Node(T val){
            Data=val;
            Next=null;
        }
    }
    public void insetAtBeginning(T val){
        Node newNode=new Node(val);
        if(head==null){
            head=newNode;
        }
        else {
            newNode.Next=head;
            head=newNode;
        }
    }
    public void display(){
        Node temp=head;
        while (temp!=null){
            System.out.print(temp.Data+" ");
            temp=temp.Next;
            //System.out.println(" ");
        }
    }
    public void insertAtPosition(int pos,T val){
        if(pos==0) {
            insetAtBeginning(val);
            return;
        }
        Node newNode=new Node(val);
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.Next;
            }


        newNode.Next=temp.Next;
        temp.Next=newNode;
    }
    public void deleteAtPosition(int pos){
        if(pos==0){
            head=head.Next;
            return;
        }
        Node temp=head;
        Node previous = null;
        for(int i=0;i<pos;i++){
            previous=temp;
            temp=temp.Next;
        }
        previous.Next=temp.Next;



    }
    public void reverseList(){
        Node previous=null;
        Node current=head;
        Node next=head.Next;
        while(current!=null){
            next=current.Next;
            current.Next=previous;
            previous=current;
            current=next;
        }
        head=previous;
    }
    public Iterator<T>iterator(){
        return new Iterator<T>() {
            Node temp = head;

            @Override
            public boolean hasNext() {
                return temp != null;
            }

            @Override
            public T next() {
                T val = temp.Data;
                temp = temp.Next;
                return val;
            }
        };
    }

}