package _2041004136;

import java.util.*;
public class StudentMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 SinglyLinkedList st = new SinglyLinkedList();
	        while(true)
	        {
	        	System.out.println("--------<<<<<<MENU>>>>>>-------");
	        	System.out.println("0. Exit the Menu");
	        	System.out.println("1.create a linked list");
	        	System.out.println("2.display linked list");
	        	System.out.println("3.Find topper");
	        	System.out.println("4.find students who failed");
	        	System.out.println("5.sort according to marks in descending order");
	        	System.out.println();
	        	System.out.println("enter the choice");
	        	
	        	   
		        int i=sc.nextInt();
		        
		        switch(i)
		        {
		        case 0:
		        	System.exit(0);	
		        case 1:
		        	 System.out.println("Type Your StudentData : ");
		        	st.create();
		        	 System.out.println();
		        	break;
		       case 2:
		    	   System.out.println("Displaying Data...");

			        System.out.println();
			        //invoking displayLinkedList() method to display data.
			        st.displayLinkedList();
			        
			        break;
			        case 3:
			        	System.out.println("Topper is : ");
				        System.out.println();
				        //invoking findTopper() method to display topper details
				        st.findTopper();
				        
				        
                  break;
			        case 4:
			        	
			        	  System.out.println("list of defaulter :-");
			  	        System.out.println();
			  	        //invoking displayFailedList() method to display Defaulter list.
			  	        st.displayFailedList();
			  	    

			  	        break;
			        case 5:
                      st.sort();
                   
                      System.out.println("Decending the list's Order...");
          	        System.out.println();
          	        //sort method has been invoked so this method have already sorted elements in descending order
          	        st.displayLinkedList();
		    	   
		        
		        }
	        }
	     
	        
	       
	}

}
