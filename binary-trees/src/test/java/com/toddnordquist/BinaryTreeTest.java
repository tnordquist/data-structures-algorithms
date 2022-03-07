package com.toddnordquist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinaryTreeTest {

  @Test
  public void givenABinaryTree_whenAddingElements_thenTreeContainsThoseElements() {

    BinaryTree bt = createBinaryTree();
    assertTrue(bt.containsNode(6));
    assertTrue(bt.containsNode(7));
    assertFalse(bt.containsNode(1));

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