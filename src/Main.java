import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int [] arr = {3, 1, 5, 2, 4};
        System.out.println(Arrays.toString(arr));
        doBubblesort(arr);
        for (int element: arr){
            System.out.print(element + " ");
        }
    }

    private static void doBubblesort(int[] arr) {
        for (int i = 0; i <arr.length;i++){
            for (int j = 1; j < arr.length; j++){
                if(arr[j-1]>arr[j]){
                    swapElements(arr, j-1,j);
                }
            }
        }
    }

    private static void swapElements(int[] arr, int a, int b) {
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]= temp;
    }
}