package adan.amarillas.algorithms;

public class FizzBuzz {

  public static String[] process(int fizz, int buzz, int length) {
    String FIZZ = "fizz";
    String BUZZ = "buzz";
    String[] result = new String[length];

    for (int i = 1; i <= length; i++) {
      String item = "";
      if (meetsCriteria(fizz, i)) item += FIZZ;
      if (meetsCriteria(buzz, i)) item += BUZZ;

      result[i - 1] = item.isEmpty() ? String.valueOf(i) : item;
    }

    return result;
  }

  public static Boolean meetsCriteria(int criteria, int number) {
    return number % criteria == 0;
  }
}
