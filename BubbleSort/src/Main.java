public class Main {
    public static void main(String[] args) {
        int array[]={5,2,1,3,4};
        for (int x:array){
            System.out.print(x+" ");
        }
        System.out.println();
        bubbleSort bubblesort=new bubbleSort();
        bubblesort.sort(array);
    }
}