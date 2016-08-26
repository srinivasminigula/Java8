# Java8
Practicing Java 8 syntax

Lambda Expression:
Lambda expressions enable, to treat functionality as method argument, or code as data.

What is the type of Lambda expression?
A: Functional Interface

Functional interface is an interface with only one abstract method, but not methods from Object class.
Ex: Runnable, Comparator, FileFilter
Lambda can be put in a variable.

Is Lambda expression an object? No, 
A Lambda expression is an object without an Identity.
It should be treated as regular object! Can't have methods..

Functional Interfaces:
43 functional interfaces introduced in java.util.function;
4 categories:
Consumer, Supplier, Function and Predicate 

For each is a default method, added in Iterable interface in J8.
Its a terminal method, returns nothing.

default method is regular method with default key word in front of method;
This is for supporting the backward compatibility, allows to change old interfaces with out breaking existing functionality.
Putting concrete method in interface is new feature.
Static methods also allowed in Java 8 interfaces. 
 
Example of new patterns:


Method References:

Constructor  References:

How to process collection data: