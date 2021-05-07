package Assigment10;

import java.util.Scanner;

public class assignment10_Q17 {

	public static void main(String[] args) {

		String a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		Scanner sc = new Scanner(System.in);

		System.out.print("1st letter:");
		String first = sc.next();

		System.out.print("2nd latter:");
		String last = sc.next();

		if (a.contains(first) == false && a.contains(last) == false) {
			
			a=a.toLowerCase();

			System.out.println(a.substring(a.indexOf(first), a.indexOf(last) + 1));
		} else {
			System.out.println(a.substring(a.indexOf(first), (a.indexOf(last) + 1)));
		}

	}

}
