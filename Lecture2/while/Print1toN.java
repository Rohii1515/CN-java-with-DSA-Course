import java.util.*;


public class Print1toN {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter to print: ");
        int Input= sc.nextInt();
        int i = 1;
        while(i<=Input) {
            System.out.println(i);
            i++;
        }
    }

    
}
