package comp110.lecture19;

public class InsertionSort {

  public static void main(String[] args) {

    int[] a = new int[] { 6, 7, 1, 5, 3 };

    // for each sequential index i in array a
    for (int i = 0; i < a.length; i++) {

      // 1. Initialize an index variable j to begin at i
      int j = i;

      // 2. While j - 1 is a valid index AND
      //    a[j - 1] should come after a[j]

      // 2.1 Swap a[j-1] with a[j]

      // 2.2 Decrease j by 1

    }

    InsertionSort.print(a);
  }

  public static void print(int[] a) {
    for (int n : a) {
      System.out.println(n);
    }
  }

}
