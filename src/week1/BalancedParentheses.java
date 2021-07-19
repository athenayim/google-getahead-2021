package week1;

import java.util.Stack;

public class BalancedParentheses {
  public int longestBalanced(String str) {
    Stack<Character> stack = new Stack();
    int longestBalanced = 0;
    int currentBalanced = 0;

    for (int i = 0; i < str.length(); i++) {
      char curr = str.charAt(i);
      if (curr == '(') {
        // Reset stack and counter at a starting opening bracket
        if (i > 0 && str.charAt(i - 1) == ')') {
          stack.clear();
          if (currentBalanced > longestBalanced) {
            longestBalanced = currentBalanced;
          }
          currentBalanced = 0;
        }
        stack.push(curr);
      } else if (curr == ')') {
        if (!stack.empty()) {
          stack.pop();
          currentBalanced += 2;
        } else {
          // Reset counter if all opening brackets popped from stack
          if (currentBalanced > longestBalanced) {
            longestBalanced = currentBalanced;
          }
          currentBalanced = 0;
        }
      }
    }
    if (currentBalanced > longestBalanced) {
      longestBalanced = currentBalanced;
    }
    return longestBalanced;
  }
}