package adan.amarillas.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {

  Stack stack;

  @BeforeEach
  void createStack(){
    stack = new Stack();
  }

  @Test
  void given2NodesPushed_whenPeek_thenSecondLastNodePushed(){
    ListNode node1 = new ListNode();
    node1.val = 1;
    ListNode node2 = new ListNode();
    node2.val = 2;

    stack.push(node1);
    stack.push(node2);

    ListNode top = stack.peek();
    assertEquals(top, node2);
  }

  @Test
  void given4NodesPushedAnd1Pop_whenPeek_thenReturn3rdNodePushed(){
    ListNode node1 = new ListNode();
    node1.val = 1;
    ListNode node2 = new ListNode();
    node2.val = 2;
    ListNode node3 = new ListNode();
    node3.val = 3;
    ListNode node4 = new ListNode();
    node4.val = 4;

    stack.push(node1);
    stack.push(node2);
    stack.push(node3);
    stack.push(node4);

    stack.pop();

    assertEquals(stack.peek(), node3);
  }

  @Test
  void given4NodesPushed_whenPop_thenReturnLastNodePushed(){
    ListNode node1 = new ListNode();
    node1.val = 1;
    ListNode node2 = new ListNode();
    node2.val = 2;
    ListNode node3 = new ListNode();
    node3.val = 3;
    ListNode node4 = new ListNode();
    node4.val = 4;

    stack.push(node1);
    stack.push(node2);
    stack.push(node3);
    stack.push(node4);

    assertEquals(stack.pop(), node4);
  }

}
