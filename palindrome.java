import java.util.*;
public class palindrome {
    public static int pal(int n){
        int rev = 0;
        int temp = n;
        while(temp > 0){
            rev = rev*10 + temp%10;
            temp = temp/10;
        }
        return rev;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int result = pal(n);
            System.out.println(result);

        
    }
    
}
