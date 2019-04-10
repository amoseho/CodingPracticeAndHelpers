package src.examSources;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest
{
	LRUCache cache = null;

	@Test
	void simpleGetAndPut()
	{
		cache = new LRUCache(2);

		cache.put(1, 1);
		assert cache.get(1) == 1;
	}

	@Test
	void sizeTwoCachePutOverrides_AlsoLeetCodeExample()
	{
		cache = new LRUCache( 2 /* capacity */ );

		cache.put(1, 1);
		cache.put(2, 2);
		assert cache.get(1) == 1;       // returns 1
		cache.put(3, 3);    			// evicts key 2
		assert cache.get(2) == -1;      // returns -1 (not found)
		cache.put(4, 4);    			// evicts key 1
		assert cache.get(1) == -1;      // returns -1 (not found)
		assert cache.get(3) == 3;       // returns 3
		assert cache.get(4) == 4;       // returns 4
	}
}