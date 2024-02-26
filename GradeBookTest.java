package Beginner;

import java.util.Scanner;

public class GradeBookTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        GradeBook gradeBook1 = new GradeBook("Cs101 Introduction to Java programming");
        GradeBook gradeBook2 = new GradeBook("Cs102 Data Structures in Java");
        System.out.printf(" Initial course name is: %s\n\n");
        myGradeBook.getCourseName();
        System.out.println("Please enter the course name");
        String theName = input.nextLine();
        myGradeBook.setCourseName(theName);
        System.out.println();

        myGradeBook.displayMessage();
    }
}
