package week2;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberAsWordsTest {
  NumberAsWords converter = new NumberAsWords();

  @Test
  public void singleDigitNumbers() {
    String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

    for (int i = 0; i < 10; i++) {
      assertEquals(digits[i], converter.spellNumber(i));
    }
  }

  @Test
  public void largeNumbers() {
    assertEquals("two hundred thirty four", converter.spellNumber(234));
    assertEquals("three billion eight hundred thirty five million two hundred seventeen thousand five hundred ninety five",
        converter.spellNumber(3835217595L));
  }

  @Test
  public void zeroInNumber() {
    assertEquals("one hundred one", converter.spellNumber(101));
  }

  @Test
  public void consecutiveZeros() {
    assertEquals("nineteen billion one", converter.spellNumber(19000000001L));
  }
}
