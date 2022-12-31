

public class Binary {
    public static int binaryserch(int arr[],int elem) {
        int start =0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = (start+end)/2;
            if(elem==arr[mid]) {
                return mid;
            }
            else if(elem>arr[mid]) {
                start=mid+1;
            }
            else {
                start= mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int array[]={1,3,5,7,10,15,20,25,30,38,40};
        int index=binaryserch(array, 20);
        System.out.println(index);
    }
}
