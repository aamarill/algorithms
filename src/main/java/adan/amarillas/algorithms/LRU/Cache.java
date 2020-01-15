package adan.amarillas.algorithms.LRU;

import java.util.HashMap;

public class Cache {

  private HashMap<Integer, MyNode<Integer>> data = new HashMap<>();
  private MyLinkedList<MyNode<Integer>> list = new MyLinkedList<>();
  private int capacity;

  public Cache(int capacity){
    this.capacity = capacity;
  }

  public void put (int key, int value) {

  }

  public int get (int key){
    return 0;
  }
}