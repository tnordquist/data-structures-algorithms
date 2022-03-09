package com.toddnordquist;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinaryTreeTest {

  private BinaryTree bt;

  @BeforeEach
  void setUp() {
    bt = createBinaryTree();
  }

  @Test
  public void givenABinaryTree_whenAddingElements_thenTreeContainsThoseElements() {

    assertTrue(bt.containsNode(6));
    assertTrue(bt.containsNode(7));
    assertFalse(bt.containsNode(1));
  }

  @Test
  public void givenABinaryTree_whenDeletingElements_thenTreeDoesNotContainThoseElements() {
    assertTrue(bt.containsNode(6));
    bt.delete(6);
    assertFalse(bt.containsNode(6));
    assertEquals(7, bt.root.value);
  }

  @Test
  public void givenABinaryTree_traversingInOrder_showValuesInOrder() {
    List<Integer> list = new LinkedList<>(Arrays.asList(3, 4, 5, 6, 7, 8, 9));
    assertEquals(list, Collections.unmodifiableList(bt.traverseInOrder(bt.root)));
  }

  private BinaryTree createBinaryTree() {

    BinaryTree bt = new BinaryTree();

    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);

    return bt;
  }

}