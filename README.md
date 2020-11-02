# javaoopfundamentals

* Compostion 
    * * este cand o componenta nu poate exista daca nu exista celalalta de care e legata: User composition cu Cards; exista Dependent;
    * * este o forma de agregare
* Aggregation 
    * * "has a"
    * * collection of objects
    * *  avem shoping cart dar nu punem produse in el; exista Independent;
* Encapsulation:
    * * Hiding Implemenatation Details
    * * Mechanisms for hiding Details: access modifiers, packages, inheritence;
* Principle: Encapsulate what varies !!!
* SOLID Principles:
    * * Single Responsability Principle - clasele fac un sigur lucru
    * * Open Close Principle - Open in interior, Close catre exterior
    * * Liskov Substitution Principle - superclass si subclass; B extends A; A b = new B();
    * * Interface Segregation Principle - interfetele separate ca logica
    * * Dependency Inversion Principle - depend on interfaces; wider meaning: e.g. API

* Cohesion - how strong methods and data are linked together; interdependece within classes;
* Coupling - interdependence between classes;


* CRC cards - interacting class
* Conceptual object diagram - CRC cards
* 1...* - one or mor objects
* Compiled and statically typed - C++
* hinder (limpede) - variables names to be clear
* inheritance and aggregation - design pattern structural
* static attribute - the weather conditions for each house in a small neighborhood
* UML - Name: String = "Jane"
* abstract class - to avoid redundant coding in children
* superclass / subclass - utensil-fork
* concrete class - no children
* When is an interface used instead of an abstract class? - when method types are shared
* How are the contents of a composition different from those of an aggregation?  - If a composition dies, the contents die.
* aggregation - collections of objects
* is a kind of - inheritance
* What form of aggregation implies ownership, and that the lifetime of an object is dependent on another object's existence? - composition