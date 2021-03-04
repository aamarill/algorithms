package adan.amarillas.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddTwoNumbersTest {

  @Test
  void givenTwoLists_whenAddTwoNumbers_thenCorrectSum(){
    ListNode zero = new ListNode(0);
    ListNode l1 = new ListNode(2);
    ListNode three = new ListNode(3);
    ListNode four1 = new ListNode(4);
    ListNode four2 = new ListNode(4);
    ListNode l2 = new ListNode(5);
    ListNode six = new ListNode(6);
    ListNode result = new ListNode(7);
    ListNode eight = new ListNode(8);

    l1.next = four1;
    four1.next = three;
    l2.next = six;
    six.next = four2;

    result.next = zero;
    zero.next = eight;

    ListNode sum = AddTwoNumbers.addTwoNumbers(l1, l2);

    for(int i=0; i<=2;i++){
      assertEquals(sum.val, result.val);
      sum = sum.next;
      result = result.next;
    }

  }
}
