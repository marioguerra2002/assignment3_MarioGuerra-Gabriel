package exercise4;

public class Heapsort {
  private int[] list_to_sort;
  private int heap_size;
  Heapsort (int[] list) {
    list_to_sort = new int[list.length + 1];  
    // first position is not used, so we need to add 1 to the length of the list (evoid index out of bound)
    for (int i = 0; i < list.length; i++) {
      list_to_sort[i + 1] = list[i];
    }
    heap_size = list_to_sort.length - 1;

  }
  
  public void Sink(int iterator) {
    while (iterator * 2 <= heap_size) {
      int child = iterator * 2; // left child
      if (child < heap_size && list_to_sort[child] < list_to_sort[child + 1]) {  // check if right child is bigger
        child++;
      }
      if (!(list_to_sort[iterator] < list_to_sort[child])) { // check if the parent is bigger than the child
        break;
      }
      // in case the parent is smaller than the child, we need to swap them
        int temp = list_to_sort[iterator];
        list_to_sort[iterator] = list_to_sort[child];
        list_to_sort[child] = temp;
        iterator = child;
    }
  }
  // the biggest element is the root of the heap, so we need to swap it with the last element to order
  public void Sort() {
    int iterator = heap_size / 2;
    while (iterator >= 1) {
      Sink(iterator);
      iterator--; 
    }
    while (heap_size > 1) {
      int temp = list_to_sort[1];
      list_to_sort[1] = list_to_sort[heap_size];
      list_to_sort[heap_size] = temp;
      heap_size--;
      // we need to sink the new root, that whould be the biggest element
      Sink(1);
    }
  }
  public void println() {
    for (int i = 1; i < list_to_sort.length; i++) {
      System.out.print(list_to_sort[i] + " ");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int[] list = { 1,4,8,2,5,9,3,7,6 };
    Heapsort h = new Heapsort(list);
    h.Sort();
    h.println();
    
    
    
  }

  
}
