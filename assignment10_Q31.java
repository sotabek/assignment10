package Assigment10;

public class assignment10_Q31 {

	public static void main(String[] args) {

		String s = "Nurses Run";

		String s2 = "";
		String s1 = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			if (s.charAt(i) != ' ') {

				s2 = s2 + s.charAt(i);

			}
		}

		for (int i = 0; i <= s.length() - 1; i++) {

			if (s.charAt(i) != ' ') {

				s1 = s1 + s.charAt(i);

			}
		}

		System.out.println(s1.toLowerCase().equalsIgnoreCase(s2));

	}

}
