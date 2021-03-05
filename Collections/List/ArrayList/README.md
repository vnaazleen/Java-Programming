# ArrayList
* ArrayLists are dynammic arrays in java
* They are present in java.util package
* RandomAccess, Cloneable, Serializable
* It can also store null value
* size, isEmpty, get, set, iterator, listIterator are constant time operations
* add is amortized constant time
* ArrayList is not synchronized
## Constructors

| Constructor  | Description  |
| ------------ | ------------ |
| ArrayList()  |  creates a empty list, with initial capacity 10 |
| ArrayList(Collection <? extends E> c)  |   constructs a list containing the elements of the specified collection|
| ArrayList(int initialCapacity)  | constructs a empty list with specified capacity  |

## Methods

| Method | Return type | Description  |
| ------------ | ------------ | ------------ |
| add(E e)  | Boolean  | Appends the specific element to end of the list  |
| add(int index, E element)  | void  | Inserts element at given index  |
| addAll(Collection<? extends E> c)  | Boolean  | Appends all the elements in collectionto end of the list|
| addAll(int index, Collection<? extends E> c) | Boolean | Appends all the elements of specific collection at given index  |
| clear()  | void  | Removes all of the elements from this list  |
| clone()  |  Object | Returns a shallow copy of this ArrayList instance.   |
| contains(Object o)  | Boolean  | Returns true if this list contains the specified element. |
| forEach(Consumer<? super E> action) | void  | Performs the given action for each element of the Iterable until all elements have been processed or the action throws an exception.  |
| get(int index) | E | Returns the element at the specified position in this list.  |
| indexOf(Object o) | int  | Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.  |
| isEmpty() | Boolean | Returns true if this list contains no elements.  |
| iterator()  | iterator<E>  | Returns an iterator over the elements in this list in proper sequence.  |
| lastIndexOf(Object o)  | int  |  Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element. |
| listIterator()  |  listIterator\<E> |  Returns a list iterator over the elements in this list (in proper sequence). |
| listIterator(int index) | iterator\<E>  | Returns a list iterator over the elements in this list (in proper sequence), starting at the specified position in the list.  |
|  remove(int index) | E | Removes the element at the specified position in this list.  |
|  remove(Object o) |  Boolean |  Removes the first occurrence of the specified element from this list, if it is present. |
|  set(int index, E element) | void  | Replaces the element at the specified position in this list with the specified element.  |
|  size() | int  | Returns the number of elements in this list.  |
| sort(Comparator<? super E> c) |  void | Sorts this list according to the order induced by the specified Comparator.  |
| subList(int fromIndex, int toIndex) | List\<E>| Returns a view of the portion of this list between the specified fromIndex, inclusive, and toIndex, exclusive. |
| toArray()  |Object[]   | Returns an array containing all of the elements in this list in proper sequence (from first to last element).  |
| toArray(T[] a)  | \<T>T{}|Returns an array containing all of the elements in this list in proper sequence (from first to last element); the runtime type of the returned array is that of the specified array.|
