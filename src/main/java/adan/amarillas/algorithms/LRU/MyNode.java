package adan.amarillas.algorithms.LRU;

public class MyNode<T> {

  private T item;
  private MyNode<T> next;
  private MyNode<T> prev;

  public MyNode(MyNode<T> prev, T item, MyNode<T> next) {
    this.prev = prev;
    this.item = item;
    this.next = next;
  }

  public T getItem() {
    return item;
  }

  public MyNode<T> getPrev(){
    return prev;
  }

  public MyNode<T> getNext(){
    return next;
  }

  public void setPrev(MyNode<T> node){
    prev = node;
  }

  public void setNext(MyNode<T> node) {
    next = node;
  }
}
