package week4;

import java.util.Arrays;
import java.util.List;

public class CarPlatesDictionary {

  // Finds the shortest word in the vocabulary list containing all the letters from the carPlate string
  public String findShortestWord(String carPlate, List<String> vocabulary) {
    int shortestLen = 0;
    String shortest = "";

    int[] charCount = getCharCount(carPlate);
    for (String word : vocabulary) {
      if (containsAllChars(word, charCount)) {
        if (shortestLen == 0 || word.length() < shortestLen) {
          shortestLen = word.length();
          shortest = word;
        }
      }
    }
    return shortest;
  }

  // Checks if string contains all characters provided in the charCount array
  public boolean containsAllChars(String s, int[] charCount) {
    int[] counts = Arrays.copyOf(charCount, charCount.length);
    for (int i = 0; i < s.length(); i++) {
      int currChar = s.charAt(i) - 'a';
      if (counts[currChar] > 0) {
        counts[currChar]--;
      }
    }
    for (int count : counts) {
      if (count > 0) {
        return false;
      }
    }
    return true;
  }

  // Returns only letters from a string
  public String getLetters(String s) {
    return s.replaceAll("[^a-zA-Z]", "");
  }

  // Returns frequencies of characters in a string
  public int[] getCharCount(String s) {
    String letters = getLetters(s).toLowerCase();
    int[] charCount = new int[26];
    for (int i = 0; i < letters.length(); i++) {
      int currChar = letters.charAt(i) - 'a';
      charCount[currChar]++;
    }
    return charCount;
  }

  // Provides string representation of character counts
  public void showCharCounts(int[] charCount) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < charCount.length; i++) {
      sb.append((char) (i + 'a')).append(": ").append(charCount[i]).append("\n");
    }
    System.out.println(sb.toString());
  }
}
