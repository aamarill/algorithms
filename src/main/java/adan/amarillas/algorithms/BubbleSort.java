package adan.amarillas.algorithms;

public class BubbleSort {

  // bubbles highest value to the right
  // In place algorithm ( O(n) space complexity)
  public static int[] sort(int[] array) {
    int unsortedIndex = array.length - 1;
    while (unsortedIndex > 0) {
      for (int i = 0; i < unsortedIndex; i++) {
        if (array[i] > array[i + 1]) {
          int temp = array[i];
          array[i] = array[i + 1];
          array[i + 1] = temp;
        }
      }
      unsortedIndex--;
    }
    return array;
  }
}
