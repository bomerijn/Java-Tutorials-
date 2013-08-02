package test;
import java.util.Scanner;

public class melons {
	public static void main (String args[]){
		int number;
		number = 3;
		
		switch (number){
		case 1: System.out.println("nope");
				break;
		case 2: System.out.println("Ok");
				break;
		case 3: System.out.println("Whatevaaa");
				break;
		default:
			System.out.println("que si, que no");
		
		}
		int boy, girl;
		boy = 18;
		girl = 68;
		
		if(boy > 10 || girl < 60) {
			System.out.println("Allowed to enter");
		} else {System.out.println("You're too young");}
		
		int looppara = 5;
		
		while (looppara > 3) {
			System.out.println(looppara);
			looppara--;
		}
		
	}
}
