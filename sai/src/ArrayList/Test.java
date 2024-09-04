package ArrayList;
import java.util.*;

public class Student {
	
	String name;
    double[] marks = new double[3];

    // Constructor to initialize instance variables
    public Student(String name, double[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Accessor method to return the name of the student
    public String getName() {
        return this.name;
    }

    // Method to return the total marks of the student
    public double findTotal() {
        return this.marks[0] + this.marks[1] + this.marks[2];
    }

}
public class Test {
// Define the method getMax() here
    
    // Define the method getMax() here
    // Method to find the student with the highest total marks
    public static String getMax(Student[] students) {
        
        if (students[0].findTotal()>students[1].findTotal() && students[0].findTotal()>students[2].findTotal())
         return students[0].getName();
        else if (students[1].findTotal()>students[2].findTotal())
            return students[1].getName();
        return students[2].getName();

        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] arr = new Student[3];   
        for(int i = 0; i < 3; i++){
        	System.out.println("enter a name : ");
            String name = sc.next();
            System.out.println("enter a markes : ");
            double[] m = {sc.nextDouble(), sc.nextDouble(), sc.nextDouble()};
            arr[i] = new Student(name, m);
        }
        System.out.println(getMax(arr));
    }

}
