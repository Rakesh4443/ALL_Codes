package org.spring.message_formater;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Program Strated");
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the message : ");
        String message = sc1.nextLine();
	    System.out.println("MessageFormatter");
	    System.out.println("1.html");
	    System.out.println("2.pdf");
	    System.out.println("Enter the format :");
	    int ch = sc1.nextInt();
	    switch(ch) {
	    
	    case 1 : System.out.println("-------HTML Format-------");
	             MessageWritter obj1 = new MessageWritter();
		         obj1.WriteMessage(message);
		         break;
		  
	    case 2 : System.out.println("-------PDF Format-------");
	             MessageWritter1 obj2 = new MessageWritter1();
                 obj2.WriteMessage(message);
                 break;
                 
        default : System.out.println("Please Enter Right choice!!!!!");
		         
		         
	    }
	    
	    sc1.close();

		System.out.println("Program Ended");
	}

}
