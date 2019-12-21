package adan.amarillas.algorithms;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class FizzBuzzTest {

  @Test
  public void list_of_10() {
    String[] result = FizzBuzz.process(3, 9, 10);
    String[] expected = {"1", "2", "fizz", "4", "5", "fizz", "7", "8", "fizzbuzz", "10"};
    assertTrue(Arrays.equals(result, expected));
  }
}
