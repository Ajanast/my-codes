public class QueueArray {
    int front;
    int rear;
    int arr[]=new int[3];
    QueueArray(){
        front=-1;
        rear=-1;
    }
    public void enqueue(int val){
        if(rear==arr.length)
            throw new IndexOutOfBoundsException("Queue is full");
        if(front==-1){
            front++;
        }
        arr[++rear]=val;
    }
    public int dequeue(){
        if(front==-1||front>rear)
            throw new IndexOutOfBoundsException("Queue is empty");
        return arr[front++];
    }
}
