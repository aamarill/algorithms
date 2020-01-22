package adan.amarillas.algorithms;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache extends LinkedHashMap<Integer, Integer> {

  private int capacity;

  public LRUCache(int capacity) {
    super(capacity, 1.1f, true); // load factor = 1.1 so that underlying array is never resized/increased.
    this.capacity = capacity;
  }

  // get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
  // O(1) time complexity since we're using LinkedHashMap.
  public int get(int key) {
    return containsKey(key) ? get(key) : -1;
  }

  // put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
  // it should invalidate the least recently used item before inserting a new item.
  public void put(int key, int value) {
    put(Integer.valueOf(key), Integer.valueOf(value));
  }

  @Override
  protected boolean removeEldestEntry(Map.Entry eldest) {
    return size() > capacity;
  }
}