import java.util.*;

public class SqurePattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a Row Num: ");
        int n= sc.nextInt();

        int i=1;
        while(i<=n) {
            int j=1;
            while(j<=n) {
                System.out.print(n);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}