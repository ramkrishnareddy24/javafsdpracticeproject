package javafsdpracticeproject;

import java.util.*;

public class PP2ValidationOfEmailID {
	
	public static void main(String[] args) {
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("jack@gmail.com");
		arr.add("jon@gmail.com");
		arr.add("alex@gmail.com");
		arr.add("rock@gmail.com");
		arr.add("raj@gmail.com");
//		System.out.println(arr);
		
		System.out.println("Enter a Email ID :");
		Scanner sc = new Scanner(System.in);
		String newEmail = sc.nextLine();
		validate(arr,newEmail);
	}
	
	public static void validate(ArrayList<String> arr,String email) {
//		Assuming Arraylist is not empty
		if(arr.contains(email))
			System.out.println("Email is Verified...");
		else
			System.out.println("Email Not Found..!");
	}
}
