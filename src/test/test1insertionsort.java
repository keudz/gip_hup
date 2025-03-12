package test;


        public class test1insertionsort {
            public static void insertionSort(int[] array) {
                for (int i = 1; i < array.length; i++) {
                    int key = array[i];


                    // Di chuyển các phần tử lớn hơn key về phía sau
                    int j;
                    for (j = i - 1; j >= 0 ; j--) {
                        if(array[j] > key) {
                            array[j+ 1] = array[j];
                        }
                        else
                            break;
                    }
                        array[j+1] = key;



                }
            }
            public static void main(String[] args) {
                int []arr = {12, 11, 13, 5, 6};
                insertionSort(arr);
                for(int i : arr){
                    System.out.print(i + " ");
                }
            }
        }
