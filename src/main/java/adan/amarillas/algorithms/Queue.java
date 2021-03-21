package adan.amarillas.algorithms;

public class Queue {

  ListNode head;

  public void add(ListNode newTail){
    if (head == null) {
      head = newTail;
      return;
    }

    ListNode tempHead = head;
    while (tempHead.next != null) {
      tempHead = tempHead.next;
    }

    tempHead.next = newTail;
  }

  public ListNode remove(){
    // head --> ln1 --> ln2 --> etc...

    if(head == null) return null;

    ListNode oldHead = head;
    ListNode newHead = head.next;
    head = newHead;
    return oldHead;
  }

}
