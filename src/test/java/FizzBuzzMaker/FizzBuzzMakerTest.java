package FizzBuzzMaker;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jxli on 11/01/2017.
 */
public class FizzBuzzMakerTest {
  @Test
  public void should_makeString_return_string_1_given_1() {
    // given
    int given = 1;
    // when
    String result = FizzBuzzMaker.makeString(given);
    // then
    assertThat(result, is("1"));
  }

  @Test
  public void should_makeString_return_string_Fizz_given_3() {
    // given
    int given = 3;
    // when
    String result = FizzBuzzMaker.makeString(given);
    // then
    assertThat(result, is("Fizz"));
  }
}
