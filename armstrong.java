import java.util.*;
public class armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int count = 0;
        int temp =n;
        while(temp>0){
             temp = temp / 10;

            count++;
        }
        int sum = 0;
        temp=n;
        while(temp>0){
            int rem = temp % 10;
            sum += Math.pow(rem,count);
            temp = temp/10;
        }
        if(sum == n){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("not armstrong");
        }


    }
    
}
