import java.util.*;


public class Prob3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character:");
        String str= sc.nextLine();
        char ch=str.charAt(0);
        if(ch>='A' && ch<='Z') {
            System.out.println(1);
        }
        else if(ch>='a' && ch <='z') {
            System.out.println(0);
        }
        else {
            System.out.println(-1);
        }
    }
}
