package Assigment10;

public class assignment10_Q30 {

	public static void main(String[] args) {

		System.out.println(str("blabla", "a"));

	}

	public static String str(String s1, String s2) {

		String s = s1.substring(0, 3).concat(s2).concat(s1.substring(3));

		return (s);
	}

}
