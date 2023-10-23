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
  // sink is used to maintain the heap property of the list
  public void Sink(int start_pos) { // int i is the index of the element to sink
    int left_child;
    while ((2 * start_pos) <= heap_size) { // 2 * i is the left child of i
      left_child = 2 * start_pos;
      if (left_child < heap_size && list_to_sort[left_child] < list_to_sort[left_child+1]) { // if left child is smaller than right child 
        left_child += 1; // update the index of the child to swap
      }
      else if (list_to_sort[start_pos] >= list_to_sort[left_child]) { // if parent is bigger than child
        break; // if parent is bigger than child, we don't need to sink, heap property is preserved
      }
      // if parent is smaller than child, we need to swap them
      int temp = list_to_sort[start_pos];
      list_to_sort[start_pos] = list_to_sort[left_child];
      list_to_sort[left_child] = temp;
      start_pos = left_child; // update the index of the element to sink and continue
    }
    System.out.println("Sink: ");
    for (int i = 1; i < list_to_sort.length; i++) {
      System.out.print(list_to_sort[i] + " ");
    }
  }
  // onces the heap property is preserved, we can sort the list
  public void Sort(int[] list) {
    
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
    h.Sink(4);
    
    
  }

  
}
