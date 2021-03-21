package adan.amarillas.algorithms;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QueueTest {

  Queue queue;

  @BeforeEach
  void createQueue(){
    queue = new Queue();
  }

  @Test
  void given5Adds_whenRemove_thenReturnNodesInOrder(){
    ListNode node1 = new ListNode();
    ListNode node2 = new ListNode();
    ListNode node3 = new ListNode();
    ListNode node4 = new ListNode();

    queue.add(node1);
    queue.add(node2);
    queue.add(node3);
    queue.add(node4);

    assertEquals(node1, queue.remove());
    assertEquals(node2, queue.remove());
    assertEquals(node3, queue.remove());
    assertEquals(node4, queue.remove());
  }

}
