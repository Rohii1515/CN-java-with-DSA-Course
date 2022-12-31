import java.util.*;
public class FindLargestArray {

    public static int [] takeinputarray() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int size= sc.nextInt();
        int arr[] = new int[size];
        
        for(int i=0; i<size; i++) {
            System.out.println("Enter"+i+"Array Elements: ");
            arr[i]=sc.nextInt();
        }
        return arr;
    }

    public static void printarray(int arr[]) {
        int size= arr.length;
        for(int i=0; i<size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static int largestInArray(int arr[]) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int Array[]=takeinputarray();
        printarray(Array);
        int MaxValue= largestInArray(Array);
        System.out.println("Largest Element is: "+MaxValue);
    }
}
