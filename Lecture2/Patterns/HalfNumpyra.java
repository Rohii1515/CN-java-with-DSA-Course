import java.util.*;

public class HalfNumpyra {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter A rows: ");
        int n= sc.nextInt();
        int i=1;

        while(i<=n){
            
           while(j<=i) {
            System.out.print(j);
            j++;
           }
           
           System.out.println();
            i++;
        }
    }
}
