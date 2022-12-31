import java.util.*;

public class IsPrime {

    //creating method here to check wether a num is prime or not;
public static boolean isPrime(int n) {
    for(int i=1; i<=n; i++) {
        if(n%2==0) {
            return false;
        }
        
    }
    return true;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number to check is prime or Not: ");
        int num=sc.nextInt();
        boolean ans= isPrime(num);
        System.out.println(ans);
    }
    
}
