package adan.amarillas.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstRepeatingCharTest {

  @Test
  public void string_has_repeating_char() {
    String str = "abcdefbj1lm5lm";
    String firstRepeatedChar = FirstRepeatingChar.firstRepeatingChar(str);

    Assertions.assertEquals("b", firstRepeatedChar);
  }

  @Test
  public void string_has_no_repeating_char() {
    String str = "1234567890abcdefg";
    String firstRepeatedChar = FirstRepeatingChar.firstRepeatingChar(str);

    Assertions.assertEquals("", firstRepeatedChar);
  }

}
