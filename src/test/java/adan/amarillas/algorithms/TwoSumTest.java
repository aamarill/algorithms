package adan.amarillas.algorithms;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

  @Test
  public void twoSumMethodUnitTest() {
    int[] input = new int[]{2, 7, 11, 15};
    int[] output = TwoSum.twoSum(input, 9);

    assertEquals(output[0], 1);
    assertEquals(output[1], 0);
  }
}
