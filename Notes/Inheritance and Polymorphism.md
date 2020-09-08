# Inheritance

In Java, all classes can inherit attributes (instance variables) and behaviors (methods) from another class.  The class that is inheriting is called the child class or subclass.

## Subclass extends Superclass

The keyword extends is used to establish an inheritance relationship between a subclass and a superclass. A class can extend only one superclass.

### Example:
     * public class Car extends Vehicle
     * public class Motorcycle extends Vehicle

## is-a vs has-a

* **has-a**: when the object of one class contains a reference to one or more of another class.
* **is-a**: Extending a subclass from a superclass creates an is-a relationship from the subclass to the superclass.


## Overriding Methods

Modifying the inherited methods is called overriding.

* should have the same method signature ( method name, parameter type list, and return type)
*  The method will be called instead of the method in the superclass.

## Overloading Methods

When several methods have the same name but the parameter types, order or number are different.

* only the method names are identical and they have different parameters.

## Inherited Get/Set methods

* private instance variables of the parent class cannot be accessed by the child class, they should be accessed using accessors and mutators.

## super Keyword

Mainly two uses:

*  ```super() or super(args)``` calls just the super constructor if put in as the first line of a subclass constructor.

* Subclass method to do more than what a superclass method does, you use ```super.method()``` in the overridden method to force the parent's method to be called.

## Inheritance Hierarchies

* Multiple subclasses that inherit from a superclass, is called as an inheritance hierarchy.
* Every subclass is-a kind of the superclass
* In Java, the class ```Object``` is at the top of the hierarchy. Every class in Java inherits from Object and is-a Object
* Main use of inheritance hierarchy is code reuse.

## Superclass References

A superclass reference variable can hold an object of that superclass or any of its subclasses. (not vice versa)

## Superclass Arrays and ArrayLists

Using inheritance hierarchies, we can create arrays and ArrayLists using the superclass type and put in values that are of the subclass type.

# Polymorphism

**poly** - many
**morphism** - form

Polymorphism means many forms.
