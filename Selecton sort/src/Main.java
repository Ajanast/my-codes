public class Main {
    public static void main(String[] args) {
        int array[]={5,3,1,2,4};
        selectionSort selectionsort=new selectionSort();
        for(int x:array){
            System.out.print(x+" ");
        }
        System.out.println();
        selectionsort.sort(array);
    }
}