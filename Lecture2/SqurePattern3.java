import java.util.Scanner;

public class SqurePattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n= sc.nextInt();
        //4321
        //4321
        //4321
        //4321
        int i=1;
        while(i<=n) {
            int j=1;
            while(j<=n) {
                System.out.print(n-j+1);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
