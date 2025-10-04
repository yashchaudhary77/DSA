import java.util.*;
public class kth_largest_element {
    public static int largestElement(int []arr , int k){
        Arrays.sort(arr);
        for(int i = arr.length-k ; i>= 0; i--){
                return arr[i];
            
        }
        return -1;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
    int arr[] ={1,2,3,4,5,3,4,33,4,44,12345,1999};
    int k = sc.nextInt();
    int result = largestElement(arr,k);
    System.out.println(result);

}
    
}
