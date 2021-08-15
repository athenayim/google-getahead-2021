package week2;

public class NumberAsWords {
  String[] digits = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
  String[] teens = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
  String[] multiplesOfTen = {"", "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
  String[] powersOfTen = {"hundred", "thousand", "million", "billion", "trillion", "quadrillion", "quintillion"};

  public String spellNumber(long num) {
    StringBuilder sb = new StringBuilder();

    char[] numAsString = Long.toString(num).toCharArray();
    int len = numAsString.length;

    if (len == 1) {
      return digits[(int) num];
    }

    int digitCounter = 0;
    while (digitCounter < len) {
      if (len >= 3) {
        if (numAsString[digitCounter] != 0) {
        }
      }
    }

    return sb.toString();
  }

  // Converts a number of up to 3 digits into words.
  private String convertSmallNumber(char[] num) {
    return "";
  }
}
