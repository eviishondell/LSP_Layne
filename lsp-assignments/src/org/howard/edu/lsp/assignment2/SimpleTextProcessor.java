package org.howard.edu.lsp.assignment2;

import java.util.Scanner;

public class SimpleTextProcessor {
	public static void main(String[] args) {
		/**
		*This method takes in user input and returns the product 
		*and the total. It is terminated when the user inputs "Goodbye"
		*
		*@author eviishondell
		*/
		Scanner inputnum = new Scanner(System.in); 
		String secrets = "Goodbye"; 
		System.out.println("String? ");
		String val = inputnum.nextLine();
			while (!(val.equals(secrets))) {
			    String[] newList = val.split(" ",0);
			    System.out.println("Tokens:");
			    int total = 0;
			    int product = 1;
			    for(String i : newList) { 
			    	System.out.println(i);
			    	total += Integer.parseInt(i);
			    	product = product * Integer.parseInt(i);}
			   
			    System.out.println("Sum: " + total);
			    System.out.println("Product: " + product);
			    
			    System.out.println("String? ");
			    val = inputnum.nextLine();
			}

		}

	    }
	


