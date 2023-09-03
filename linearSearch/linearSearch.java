//1D array
/*
public class linearSearch {
    public int search(int arr[],int target){
        int i=-1;
        for(int j=0;j<arr.length;j++){
            if (arr[j]==target) {
                i=j;
                break;
            }

        }
        return i;
    }
}
*/
//2D array
public class linearSearch{
    public static int[] search(int arr[][],int target){
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
            return new int[]{-1,-1};
        }
}