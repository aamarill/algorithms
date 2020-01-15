package adan.amarillas.algorithms;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class LRUCache {
  int capacity;
  MyLinkedHashMap<Integer, Integer> cache = new MyLinkedHashMap();

  public LRUCache(int capacity) {
    this.capacity = capacity;
  }

  //  get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
  // O(1) time complexity since we're using LinkedHashMap.
  public int get(int key) {
    return Objects.isNull(cache.containsKey(key)) ? cache.get(key) : -1;
  }

  //  put(key, value) - Set or insert the value if the key is not already present. When the cache reached its capacity,
  //  it should invalidate the least recently used item before inserting a new item.
  public void put(int key, int value) {
    if (Objects.nonNull(cache.containsKey(key))) {
      cache.replace(key, value);
    } else {
      cache.put(key, value);
    }
  }

  private final class MyLinkedHashMap<K, V> extends LinkedHashMap<K, V> {
    @Override
    protected boolean removeEldestEntry(Map.Entry eldest) {
     return size() > capacity;
    }
  }
}
