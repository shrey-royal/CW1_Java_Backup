import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class Student {
    int rollno;
    String name;
    int age;

    Student(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}


public class Arraylist {
    public static void main(String[] args) {
        // ArrayList<String> cars = new ArrayList<>();

        // cars.add("Volvo");
        // cars.add("BMW");
        // cars.add("Ford");
        // cars.add("Mazda");
        // cars.add("Audi");
        // cars.add("Mazda");


        // System.out.println(cars);
        // for (String car : cars) {
        //     System.out.println(car);
        // }


        // cars.clear();
        // System.out.println(cars);
        
        // System.out.println(cars.contains("Mazda"));
        // System.out.println(cars.indexOf("Mazda"));
        // System.out.println(cars.lastIndexOf("Mazda"));

        // System.out.println(cars.get(2));
        // cars.set(2, "Opel");
        // System.out.println(cars);

        // System.out.println(cars.size());
        // cars.clear();
        // System.out.println(cars.isEmpty());

        // String[] arr = new String[cars.size()];
        // cars.toArray(arr);

        // for (String car : arr) {
        //     System.out.println(car);
        // }


        //Student class' Arraylist
        ArrayList<Student> students = new ArrayList<>();

        Student s1 = new Student(1, "John", 20);
        Student s2 = new Student(2, "Jane", 21);
        Student s3 = new Student(3, "Jack", 22);

        students.add(new Student(4, "Jill", 23));
        students.add(s1);
        students.add(s3);
        students.add(s2);

        // System.out.println(students);

        // for (Student student : students) {
        //     System.out.println(student.rollno + " " + student.name + " " + student.age);
        // }

        Iterator<Student> itr = students.iterator();

        while (itr.hasNext()) {
            Student student = itr.next();
            System.out.println(student.rollno + " " + student.name + " " + student.age);
        }

        //descending order
        Collections.sort(students, (a, b) -> {
            return b.rollno - a.rollno;
        });

        System.out.println("Descending order");
        for (Student student : students) {
            System.out.println(student.rollno + " " + student.name + " " + student.age);
        }

    }
}

/*
Parent interface: List -> Collection -> Iterable

In List interface we have -> ArrayList, Vector, Stack


An Arraylist is a dynamic version of array. It is resizable and allows all elements except primitive types.

Methods:

add() : adds an element at the end of the list
remove() : removes an element from the list
get() : returns the element at the specified position
set() : changes the element at the specified position
size() : returns the number of elements in the list
clear() : removes all the elements from the list
isEmpty() : checks if the list is empty
contains() : checks if the list contains the specified element
indexOf() : returns the index of the specified element
lastIndexOf() : returns the index of the last occurrence of the specified element
toArray() : converts the list to an array



*/