package adan.amarillas.algorithms;

import adan.amarillas.Helper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class BubbleSortTest {

  @Test
  public void sort() {
    Helper h = new Helper();
    int[] unsortedArray = h.arrayOfRandomLengthAndRandomInts();
    int[] sortedArray = BubbleSort.sort(unsortedArray);
    for (int i = 0; i < sortedArray.length - 1; i++) {
      assertTrue(sortedArray[i] <= sortedArray[i + 1]);
    }
  }
}
