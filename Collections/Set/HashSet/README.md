# HashSet

* Serializable, Cloneable, Iterable, Collection, Set.
* HashSet implements the Set interface, baced on a Hash table.
* HashSet is unordered, it does not guarantee that the order will remain constant over time.
* HashSet allows null elements.
* This class offers constant time performance for the basic operations(add, remove, contains & size), assuming the hash function disperses the
elements properly among buckets.
* The implementation is not synchronized.

## Constructors

| Constructor | Description |
|-------------|------------|
|HashSet()    |Constructs a new, empty set; the backing HashMap instance has default initial capacity (16) and load factor (0.75).|
|HashSet(Collection<? extends E> c)|Constructs a new set containing the elements in the specified collection.|
|HashSet(int initialCapacity)|Constructs a new, empty set; the backing HashMap instance has the specified initial capacity and default load factor (0.75).|
|HashSet(int initialCapacity, float loadFactor)|Constructs a new, empty set; the backing HashMap instance has the specified initial capacity and the specified load factor.|


## Methods

| Modifier and Type |	Method | Description|
|-------------------|----------|-----------|
|boolean	| add(E e) | Adds the specified element to this set if it is not already present.|
|void	|clear()|Removes all of the elements from this set.|
|Object|	clone()|Returns a shallow copy of this HashSet instance: the elements themselves are not cloned.|
|boolean	|contains(Object o)|Returns true if this set contains the specified element.|
|boolean	|isEmpty()|Returns true if this set contains no elements.|
|Iterator<E>|	iterator()|Returns an iterator over the elements in this set.|
|boolean	|remove(Object o)|Removes the specified element from this set if it is present.|
|int|	size()|Returns the number of elements in this set (its cardinality).|
|Spliterator<E>	|spliterator()|Creates a late-binding and fail-fast Spliterator over the elements in this set.|
