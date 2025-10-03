package leetcode;
import java.util.*;
class TwoSum{
    public static int[] twosum(int target, int arr[]){
        for(int i = 0 ; i<arr.length; i++){
            for(int j = i+1; j < arr.length; j++ ){
                if(arr[i] +arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
public static void main (String[] args ){
    Scanner sc = new Scanner(System.in);
    int Arr[] ={1,4,5,4,3,5,6,7,8,5,9,1};
    int target = sc.nextInt();
    int result[]= twosum(target,Arr);
    System.out.println(Arrays.toString(result));    
}
}