public class Main {
    public static void main(String[] args) {
        Queue queue=new Queue();
        queue.enque(9);
        queue.enque(6);
        queue.enque(2);
        System.out.println(queue.deque());
    }
}