import java.util.Scanner;

public class HalfNumPyra2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A rows: ");
        int n= sc.nextInt();
        int i=1;
        int val=1;
        while(i<=n){
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
