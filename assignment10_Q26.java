package Assigment10;

public class assignment10_Q26 {

	public static void main(String[] args) {

		String s = "spoon";
		String unique = "";

		for (int i = 0; i < s.length(); i++) {

			if (s.substring(0, i).contains(s.subSequence(i, i + 1)) != true) {

				unique = unique + s.charAt(i);

			}

		}

		System.out.println(unique);

	}

}
