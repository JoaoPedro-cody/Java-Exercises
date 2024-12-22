----Java Exercises: Objects, Encapsulation, Vectors and Lists----

***About the Repository***

This repository contains a series of practical exercises designed to improve my knowledge in Java, focusing on the following topics:

* Objects: Understanding and implementing classes and objects.

* Encapsulation: Using access modifiers, getters and setters to protect and control data.

* Vectors: Manipulating one-dimensional arrays.

* Lists: Using collections such as ArrayList to store and manage dynamic sets of data.

***Technologies Used***

Java: Main programming language.

IDE: Intellij IDEA

***Repository Structure***

* src/: Contains all source code files organized by topic.

* application/: Contains the main class (main) that executes the exercises.

* entities/: Contains the object classes used in the exercises.

***How ​​to Run***

Clone the repository:

1.git clone https://github.com/JoaoPedro-cody/ExerciciosJava

2.Import the project into your preferred IDE.

3.Navigate to the src/application/ folder and run the main file.

***Code Example***

*Encapsulation*

package Entities;

public class Employee {

    private Integer id;
    private String name;
    private Double salary;

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary(double percentage){
        salary += salary * percentage / 100;

    }

    @Override
    public String toString(){
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

}

Contributions

Contributions are welcome! Feel free to add exercises or comments.



