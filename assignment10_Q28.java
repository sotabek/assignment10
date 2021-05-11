package Assigment10;

public class assignment10_Q28 {

	public static void main(String[] args) {

		System.out.println(badWord("he said bla bla bla", "bla"));

	}

	public static String badWord(String s, String s1) {

		String str = s.replace(s1, "").replace("  ", " ").trim();
		return (str);

	}

}
