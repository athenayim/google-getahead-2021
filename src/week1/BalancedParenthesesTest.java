package week1;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

public class BalancedParenthesesTest {
  BalancedParentheses bp = new BalancedParentheses();

  @Test
  public void emptyString() {
    assertEquals(0, bp.longestBalanced(""));
  }

  @Test
  public void singleBalancedParentheses() {
    String string1 = "))))))((((((()((((";

    assertEquals(2, bp.longestBalanced(string1));
  }

  @Test
  public void multipleBalancedParentheses1() {
    String string1 = "())(()((";

    assertEquals(2, bp.longestBalanced(string1));
  }

  @Test
  public void multipleBalancedParentheses2() {
    String string1 = "())(())";
    String string2 = ")(()))))(((()";

    assertEquals(4, bp.longestBalanced(string1));
    assertEquals(4, bp.longestBalanced(string2));
  }

  @Test
  public void multipleBalancedParentheses3() {
    String string1 = ")))(((((()))))()(()))";
    assertEquals(10, bp.longestBalanced(string1));
  }
}
