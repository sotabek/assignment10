package Assigment10;

import java.util.Scanner;

public class assignment10_Q21 {

	public static void main(String[] args) {

		String str = "abXYabc";
		
		Scanner sc= new Scanner (System.in);
		
		System.out.println("How many times ur prefix appears in the string?:");
		int n = sc.nextInt();
		
		int counter = 0;

		String prefix = str.substring(0, n);

		for (int i = 0; str.indexOf(prefix, i) != -1; i = str.indexOf(prefix, i) + 1) {

			if (str.indexOf(prefix, i) != -1) {
				counter++;
			}

		}
		
		if (counter>=n) {
			System.out.print("true: " + prefix + " appears " + counter + " times");

		} else {
			System.out.print("false: " + prefix + " appears only " + counter + " times");

		}

	}

}
