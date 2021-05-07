package Assigment10;

import java.util.Scanner;

public class assignment10_Q16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Type:");
		String java = sc.next();

		if (java.substring(0, 5).contains("java")) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
