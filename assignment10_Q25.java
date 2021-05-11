package Assigment10;

public class assignment10_Q25 {

	public static void main(String[] args) {

		String s1 = "java";
		String s2 = "selenium";
		String s3 = "";

		if (s1.length() > s2.length()) {

			for (int i = 0; i <= (s2.length() - 1); i++) {

				s3 = s3 + s1.substring(i, i + 1) + s2.substring(i, i + 1);
			}
			s3 = s3 + s1.substring(s2.length());

		} else if (s1.length() == s2.length()) {

			for (int i = 0; i <= (s2.length() - 1); i++) {

				s3 = s3 + s1.substring(i, i + 1) + s2.substring(i, i + 1);
			}
		}

		else {
			for (int i = 0; i <= (s1.length() - 1); i++) {

				s3 = s3 + s1.substring(i, i + 1) + s2.substring(i, i + 1);
			}
			s3 = s3 + s2.substring(s1.length());
		}

		System.out.println(s3);

	}

}
