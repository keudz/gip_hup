package test;

public class test2bubblesort {
    public static void saw(int arr[],int i){
        if(arr[i] > arr[i+1]){
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

    }
    public static int []test2bubblesort(int arr[]){
        int e = arr.length ;
        while (true) {

            for (int i = 0; i < e - 1; i++)
                saw(arr, i);
            e--;
            if (e == 0)
                return arr;

        }
    }
    public static void main(String[] args) {
        int []arr = { 54,23,64,13,7,4,7,1};
        test2bubblesort(arr);
        for( int i : arr){
            System.out.print(i + " ");
        }
    }

}
