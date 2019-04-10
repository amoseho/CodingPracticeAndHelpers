package src.examSources;

/*
Design and implement a data structure for Least Recently Used (LRU) cache.
It should support the following operations: get and put.

get(key) - Get the value (will always be positive) of the key if the key exists in the cache, otherwise return -1.
put(key, value) - Set or insert the value if the key is not already present.
When the cache reached its capacity, it should invalidate the least recently used item before inserting a new item.

Follow up:
Could you do both operations in O(1) time complexity?

Example:

LRUCache cache = new LRUCache( 2  /* the capacity /* );

		cache.put(1, 1);
		cache.put(2, 2);
		cache.get(1);       // returns 1
		cache.put(3, 3);    // evicts key 2
		cache.get(2);       // returns -1 (not found)
		cache.put(4, 4);    // evicts key 1
		cache.get(1);       // returns -1 (not found)
		cache.get(3);       // returns 3
		cache.get(4);       // returns 4
 */
public class LRUCache
{
	public LRUCache(int capacity)
	{

	}

	//Returns value.
	//Expectation: Value returned is always positive.
	//If not found, returns negative 1.
	public int get(int key)
	{
		//find it
		//TODO: Logic
		//if found, return value
		//else return -1;
		return 0;
	}

	public void put(int key, int value)
	{
		//Are we at capacity?
		//If so, calculate the least old
			//delete it
			//recalculate or replace least-old with 2nd-least old

		//At this point we should have capacity whether or not the above occurred
		//Add the item normally.
	}
}
