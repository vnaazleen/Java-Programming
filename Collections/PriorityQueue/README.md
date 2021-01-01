# PriorityQueue

* An unbounded priority queue based on a priority heap.
* he elements of the priority queue are ordered according to their natural ordering, or by a Comparator provided at queue construction time, depending on which constructor is used. 
* A priority queue does not permit null elements.
* The head of this queue is the least element with respect to the specified ordering.
* implementation is not synchronized.
*  O(log(n)) time for the enqueuing and dequeuing methods (offer, poll, remove() and add).
* linear time for the remove(Object) and contains(Object) methods.
* constant time for the retrieval methods (peek, element, and size).

## Constructors

|Constructor|Description|
|-----------|-----------|
|PriorityQueue() | Creates a PriorityQueue with the default initial capacity (11) that orders its elements according to their natural ordering|
|PriorityQueue(Collection<? extends E> c) | Creates a PriorityQueue containing the elements in the specified collection|
|PriorityQueue(Comparator<? super E> comparator) | Creates a PriorityQueue with the default initial capacity and whose elements are ordered according to the specified comparator|
|PriorityQueue(int initialCapacity) | Creates a PriorityQueue with the specified initial capacity that orders its elements according to their natural ordering|
|PriorityQueue(int initialCapacity, Comparator<? super E> comparator) | Creates a PriorityQueue with the specified initial capacity that orders its elements according to the specified comparator|
|PriorityQueue(PriorityQueue<? extends E> c) | Creates a PriorityQueue containing the elements in the specified priority queue|
|PriorityQueue(SortedSet<? extends E> c) | Creates a PriorityQueue containing the elements in the specified sorted set|


## Methods

| Return type | Method | Description |
|-------------|-----------|-----------|
|boolean      |add(E e) |Inserts the specified element into this priority queue|
|void	| clear() | Removes all of the elements from this priority queue|
|Comparator<? super E>|comparator()| Returns the comparator used to order the elements in this queue, or null if this queue is sorted according to the natural ordering of its elements.|
|boolean | contains(Object o) | Returns true if this queue contains the specified element|
|Iterator<E>| iterator() | Returns an iterator over the elements in this queue|
|boolean	| offer(E e) | Inserts the specified element into this priority queue|
|E | peek() | Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty|
|E | poll() | Retrieves and removes the head of this queue, or returns null if this queue is empty|
|boolean | remove(Object o) | Removes a single instance of the specified element from this queue, if it is present |
|int | size()| Returns the number of elements in this collection|
|Spliterator<E>	| spliterator() | Creates a late-binding and fail-fast Spliterator over the elements in this queue|
|Object[]|toArray() | Returns an array containing all of the elements in this queue|
|<T> T[] | toArray(T[] a)| Returns an array containing all of the elements in this queue; the runtime type of the returned array is that of the specified array|
