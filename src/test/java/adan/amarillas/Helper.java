package adan.amarillas;

import java.util.concurrent.ThreadLocalRandom;

public class Helper {

  public int[] arrayOfRandomLengthAndRandomInts() {
    int arraySize = ThreadLocalRandom.current().nextInt(10, 100 + 1);
    int[] unsortedArray = new int[arraySize];
    for (int i = 0; i < arraySize; i++) {
      unsortedArray[i] = ThreadLocalRandom.current().nextInt(-100, 100 + 1);
    }
    return unsortedArray;
  }
}
