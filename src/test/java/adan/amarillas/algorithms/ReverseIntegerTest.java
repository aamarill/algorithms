package adan.amarillas.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseIntegerTest {

  @Test
  public void positive_integer() {
    int x = 12345;
    int rev = ReverseInteger.reverseInteger(x);

    assertEquals(54321, rev);
  }

  @Test
  public void negative_integer() {
    int x = -12345;
    int rev = ReverseInteger.reverseInteger(x);

    assertEquals(-54321, rev);
  }

  @Test
  public void too_large_integer() {
    int x = 2147483647;
    int zero = ReverseInteger.reverseInteger(x);

    assertEquals(0, zero);
  }

  @Test
  public void too_small_integer() {
    int x = -2147483647;
    int zero = ReverseInteger.reverseInteger(x);

    assertEquals(0, zero);
  }
}
