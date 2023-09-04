In this example the main class is named Base application with the main method.
Another class Client has the object of the interface which is set using a setter.
A method called sendMessage is declared.


This method is also present in the interface as a blueprint.
The implementation of this method is present in both BasicChecker and AdvancedChecker 
classes.

Now, when a new object is  passed to the Client constructor the interface detects its
class and uses the checkMessage corresponding to the class.
There Both the checker classes are connected to the BaseApplication class 
via the interface.