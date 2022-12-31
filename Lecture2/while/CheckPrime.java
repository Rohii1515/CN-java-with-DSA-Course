import java.util.*;

public class CheckPrime {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to check prime or not: ");
    int n= sc.nextInt();
        int  div  = 2;
        
             while (div <= n / 2) {
      // condition for nonprime number
                 if (n % div == 0) {
                        System.out.println("Composite");
                            return;
                     }

                 div=div+1;
                 }

            
             System.out.println(n + " is a prime number.");
        sc.close();      
     }

}

