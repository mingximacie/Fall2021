# Lab2: StudentCompare

### Author: Mingxi Xia(A20473026)
---

Execute Lab 2  in your terminal:

1. javac CircleArea.java
2. java CircleArea
***

There's the source code:

1. Class StudentCompare

```
//use Scanner class to input values by user.
import java.util.Scanner;
public class StudentCompare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the Name of student 1: ");
        //create instance student1
        Students s1 = new Students();
        s1.studentName = sc.next();
        System.out.println("Please enter the ID of student 1: ");
        s1.studentID = sc.nextInt();
        //output the String representation of student1.
        System.out.println(s1.toSting());
        System.out.println("Please enter the Name of student 2: ");
        //create instance student2
        Students s2 = new Students();
        s2.studentName = sc.next();
        System.out.println("Please enter the ID of student 2: ");
        s2.studentID = sc.nextInt();
        //output the String representation of student2.
        System.out.println(s2.toSting());

        //use if and compareTo() method to compare student1 and student2.
        if (s1.studentName.compareTo(s2.studentName) == 0) {
            //when Name is same, compare ID.
            if (s1.studentID == s2.studentID) {
                System.out.println(s1.getStudentName()+" with ID "+s1.getStudentID()+" and "+s2.getStudentName()
                        +" with ID "+s2.getStudentID()+" are the same student.");
            } else {
                System.out.println(s1.getStudentName()+" with ID "+s1.getStudentID()+" and "+s2.getStudentName()
                        +" with ID "+s2.getStudentID()+" are not the same student.");
            }
        } else {
            System.out.println(s1.getStudentName()+" and "+s2.getStudentName()+" are not the same student.");
        }


    }
}
```

2. Class Students

```
//create a single class to store variables.
public class Students {
    //create variables name and id
    String studentName;
    int studentID;
    //initialize the variables of the Students class.
    Students(){
        studentName =" ";
        studentID = 0;
    }
    //get() method to return new studentName when it's called.
    public String getStudentName(){
        return studentName;
    }
    //set() method to set the value of studentName.
    public void setStudentName(String studentName){
        this.studentName = studentName;
    }
    //get() method to return new studentID when it's called.
    public int getStudentID(){
        return studentID;
    }
    //set() method to set the value of studentID.
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }
    //toString method returns the String representation of the name and id of a new student.
    public String toSting(){
        return "The name of the student is " + getStudentName() + ", the ID of the student is " + getStudentID();
    }
}

```

