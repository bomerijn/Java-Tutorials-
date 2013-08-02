package test;
import java.util.Scanner;


public class nog1 {
	public static void main(String args[]){
		int a, b, ab;
		a = 3;
		b = 2;

		a++;
		
		
		ab = a+b;
		switch (ab) {
		case 5:
			System.out.println("no");
			break;
		case 6:
			System.out.println("Alright");
			break;
		case 7: System.out.println("ok");
			break;
		case 10: System.out.println("fine");
			break;
		default:
			System.out.println("None");
		}
		
		String gender = "male";
		
		if (gender == "Female"){
			System.out.println("You're a female");
		}
		else {System.out.println("You're a male");}
		
	}
}
