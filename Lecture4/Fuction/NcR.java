import java.util.*;

import javax.xml.transform.Source;

public class NcR {
    
    public static int factorial(int n) {
        int ans=1;
        for(int i=1; i<=n; i++) {
             ans=ans*i;
            
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a N: ");
        int n=sc.nextInt();
        System.out.println("Enter a R: ");
        int r=sc.nextInt();
        int num=factorial(n);
        int Den1 =factorial(r);
        int Den2=factorial(n-r);
        int sum=num/(Den1*Den2);
        System.out.println("NcR: "+sum);
        sc.close();

    }
}
