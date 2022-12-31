public class SelectionSort1 {

    public static void selection_sort(int []input ) {
        for(int i=0; i<input.length-1; i++) {
            int min= input[i];
            int minIndex= i;
            for(int j=i+1; j<input.length; j++) {
                if(input[j]<min) {
                    min=input[j];
                    minIndex=j;
                }
            }
                if(minIndex !=i){ 
                    input[minIndex]=input[i ];
                    input[i]=min;
                }
        }
    }
    public static void main(String[] args) {
        int [] arr= {2,5,3,6,9};
        selection_sort(arr);
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
