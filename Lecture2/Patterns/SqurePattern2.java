import java.util.*;
public class SqurePattern2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number ");
        int n = sc.nextInt();
        //1234
        //1234
        //1234
        //1234

        int i=1;
        while(i<=n) {
            int j=1;
            while(j<=n) {
                System.out.print(j);
                j++;
            }
            System.out.println();
            i++;
        }
        sc.close();
    }
}
