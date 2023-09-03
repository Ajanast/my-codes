import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       int [][]arr={{3,4,2,},
                     {4,5,7},
                     {1,10,33}};
      int result[]=linearSearch.search(arr,3);
        //System.out.println(Arrays.toString(result));
        for(int x:result){
            System.out.print(x+" ");
        }


    }
}