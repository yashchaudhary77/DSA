//Java program to Find Factorial on given Number
import java.util.*; 
public class factorial {
    public static int factorial(int num){
        int factorial = 1;
        for(int i = 1; i<=num; i++){
            factorial = factorial *i;
        }
        return factorial;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = factorial(n);
        System.out.println(c);
        
    }
    
}
