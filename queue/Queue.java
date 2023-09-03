public class Queue {
    int top;
    int i = 0;
    int array[] = new int[10];

    Queue() {
        top = -1;
    }

    void enque(int item) {
        if (top == array.length - 1) {
            System.out.println("Queue is full :");
        } else {
            top++;
            array[top] = item;
        }
    }

    int deque() {
        if (top >= 0) {
            return array[i++];
        }
        else {
            System.out.println("Queue is empty");
        }

        return -1;
    }
}
