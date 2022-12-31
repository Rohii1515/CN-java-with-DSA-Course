import java.util.*;
public class PrintN_numbers {

    //method
    public static void printTillN(int n) {
        for(int i=1; i<=n; i++) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to print N natural numbers: ");
        int us=sc.nextInt();
        printTillN(us);
        
    }
}