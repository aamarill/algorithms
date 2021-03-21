package adan.amarillas.algorithms;

public class Stack {

  ListNode top;

  public void push(ListNode newTop){
    if (top == null) {
      top = newTop;
      return;
    }

    ListNode oldTop = top;
    top = newTop;
    top.next = oldTop;
  }

  public ListNode pop(){
    if(top == null) return null;

    ListNode oldTop = top;
    top = top.next;
    return oldTop;
  }

  public ListNode peek(){
    return top;
  }

}
