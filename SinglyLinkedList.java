package _2041004136;

import java.util.Scanner;

public class SinglyLinkedList {
    Node start = null;
    Scanner sc = new Scanner(System.in);
    char decision;
    // Creating the linked list.
    void create() {
        // Adding first node
        Node firstNode = new Node();
        System.out.println();
        System.out.println("Enter Student Details...");
        System.out.println();
        firstNode.stud.setStudentDetails();
        firstNode.link = null;
        start=firstNode;

        //Adding remaining nodes (if any)
        System.out.println("Do you want more nodes(y/n)");
        decision= sc.next().charAt(0);
        while (decision!='n') {
            Node remainingNode=new Node();
            remainingNode.stud.setStudentDetails();
            remainingNode.link=null;
            firstNode.link=remainingNode;
            firstNode=remainingNode;
            System.out.println("Do you want more nodes(y/n)");
            decision=sc.next().charAt(0);
            
        }

    }
    //Display the details of the student present in the linked list.
    void displayLinkedList() {
        Node show = start;
        while (show!=null) {
            show.stud.displayStudent();
            System.out.println();
            show=show.link;
        } 
    }
    //Display the details of the topper.
    void findTopper() {
        Node topper = start;
        topper.stud.displayStudent();
    }
    //Display the details of the failed students (mark<40)
    void displayFailedList() {
        Node list=start;
        while (list!=null) {
            if (list.stud.mark<=40) {
                list.stud.displayStudent();
            }
            list=list.link;
        }
    }
   
    //I have used bubble sort for sorting function  
    void sort() {
        Node head = start, tail = null;
        Student temp;
        if (start==null) {
            return;
        }
        else {
            while (head!=null) {
                tail = head.link;
                while (tail!=null) {
                    if (head.stud.mark < tail.stud.mark) {
                        temp = head.stud;
                        head.stud=tail.stud;
                        tail.stud=temp;
                    }
                    tail=tail.link;
                }
                head=head.link;
            }
        }    
    }
}