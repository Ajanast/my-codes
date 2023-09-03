public class Stack {
    int top;
    int array[]=new int[10];
    Stack(){
        top=-1;
    }
    void push(int item){
        if(top==array.length-1){
            System.out.println("Stack is full :");
        }
       // top++;
        array[++top]=item;
    }
    int pop(){
       return array[top--];
    }
}
