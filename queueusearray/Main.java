public class Main {
    public static void main(String[] args) {
        QueueArray values=new QueueArray();


            values.enqueue(4);
            values.enqueue(2);
            values.enqueue(1);
           // values.enqueue(10);
            System.out.println(values.dequeue());
        System.out.println(values.dequeue());



    }
}