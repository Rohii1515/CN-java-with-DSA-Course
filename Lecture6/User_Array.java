import java.util.*;

public class User_Array {

    public static int [] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size= sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter Arrya Elements: ");
        for(int i=0; i<size; i++) {
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void print(int arr[]) {
        int size=arr.length;
        for(int i=0; i<size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int Array[]= takeInput();
        print(Array);
    }
}
