// prime number 
import java.util.*;
public class prime_number {
    public static boolean isprime(int num){
    for(int i = 2; i <= num/2 ; i++ ){
        if(num%i ==0){
            return false;
        }
    }
    return true;
}
public static void main(String[] args) {
    

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(isprime(n)){
        System.out.println("prime number");
    }
     else{
        System.out.println("not prime number");
    };

    
}
}
