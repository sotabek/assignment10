package Assigment10;

public class assignment10_Q24 {

	public static void main(String[] args) {

		String str = "What's the difference between java, javascript and python?";

		int javaCounter = 0;
		int pythonCounter = 0;

		for (int i = 0; str.indexOf("java", i) != -1; i = 1 + str.indexOf("java", i)) {

			if (str.indexOf("java", i) != -1) {
				javaCounter++;
			}
		}

		for (int i = 0; str.indexOf("python", i) != -1; i = 1 + str.indexOf("python", i)) {

			if (str.indexOf("python", i) != -1) {
				pythonCounter++;
			}
		}

		if (javaCounter == pythonCounter) {

			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
