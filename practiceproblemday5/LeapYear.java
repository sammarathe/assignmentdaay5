package practiceproblemday5;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner LP = new Scanner(System.in);
		System.out.println("enter an year :: ");
		int n = LP.nextInt();

		if (n % 4 == 0 && n > 999) {
			System.out.println("leap year");

		} else if (n % 4 != 0 && n > 999) {
			System.out.println("not leap year");

		} else {
			System.out.println("error !!....pleas enter the year in 4 digit");
		}

	}

}
