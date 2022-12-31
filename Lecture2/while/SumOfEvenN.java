import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

public class SumOfEvenN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter NUmber: ");
        int n=sc.nextInt();
        int sum=0;
        int i=1;
        int count=0;
        while(i<=n) {
           if(n%2==0) {
            sum+=i;
            count++;
           }
           i++;
        }
        System.out.println("Sum Is: "+sum);
    sc.close();
    }

}
