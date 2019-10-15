

import java.util.Scanner;

public class HelloJava {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		
		String name = scn.next();
		System.out.println("Hello, " + name);
		
		scn.close();
	}
	
}
