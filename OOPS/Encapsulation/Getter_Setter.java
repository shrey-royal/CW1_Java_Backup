class Student {
    private int rollno;
    private String name;

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getRollno() {
        return this.rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}

public class Getter_Setter {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollno(1);
        s.setName("Vedant");
        System.out.println("Roll no: " + s.getRollno());
        System.out.println("Name: " + s.getName());
    }
}

/*
getter setter method is used to access the private data member of a class.

getter method is used to read the data of a variable that is private.
setter method is used to write the data of a variable that is private.

syntax of setter method:
public void setVariableName(datatype variableName){
    this.variableName = variableName;
}

syntax of getter method:
public datatype getVariableName(){
    return this.variableName;
}


Task:
Create a class Employee with private data members id, name, salary, designation.
then create getter and setter method for all the data members.
then create a main class and create an object of Employee class and set the data members using setter method and print the data members using getter method.

*/