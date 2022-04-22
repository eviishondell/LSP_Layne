A creational pattern focuses on the best way to create instances of objects, which promotes flexibility. The Prototype design pattern allows us to hide the complexity of making new instances from the client. It should be used when designing a system independent of how the products are shown. For example, with the development of a robot, engineers can’t just hand the user the first copy made because there will be errors and design flaws. Testing out new concepts on a prototype leaves room for improvement until testing is done and the robot is functional. In computer science terms, It may be more convenient to install a corresponding number of prototypes and clone them instead of instantiating the class manually because this is tedious. The clone() method works perfectly here because this one function can copy the code and make it easier to edit without the client seeing all the backend. Prototyping reduces subclassing. In addition, instead of writing code over and over to edit it, we can just call clone(). However, it is difficult to implement this because each subclass will need this and sometimes cloning is not supported.

The Singleton design pattern eliminates the need for many managers. For example, if we are working with MongoDB to make a social media website, why create new databases for likes, comments, and replies, when it can all be stored in one database? Exactly! It eliminates the need for multiple storage places. It helps us call instances without the whole class being called , which is much better. However, the classic implementation of Singleton is not thread-safe because it creates two instances of an object. getInstance() is an expensive operation because it can increase runtime and space complexity.

Structural patterns focus on the composition of classes and objects into larger structures. Facade design pattern is exactly what it sounds like. When you go to turn on a light, you flick the switch and think nothing else of it. You aren’t thinking about the wiring and electricity traveling through those wires. The switch is just a facade. It hides all the complexity of the program. Clients only have access to the basic code like built- in function calls. Behind this highlighted word has the code that programmers have worked on for some time. I wouldn’t label facade with disadvantage only because it is used to restrict access and provide readability, so the advantages are that clients will see cleaner code and it protect the backend of the backend *winks*. 

Proxy is the “surrogate”. For example, when we swipe a debit card, it represents the snout we have in the bank or if we can afford the item. It is a “stand-in”. Proxy pattern is used when we need to create a wrapper to cover the main object’s complexity from the client. One of the advantages of Proxy pattern is security. It also avoids duplication of objects which will keep the space complexity down and increases the performance of the application. However, this implementation calls for more abstraction, which is difficult on its own. 

Behavioral patterns focus on the interaction between classes or objects. Memento pattern is used to restore the state of an object to a previous state. If you were ever cooking a meal and realized you added too much salt, life would be easier if you could just revert back to the meal before adding the salt, like a breakpoint. That’s the purpose of memento. Mementos make debugging much easier. We can use Serialization to achieve memento pattern implementation that is more generic rather than Memento pattern where every object needs to have its own Memento class implementation.
However, if the Originator object is very huge then the Memento object size will also be huge and use a lot of memory. Memento is a way to help with restoration.

The iterator pattern provides a way to access the elements of an aggregate object without exposing its underlying representation. Using .next() to iterate through an array doesn’t expose the user to the complicated work in the back. The Iterator pattern is like taking your finger and counting the ducks in a line in the park. You’re not thinking about the sensors in your brain telling your hand to move and the math going on to keep count. This is helpful because the client can not alter the code. I do not see any disadvantages with this pattern!



https://www.javatpoint.com/classification-of-design-pattern-in-python

https://www.geeksforgeeks.org/prototype-design-pattern/amp/

https://www.geeksforgeeks.org/singleton-design-pattern/amp/

https://www.geeksforgeeks.org/facade-design-pattern-introduction/amp/

https://www.geeksforgeeks.org/proxy-design-pattern/amp/

https://www.geeksforgeeks.org/memento-design-pattern/amp/

https://www.geeksforgeeks.org/iterator-pattern/amp/
