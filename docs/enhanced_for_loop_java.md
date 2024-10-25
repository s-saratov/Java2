
# Enhanced For Loop (foreach loop) in Java

The **enhanced for loop**, also known as the **foreach loop**, is a control flow statement in Java designed to iterate over elements of arrays or collections like lists and sets. It provides a simplified syntax for iterating over collections without using indices or iterators.

## Syntax
```java
for (Type element : collection) {
    // actions with element
}
```
- **Type**: The data type of elements in the collection.
- **element**: A variable that will hold the current element in each iteration.
- **collection**: The array or collection to be iterated over.

## Key Features
1. **Simplified Code**: No need to manage indices or explicitly create an iterator.
2. **Read-Only Access**: The enhanced for loop provides read-only access to elements. Modifying the collection is not allowed during iteration, except through reference to mutable objects.
3. **Array and Collection Support**: Works with both arrays and classes that implement the `Iterable` interface (e.g., `ArrayList`, `HashSet`).

## Example 1: Iterating over an Array
```java
int[] nums = {1, 2, 3, 4, 5};
int sum = 0;

for (int num : nums) {
    sum += num;
}

System.out.println("Sum: " + sum);
```
In this example, the array `nums` is iterated element by element, with each element being assigned to the variable `num`. The sum of all elements is computed.

## Example 2: Iterating over a List
```java
List<String> fruits = Arrays.asList("Apple", "Banana", "Cherry");

for (String fruit : fruits) {
    System.out.println(fruit);
}
```
This code iterates through a list of strings and prints each fruit.

## Example 3: Iterating over a Set
```java
Set<Integer> numbers = new HashSet<>(Arrays.asList(10, 20, 30));

for (int num : numbers) {
    System.out.println(num);
}
```
In this example, the `foreach` loop iterates through a set of integers and prints them.

## Limitations
- **Cannot modify the collection**: The enhanced for loop does not allow modification of the collection during iteration. If you need to remove or modify elements, you should use an `Iterator` or another type of loop.
- **Single-direction iteration**: The loop iterates over the collection from start to end. It does not support reverse iteration.
- **Read-only variables**: The loop provides a copy of each element for each iteration, which means modifying the element inside the loop does not affect the original array or collection unless you're dealing with mutable objects (e.g., objects whose fields can be modified).

## Use Cases
- **Summing elements in a list or array**: The enhanced for loop is often used for performing aggregate operations, such as summing elements.
- **Displaying elements**: It is also frequently used to display the contents of arrays or collections.

## Example 4: Working with Objects
```java
class Dog {
    String model;

    Dog(String model) {
        this.model = model;
    }

    void bark() {
        System.out.println(model + " is barking!");
    }
}

List<Dog> dogs = Arrays.asList(new Dog("Rex"), new Dog("Buddy"), new Dog("Charlie"));

for (Dog dog : dogs) {
    dog.bark();
}
```
In this example, we iterate over a list of `Dog` objects and call the `bark()` method on each object.

## Conclusion
The enhanced for loop in Java offers a clean and concise way to iterate through arrays and collections. It improves code readability by eliminating boilerplate code like index management and explicit iterator handling. However, it should be used for scenarios where only read access or minor updates to object states (not the collection itself) are needed.
