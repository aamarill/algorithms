package adan.amarillas.algorithms;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingChar {

  public static String firstRepeatingChar(String str) {

    Map<String, Boolean> prevChars = new HashMap();
    String firstRepeatedChar = "";

    for (int i = 0; i < str.length(); i++) {
      String c = String.valueOf(str.charAt(i));

      if (prevChars.containsKey(c)) {
        firstRepeatedChar = c;
        break;
      } else {
        prevChars.put(c, true);
      }
    }

    return firstRepeatedChar;
  }
}
