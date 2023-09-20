public class insertionSort {
    public void sort(int arr[]){
        int temp;
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j<arr.length;j--){
                if(j>=0&&arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                else {
                    break;
                }
            }
        }
        for(int y:arr){
            System.out.print(y+" ");
        }
    }
}
