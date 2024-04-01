//Sorting algorithms

//selection sort

class HelloWorld {
    public static void main(String[] args) {
       int arr[]={6,7,5,1,23,2};
       sorting sort=new sorting();
       for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
       sort.selectionsort(arr);
       
       
    }
}
class sorting{
    public void selectionsort(int [] arr){
        int min_index;
        for(int i=0;i<arr.length;i++){
            min_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_index]>arr[j]){
                    min_index=j;
                }
                
            }
            int temp=arr[min_index];
            arr[min_index]=arr[i];
            arr[i]=temp;
            
        }
        for(int y:arr){
            System.out.print(y+" ");
        }
    }
}

//Bubble sort


class HelloWorld {
    public static void main(String[] args) {
       int arr[]={6,7,5,1,23,2};
       sorting sort=new sorting();
       for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
       sort.bubblesort(arr);
       
       
    }
}
class sorting {
    public void bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
                
            }
            
            
        }
        for(int y: arr){
            System.out.print(y+" ");
        }
        
    }
}

//insertion sort

class HelloWorld {
    public static void main(String[] args) {
       int arr[]={6,7,5,1,23,2};
       sorting sort=new sorting();
       for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
       sort.insertionsort(arr);
       
       
    }
}
class sorting {
    public void insertionsort(int[] arr){
        for(int i=1;i<arr.length;i++){
            for(int j=i-1;j<arr.length;j--){
                if(j>=0 &&arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                   
                }  
                else{
                    break;
                }
                }
        }
       
       
       
        for(int y: arr){
            System.out.print(y+" ");
        }
        
    }
}

//quick sort

class HelloWorld {
    public static void main(String[] args) {
       int arr[]={6,7,5,1,23,2};
       sorting sort=new sorting();
       for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
       sort.quicksort(arr,0,arr.length-1);
       for(int y:arr){
            System.out.print(y+" ");
        }
       
       
       
    }
}
class sorting {
    public void quicksort(int[] arr,int low,int high){
        if(low <high){
            int partion_index=partition(arr,low,high);
            partition(arr,low,partion_index-1);
            partition(arr,partion_index+1,high);
            
            
        }
        
    }
    public int partition(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low ;j<high;j++){
            if(arr[j]<=pivot){
                i++;
               int temp= arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        
        return i+1;
        
    }
}


//merge sort

class HelloWorld {
    public static void main(String[] args) {
       int arr[]={6,7,5,1,23,2};
       Sorting sort=new Sorting();
       for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
       sort.mergeSort(arr);
    }
}

class Sorting {
    public void mergeSort(int[] arr){ 
        if (arr.length < 2) {
            return;
        }
        
        int mid=arr.length/2;
        int[] left=new int[mid];
        int[] right=new int[arr.length-mid];
        System.arraycopy(arr,0,left,0,left.length);
        System.arraycopy(arr,mid,right,0,right.length);
        mergeSort(left);
        mergeSort(right);
        merge(left,right,arr);
    }
    
    public void merge(int[] left,int[] right,int[] arr){
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                arr[k]=left[i];
                i++;
            }
            else{
                arr[k]=right[j];
                j++;
            }
            k++;
        }
        while(i<left.length){
            arr[k]=left[i];
            i++;
            k++;
        }
        while(j<right.length){
            arr[k]=right[j];
            j++;
            k++;
        }
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println(); 
    }
}








