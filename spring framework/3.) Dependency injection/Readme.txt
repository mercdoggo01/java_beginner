When writing a complex Java application, 
application classes should be as independent as possible of other Java classes 
to increase the possibility to reuse these classes and to test them 
independently of other classes while unit testing. 


Dependency Injection (or sometime called wiring) helps in 
gluing these classes together and at the same time keeping them independent.

DI exists in two major variants

1 Constructor-based dependency injection

Constructor-based DI is accomplished when the container invokes a class constructor with 
a number of arguments, each representing a dependency on the other class.

2 Setter-based dependency injection

Setter-based DI is accomplished by the container calling setter methods on your beans after 
invoking a no-argument constructor or no-argument static factory method to instantiate your bean.