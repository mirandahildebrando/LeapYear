package leapYear;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the program");
		System.out.println("Enter the year you would like to consult: ");
		
		int ano = scanner.nextInt();
		
		if((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
			System.out.println("This year is leap year!");
		} else {
			System.out.println("This year is not a leap year!");
		}
		
	}

}
