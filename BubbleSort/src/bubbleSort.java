public class bubbleSort {
    int temp;
    public void sort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int y:arr){
            System.out.print(y+" ");
        }
    }
}
