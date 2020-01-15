package adan.amarillas.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LRUCacheTest {

  @Test
  public void least_recently_used_gets_pushed_out(){
    LRUCache cache = new LRUCache(3);
    cache.put(11, 5);
    cache.put(67, 8);
    cache.put(99, 4);
    cache.put(88, 7);
    Integer value = cache.get(11);
    Integer expected = -1;
    assertEquals(expected, value);
  }

  @Test
  public void return_neg_one_when_value_is_not_present(){
    LRUCache cache = new LRUCache(1);
    Integer value = cache.get(1);
    Integer expected = -1;
    assertEquals(expected, value);
  }

  @Test
  public void get_moves_an_item_to_front(){
    LRUCache cache = new LRUCache(3);
    cache.put(11, 5);
    cache.put(67, 8);
    cache.put(99, 4);
    cache.get(11);
    cache.put(88, 7);
    Integer value = cache.get(67);
    Integer expected = -1;
    assertEquals(expected, value);
  }
}
