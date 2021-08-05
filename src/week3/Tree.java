package week3;

import java.util.List;

public class Tree {
  private final int value;
  private final List<Tree> children;

  public Tree(int value, List<Tree> children) {
    this.value = value;
    this.children = children;
  }

  public int longestPath() {
    return longestPathAux(this, 1, 1);
  }

  // Returns the longest path of consecutive integers from a tree node.
  public int longestPathAux(Tree node, int currentLength, int currentMax) {
    if (node.children().isEmpty()) {
      return currentMax;
    }

    int maxLength = currentMax;

    for (Tree child : node.children()) {
      if (child.value() == node.value() + 1) { // Next integer is consecutive, add 1 to current length and update max
        maxLength = Math.max(longestPathAux(child, currentLength + 1, Math.max(currentLength + 1, currentMax)), maxLength);
      } else { // Next integer not consecutive, reset current length counter
        maxLength = Math.max(longestPathAux(child, 1, currentMax), maxLength);
      }
    }
    return maxLength;
  }

  public int value() {
    return value;
  }

  public List<Tree> children() {
    return children;
  }
}
