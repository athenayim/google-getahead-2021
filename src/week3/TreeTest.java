package week3;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.Test;

public class TreeTest {
  Tree leaf1 = new Tree(4, List.of());
  Tree leaf2 = new Tree(3, List.of());
  Tree leaf3 = new Tree(15, List.of());
  Tree leaf4 = new Tree(10, List.of());
  Tree leaf5 = new Tree(12, List.of());
  Tree leaf6 = new Tree(6, List.of());

  Tree node1 = new Tree(2, List.of(leaf1));
  Tree node2 = new Tree(9, List.of(leaf3, leaf4));
  Tree node3 = new Tree(8, List.of(node2));
  Tree node4 = new Tree(7, List.of(node3, leaf5));

  Tree tree1 = new Tree(1, List.of(node1, leaf2));
  Tree tree2 = new Tree(5, List.of(leaf6, node4));

  @Test
  public void longestPathLeaf() {
    assertEquals(1, leaf1.longestPath());
    assertEquals(1, leaf2.longestPath());
    assertEquals(1, leaf3.longestPath());
    assertEquals(1, leaf4.longestPath());
    assertEquals(1, leaf5.longestPath());
    assertEquals(1, leaf6.longestPath());
  }

  @Test
  public void longestPathTrees() {
    assertEquals(1, node1.longestPath());
    assertEquals(2, node2.longestPath());
    assertEquals(3, node3.longestPath());
    assertEquals(4, node4.longestPath());

    assertEquals(2, tree1.longestPath());
    assertEquals(4, tree2.longestPath());
  }
}
