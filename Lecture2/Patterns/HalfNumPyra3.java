import java.util.Scanner;

public class HalfNumPyra3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A rows: ");
        int n= sc.nextInt();
        int i=1;
        int val=1;
        while(i<=n){
            int space=1;
            while(space<=n-i) {
                System.out.print(" ");
                space++;
            }
            int j=1;
           while(j<=i) {
            System.out.print(val);
            val++;
            j++;
           }
           
           System.out.println();
            i++;
        }
    }
}
