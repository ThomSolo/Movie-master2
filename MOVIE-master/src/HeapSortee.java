import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HeapSortee {
  /** Heap sort method */
  public static <E> void heapSort(List<Movie> hold) {
    // Create a Heap of integers
    heapSort(hold, (e1, e2) -> ((Comparable<E>)e1).compareTo(e2));
  }
  
  /** Heap sort method */
  public static <E> void heapSort(E[] list, Comparator<E> c) {
    // Create a Heap of integers
    Heap<E> heap = new Heap<>(c);

    // Add elements to the heap
    for (int i = 0; i < list.length; i++)
      heap.add(list[i]);

    // Remove elements from the heap
    for (int i = list.length - 1; i >= 0; i--)
      list[i] = heap.remove();
  }

  /** A test method */
  public static void main(String[] args) {
    List<Movie> hold = new ArrayList<Movie>(); 
    heapSort(hold);
    for (int i = 0; i < list.length; i++)
      System.out.print(list[i] + " ");
  }
}