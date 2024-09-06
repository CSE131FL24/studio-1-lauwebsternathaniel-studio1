package studio1;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the year: ");
		int year = in.nextInt();
		boolean condition1 = year % 4 == 0;
		System.out.println(condition1);
		boolean condition2 = year % 100 != 0;
		System.out.println(condition2);
		boolean exeption = year % 400 == 0;
		System.out.println(exeption);
		
		boolean leapYear = condition1 && condition2 || exeption;
		System.out.print(year + " is a leap year: " + leapYear);
	}

}
