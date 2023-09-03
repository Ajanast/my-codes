public class Stack<T> {
   Node top;
   Stack(){
       top=null;
   }
   class  Node{
       T Data;
       Node next;
       Node(T val){
           Data=val;
           next=null;
       }
   }
   public void push(T val){
       Node newNode=new Node(val);
       if(top==null){
           top=newNode;
       }
       else {
           newNode.next = top;
           top = newNode;
       }
   }
   public  T pop(){
       T temp=null ;
       if(top==null){
           System.out.println();
       }
       else {
           temp = top.Data;
           top=top.next;
       }
       return temp;
   }
    public  T peek(){
        T temp;
        if(top==null){
            throw new IndexOutOfBoundsException("Empty stack");
        }
        else {
            temp = top.Data;
        }
        return temp;
    }
}
