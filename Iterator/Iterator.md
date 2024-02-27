# Iterator

## Intent
**Iterator** is a behavioral design pattern that lets you traverse elements of a collection without exposing its underlying representation (list, stack, tree, etc.).

## Problem
Collections are one of the most used data types in programming. Nonetheless, a collection is just a container for a group of objects.

![image](https://github.com/SCYeh/Design_Pattern_Practice/assets/88961674/09761ba6-b2eb-4b17-b25a-30f1c0b93183)

Most collections store their elements in simple lists. However, some of them are based on stacks, trees, graphs and other complex data structures.

But no matter how a collection is structured, it must provide some way of accessing its elements so that other code can use these elements. There should be a way to go through each element of the collection without accessing the same elements over and over.

This may sound like an easy job if you have a collection based on a list. You just loop over all of the elements. But how do you sequentially traverse elements of a complex data structure, such as a tree? For example, one day you might be just fine with depth-first traversal of a tree. Yet the next day you might require breadth-first traversal. And the next week, you might need something else, like random access to the tree elements.

![image](https://github.com/SCYeh/Design_Pattern_Practice/assets/88961674/d41c1e41-43c9-49ba-af90-fb53fafca623)

Adding more and more traversal algorithms to the collection gradually blurs its primary responsibility, which is efficient data storage. Additionally, some algorithms might be tailored for a specific application, so including them into a generic collection class would be weird.

On the other hand, the client code that’s supposed to work with various collections may not even care how they store their elements. However, since collections all provide different ways of accessing their elements, you have no option other than to couple your code to the specific collection classes.

## Solution
The main idea of the Iterator pattern is to extract the traversal behavior of a collection into a separate object called an iterator.

![image](https://github.com/SCYeh/Design_Pattern_Practice/assets/88961674/e982fd47-b0b6-4bc7-bafd-d85074f7ea8e)

In addition to implementing the algorithm itself, an iterator object encapsulates all of the traversal details, such as the current position and how many elements are left till the end. Because of this, several iterators can go through the same collection at the same time, independently of each other.

Usually, iterators provide one primary method for fetching elements of the collection. The client can keep running this method until it doesn’t return anything, which means that the iterator has traversed all of the elements.

All iterators must implement the same interface. This makes the client code compatible with any collection type or any traversal algorithm as long as there’s a proper iterator. If you need a special way to traverse a collection, you just create a new iterator class, without having to change the collection or the client.

## Structure
![image](https://github.com/SCYeh/Design_Pattern_Practice/assets/88961674/6f42f2d2-898c-490e-8e03-c7234d82c2c4)

1. The **Iterator** interface declares the operations required for traversing a collection: fetching the next element, retrieving the current position, restarting iteration, etc.

2. **Concrete Iterators** implement specific algorithms for traversing a collection. The iterator object should track the traversal progress on its own. This allows several iterators to traverse the same collection independently of each other.

3. The **Collection** interface declares one or multiple methods for getting iterators compatible with the collection. Note that the return type of the methods must be declared as the iterator interface so that the concrete collections can return various kinds of iterators.

4. **Concrete Collections** return new instances of a particular concrete iterator class each time the client requests one. You might be wondering, where’s the rest of the collection’s code? Don’t worry, it should be in the same class. It’s just that these details aren’t crucial to the actual pattern, so we’re omitting them.


5. The Client works with both collections and iterators via their interfaces. This way the client isn’t coupled to concrete classes, allowing you to use various collections and iterators with the same client code.

    Typically, clients don’t create iterators on their own, but instead get them from collections. Yet, in certain cases, the client can create one directly; for example, when the client defines its own special iterator.

## Practice Class Diagram
![各種奇怪的東西 - Page 33](https://github.com/SCYeh/Design_Pattern_Practice/assets/88961674/6d1444bf-0bb7-42f7-9d99-e5db838c3b1d)

## Applicability
1. Use the Iterator pattern when your collection has a complex data structure under the hood, but you want to hide its complexity from clients (either for convenience or security reasons).

2. Use the pattern to reduce duplication of the traversal code across your app.

3. Use the Iterator when you want your code to be able to traverse different data structures or when types of these structures are unknown beforehand.

## How to Implement
1. Declare the iterator interface. At the very least, it must have a method for fetching the next element from a collection. But for the sake of convenience you can add a couple of other methods, such as fetching the previous element, tracking the current position, and checking the end of the iteration.

2. Declare the collection interface and describe a method for fetching iterators. The return type should be equal to that of the iterator interface. You may declare similar methods if you plan to have several distinct groups of iterators.

3. Implement concrete iterator classes for the collections that you want to be traversable with iterators. An iterator object must be linked with a single collection instance. Usually, this link is established via the iterator’s constructor.

4. Implement the collection interface in your collection classes. The main idea is to provide the client with a shortcut for creating iterators, tailored for a particular collection class. The collection object must pass itself to the iterator’s constructor to establish a link between them.

5. Go over the client code to replace all of the collection traversal code with the use of iterators. The client fetches a new iterator object each time it needs to iterate over the collection elements.

## Pros and Cons
- Pros
    1. **Single Responsibility Principle**. You can clean up the client code and the collections by extracting bulky traversal algorithms into separate classes.
    2. **Open/Closed Principle**. You can implement new types of collections and iterators and pass them to existing code without breaking anything.
    3. You can iterate over the same collection in parallel because each iterator object contains its own iteration state.
    4. For the same reason, you can delay an iteration and continue it when needed.

- Cons
    1. Applying the pattern can be an overkill if your app only works with simple collections.
    2. Using an iterator may be less efficient than going through elements of some specialized collections directly.

## Relations with Other Patterns
- You can use **Iterators** to traverse **Composite** trees.

- You can use **Factory Method** along with **Iterator** to let collection subclasses return different types of iterators that are compatible with the collections.

- You can use **Memento** along with **Iterator** to capture the current iteration state and roll it back if necessary.

- You can use **Visitor** along with **Iterator** to traverse a complex data structure and execute some operation over its elements, even if they all have different classes.
