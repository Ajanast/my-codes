import java.util.Iterator;

public class ArrayDemo<T> implements Iterable<T>{
     final int initialCapacity=3;
     private T arr[];
     private int size;
     int temp;
     private int capacity;
     ArrayDemo(){
         size=0;
         arr=(T[]) new Object [initialCapacity];
         capacity=initialCapacity;
     }
     public void add(T val){
         if(size==capacity){
             extendArray();
         }
         arr[size++]=val;
     }
     private void extendArray(){
         capacity*=2;
         arr=java.util.Arrays.copyOf(arr,capacity);
     }
     public void display(){
         for(T y:arr){
             System.out.print(y+" ");
         }
     }
     public void insertArraypos(int pos,T val){
      if(size==capacity){
          extendArray();
      }
      for(int i=size-1;i>=pos;i--){
          arr[i+1]=arr[i];
         }
      arr[pos]=val;
      size++;
     }
     public void delete(int pos){
         for(int i=pos+1;i<size;i++){
            arr[i-1]=arr[i];

         }
         size--;

     }
     public Iterator<T>iterator(){
         return new Iterator<T>() {
             int index=0;
             @Override
             public boolean hasNext() {
                return index<size;
             }

             @Override
             public T next() {
                 return arr[index++];
             }
         };
    }

}
