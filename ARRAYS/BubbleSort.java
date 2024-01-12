package ARRAYS;

public class BubbleSort {
    public static void main(String[] args) {
        // bubble sort
        int arr[] = { 1, 9, 5, 3, 7, 4 };

        // time complexity = 0(n^2);
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }

            }
        }
        for (int el : arr) {
            System.out.println(el);
        }
    }

}
