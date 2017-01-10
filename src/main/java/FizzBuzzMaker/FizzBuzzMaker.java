package FizzBuzzMaker;

import FizzBuzzChecker.FizzBuzzChecker;

/**
 * Created by jxli on 11/01/2017.
 */
public class FizzBuzzMaker {
  public static String makeString(int given) {
    StringBuffer stringBuffer = new StringBuffer();
    if (FizzBuzzChecker.isFizz(given)) {
      stringBuffer.append("Fizz");
    }
    if (FizzBuzzChecker.isBuzz(given)) {
      stringBuffer.append("Buzz");
    }
    if (stringBuffer.length() == 0) {
      stringBuffer.append(String.valueOf(given));
    }
    return stringBuffer.toString();
  }
}
