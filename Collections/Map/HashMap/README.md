# HashMap

* Hash table based implementation of the Map interface. 
* Null values are allowed
* Duplicate keys are not allowed, but duplicate values are allowed
* Insert order is not preserved.
* This implementation provides constant-time performance for the basic operations (get and put), assuming the hash function disperses the elements properly among the buckets
* implementation is not synchronized.
* Serializable & Cloneable, Randomized.

## Constructors
|   Constructor | Description|
|---------------|------------|
|HashMap()|Constructs an empty HashMap with the default initial capacity (16) and the default load factor (0.75).|
|HashMap(int initialCapacity)|Constructs an empty HashMap with the specified initial capacity and the default load factor (0.75).|
|HashMap(int initialCapacity, float loadFactor)|Constructs an empty HashMap with the specified initial capacity and load factor.|
|HashMap(Map<? extends K,? extends V> m)|Constructs a new HashMap with the same mappings as the specified Map.|


## Methods

| Return type| Method| Description |
|------------|--------|------------|
|void	| clear() | Removes all of the mappings from this map.|
|Object	| clone() | Returns a shallow copy of this HashMap instance: the keys and values themselves are not cloned.|
|boolean | containsKey(Object key) | Returns true if this map contains a mapping for the specified key.|
|boolean |containsValue(Object value) | Returns true if this map maps one or more keys to the specified value.|
|Set<Map.Entry<K,V>> | entrySet() | Returns a Set view of the mappings contained in this map.|
| Set<K>	| keySet()|Returns a Set view of the keys contained in this map.|
|V	|get(Object key)|Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.|
|V	|getOrDefault(Object key, V defaultValue) |Returns the value to which the specified key is mapped, or defaultValue if this map contains no mapping for the key.|
|boolean | isEmpty() | Returns true if this map contains no key-value mappings.|
|V	| put(K key, V value) |Associates the specified value with the specified key in this map.|
|V	| remove(Object key) | Removes the mapping for the specified key from this map if present.|
| V	| replace(K key, V value) | Replaces the entry for the specified key only if it is currently mapped to some value.|
|int	| size() | Returns the number of key-value mappings in this map.|
| Collection<V>	| values() |Returns a Collection view of the values contained in this map.|
