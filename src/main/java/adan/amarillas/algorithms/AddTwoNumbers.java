package adan.amarillas.algorithms;

public class AddTwoNumbers {

  /*
    You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
    You may assume the two numbers do not contain any leading zero, except the number 0 itself.
*/

  public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode l3 = new ListNode();
    ListNode tempNode = l3;
    int carry = 0;

    while(l1 != null || l2 != null){

      // treat nulls as zeros
      int x = l1 == null ? 0:l1.val;
      int y = l2 == null ? 0:l2.val;

      int sum = x + y + carry;
      carry = sum / 10;

      tempNode.next = new ListNode(sum % 10);
      tempNode = tempNode.next;

      if(l1 != null) l1 = l1.next;
      if(l2 != null) l2 = l2.next;
    }

    if (carry > 0){
      tempNode.next = new ListNode(carry);
    }

    return l3.next;
  }

}
