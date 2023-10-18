package exercise3;

import java.util.Arrays;

public class Insertsort {
    
    public static void InsertSort(int[] list_to_sort) {
        for (int i = 1; i < list_to_sort.length; i++) {
          for (int j = i; j > 0; j--) { // start from i and go back to 0
            if (list_to_sort[j] < list_to_sort[j - 1]) { 
              // in case of next element is smaller than previous one, swap them
              int temp = list_to_sort[j];
              list_to_sort[j] = list_to_sort[j - 1];
              list_to_sort[j - 1] = temp;
            } else {
              break;
            }
          }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 5, 2, 4, 6, 1, 3 };
        System.out.println(Arrays.toString(arr));
        InsertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}