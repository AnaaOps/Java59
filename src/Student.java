/**
 * Represents a Student with roll number and name.
 * This class demonstrates basic object-oriented programming concepts.
 */
public class Student {
    int rollNo;
    String name;
    
    /**
     * Constructor to create a Student object.
     * @param r the roll number of the student
     * @param n the name of the student
     */
    Student(int r, String n) {
        name = n;
        rollNo = r;
    }
    
    /**
     * Displays the student's information.
     */
    void display() {
        System.out.println("Name is " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}
