# Chapter 3 Programming Exercises
## Question 1
 Suppose that you have created a program with only the following variables:
 ```java
 int a = 5;
 int b = 6;
```
Suppose that you also have a method with the following header:
```java
public static void mathMethod(int a)
```
Which of the following method calls are legal?
```java
a. mathMethod(a); // Legal
b. mathMethod(b); // Legal
c. mathMethod(a + b); // Legal
d. mathMethod(a,b); // Illegal
e. mathMethod(2361); // Legal
f. mathMethod(12.78); // Illegal
g. mathMethod(29987L); // Illegal
h. mathMethod(); // Illegal
i. mathMethod(x); // Illegal
j. mathMethod(a / b); // Legal
```

## Question 2
Suppose that you have created a program with only the following variables:
```java
int age = 34;
int weight = 180;
double height = 5.9;
```
Suppose that you also have a method with the following header:
```java
public static void calculate(int age, double size)
```
Which of the following method calls are legal?
```java
a. calculate(age, weight); // Legal
b. calculate(age, height); // Legal
c. calculate(weight, height); // Legal
d. calculate(height, age); // Illegal
e. calculate(45.5, 120); // Illegal
f. calculate(12, 120.2); // Legal
g. calculate(age, size); // Legal
h. calculate(2, 3); // Legal
i. calculate(age); // Illegal
j. calculate(weight, weight); // Legal
```

## Question 3
Suppose that a class named ```Bicycle``` contains a private nonstatic integer named
```height```, a public nonstatic ```String``` named ``` model```, and a public static integer named
```wheels```. Which of the following are legal statements in a class named ```BicycleDemo```
that has instantiated an object as ```Bicycle myBike = new Bicycle();```?

```java
a. myBike.height = 26; // Legal
b. myBike.model = "Cyclone"; // Legal
c. myBike.wheels = 3; // Legal
d. myBike.model = 108; // Illegal
e. Bicycle.height = 24; // Illegal
f. Bicycle.model = "Hurricane"; // Illegal
g. Bicycle.int = 3; // Illegal
h. Bicycle.model = 108; // Illegal
i. Bicycle.wheels = 2; // Legal
j. Bicycle yourBike = myBike; // Legal
```