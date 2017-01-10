package FizzBuzzMaker;

import FizzBuzzChecker.FizzBuzzChecker;

/**
 * Created by jxli on 11/01/2017.
 */
public class FizzBuzzMaker {
  public static String makeString(int given) {
    if (FizzBuzzChecker.isFizz(given)) {
      return "Fizz";
    }
    if (FizzBuzzChecker.isBuzz(given)) {
      return "Buzz";
    }
    return String.valueOf(given);
  }
}
