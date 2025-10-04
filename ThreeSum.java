import java.util.*;
public class ThreeSum {
    public static int[] threesum(int arr[],int target) {
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                for(int k = j+1;k< arr.length; k++){
                    if(arr[i]+arr[j]+arr[k] == target){
                        return new int[] {i, j, k};
                    }
                }
            }
        }
        return new int[] {-1,-1,-1};

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int Arr[] ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int[] result = threesum(Arr,target);
        System.out.println(Arrays.toString(result));

    }
    
}
