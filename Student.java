package _2041004136;

import java.util.Scanner;

public class Student {
    String name;
    int roll;
    double mark;
    
    void setStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name : ");
        name = sc.next();
        System.out.print("Rollno : ");
        roll = sc.nextInt();
        System.out.print("mark : ");
        mark = sc.nextDouble();

        // I made this feature to get rid of "resource leak" issue..
        SinglyLinkedList decision = new SinglyLinkedList();
        if (decision.decision=='n') {
            sc.close();
        }
        
    }
    void displayStudent() {
        System.out.println("Name : " + name);
        System.out.println("RollNo : " + roll);
        System.out.println("Mark : " + mark);
    }
    
}