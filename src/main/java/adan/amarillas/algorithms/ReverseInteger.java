package adan.amarillas.algorithms;

public class ReverseInteger {

  public static int reverseInteger(int x) {
    int rev = 0;

    while (x != 0) {
      // pop last digit (value is negative if x is negative)
      int pop = x % 10;

      // remove last digit
      x /= 10;

      // check if adding digit will violate 32-bit signed integer range
      // 7 and -8 come from the fact that those are the last digits of Integer's MAX_VALUE and MIN_VALUE
      if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && pop > 7) ||
          rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
        return 0;
      }

      rev = (rev * 10) + pop;
    }

    return rev;
  }
}
