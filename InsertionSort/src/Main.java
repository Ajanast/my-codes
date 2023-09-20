public class Main {
    public static void main(String[] args) {
        int array[]={5,3,4,1,2};
        for(int y:array){
            System.out.print(y+" ");
        }
        System.out.println();
        insertionSort insertionsort=new insertionSort();
        insertionsort.sort(array);
    }
}