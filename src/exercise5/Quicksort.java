package exercise5;
import java.util.Arrays;

public class Quicksort {
  public static void quickSort(int[] list, int depth) { // determinate low and high
      quickSort(list, 0, list.length - 1, depth);
  }
  
  private static void quickSort(int[] list, int low, int high, int depth) {
      if (low < high) { // last index will be the middle element
          
          
      }
  }
  private static int MedianOfThree (int[] list, int low, int high) { // calculate the median of three (pivot)
      // the pivot is not maybe the real median of the array, but it is a good approximation
      int middle = (low + high) / 2; // middle index
      if (list[low] > list[middle]) { // in case the low is greater than the middle
          Swap(list, low, middle);
      }
      if (list[low] > list[high]) { // in case the high is less than the low
          Swap(list, low, high);
      }
      if (list[middle] > list[high]) {
          Swap(list, middle, high);
      }
      
      return list[middle];
  }

  private static int Partition(int[] list, int low, int high, int pivot) {
      // low is the first index of the array and high is the last index of the array
      int i = low;
      int j = low + 1;
      while (j <= high) {
          if (list[j] < pivot) { // in case is the pivot it will be in the middle
            Swap(list, i, j);
            i++;
          }
          j++;
      }
      ++i;
      Swap(list, i, low); // Mover el pivote a su posición final
    
      return i; // return the index of the partition element
  }

  public static void Swap(int[] arr, int i, int j) { // funcion pa ahorrar texto
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

  public static void main(String[] args) {
      int[] list = { 50, 27, 37, 53, 14, 59, 67, 70, 34, 80 };
      System.out.println("Middle: " + MedianOfThree(list, 0, 9));
      // Partition(list, 0, 9, MedianOfThree(list, 0, 9));
  }

    
}
