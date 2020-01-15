package adan.amarillas.algorithms.LRU;

public class MyLinkedList<T> {

  private MyNode<T> head;
  private MyNode<T> tail;

  public MyLinkedList(){
    this(null, null);
  }
  public MyLinkedList(MyNode<T> head, MyNode<T> tail){
    this.head = head;
    this.tail = tail;
  }

  public void addToFront(T value){
    MyNode<T> head = new MyNode(null, value, this.head);
    this.head = head;
  }

  public void removeNode(MyNode<T> node){

  }
}
