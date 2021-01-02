# TreeSet

* A NavigableSet implementation based on a TreeMap, it is basically an implementation of a self-balancing binary search tree like a Red-Black Tree..
* ordering maintained by a set (ascending)
* TreeSet does not preserve the insertion order of elements but elements are sorted by keys.
* The elements are ordered using their natural ordering, or by a Comparator provided at set creation time, depending on which constructor is used.
* This implementation provides guaranteed log(n) time cost for the basic operations (add, remove and contains).
* implementation is not synchronized

## Constructor
 
|Constructor|Description|
|---------|--------------------------------|
|TreeSet()|Constructs a new, empty tree set, sorted according to the natural ordering of its elements|
|TreeSet(Collection<? extends E> c)|Constructs a new tree set containing the elements in the specified collection, sorted according to the natural ordering of its elements|
|TreeSet(Comparator<? super E> comparator)|Constructs a new, empty tree set, sorted according to the specified comparator|
|TreeSet(SortedSet<E> s)|Constructs a new tree set containing the same elements and using the same ordering as the specified sorted set|

## Methods

|Return type|Method|Description|
|---|---|---|
|boolean	| add(E e) |Adds the specified element to this set if it is not already present.|
|boolean	|addAll(Collection<? extends E> c) |Adds all of the elements in the specified collection to this set.|
|E	|ceiling(E e) |Returns the least element in this set greater than or equal to the given element, or null if there is no such element.|
|void	|clear()|Removes all of the elements from this set.|
|Object	|clone()| Returns a shallow copy of this TreeSet instance|
| Comparator<? super E>	| comparator()|Returns the comparator used to order the elements in this set, or null if this set uses the natural ordering of its elements|
|boolean	| contains(Object o)|Returns true if this set contains the specified element.|
|Iterator<E>	|descendingIterator()|Returns an iterator over the elements in this set in descending order|
|NavigableSet<E>	|descendingSet()|Returns a reverse order view of the elements contained in this set.
|E	|first()|Returns the first (lowest) element currently in this set.|
|E	|floor(E e)|Returns the greatest element in this set less than or equal to the given element, or null if there is no such element.|
|SortedSet<E>	| headSet(E toElement)|Returns a view of the portion of this set whose elements are strictly less than toElement.|
|NavigableSet<E>	|headSet(E toElement, boolean inclusive)|Returns a view of the portion of this set whose elements are less than (or equal to, if inclusive is true) toElement.|
|E	|higher(E e)|Returns the least element in this set strictly greater than the given element, or null if there is no such element.|
|boolean	|isEmpty()|Returns true if this set contains no elements.|
|Iterator<E>	|iterator()|Returns an iterator over the elements in this set in ascending order.|
|E	|last()|Returns the last (highest) element currently in this set.|
|E	|lower(E e)|Returns the greatest element in this set strictly less than the given element, or null if there is no such element.|
|E	|pollFirst()|Retrieves and removes the first (lowest) element, or returns null if this set is empty.|
|E|pollLast()|Retrieves and removes the last (highest) element, or returns null if this set is empty.|
|boolean	|remove(Object o)|Removes the specified element from this set if it is present.|
|int	|size()|Returns the number of elements in this set (its cardinality).|
|Spliterator<E>	|spliterator()|Creates a late-binding and fail-fast Spliterator over the elements in this set.|
|NavigableSet<E>	|subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive)|Returns a view of the portion of this set whose elements range from fromElement to toElement.|
|SortedSet<E>	|subSet(E fromElement, E toElement)|Returns a view of the portion of this set whose elements range from fromElement, inclusive, to toElement, exclusive.|
|SortedSet<E>	| tailSet(E fromElement)|Returns a view of the portion of this set whose elements are greater than or equal to fromElement.|
|NavigableSet<E>	|tailSet(E fromElement, boolean inclusive)|Returns a view of the portion of this set whose elements are greater than (or equal to, if inclusive is true) fromElement.|
