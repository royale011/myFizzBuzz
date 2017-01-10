import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by jxli on 11/01/2017.
 */
public class MainTest {
  @Test
  public void should_FizzBuzz_return_string_1_given_1() {
    // given
    int given = 1;
    // when
    String result = Main.getFizzBuzzQueue(given);
    // then
    assertThat(result, is("1"));
  }
}