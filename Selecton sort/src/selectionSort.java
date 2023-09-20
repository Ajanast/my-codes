public class selectionSort {
    public  void sort(int [] arr){
        int min_index;
        int temp;
        for(int i=0;i<arr.length;i++){
            min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
            }
            temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
        }
        for(int y:arr){
            System.out.print(y+" ");
        }
    }
}
