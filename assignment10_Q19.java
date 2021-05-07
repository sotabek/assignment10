package Assigment10;

public class assignment10_Q19 {

	public static void main(String[] args) {

		java("javaxjavaapplepearjavaegg");

	}

	public static void java(String str) {

		int counter = 0;

		for (int i = 0; str.indexOf("java", i)!= -1; i = str.indexOf("java", i)+1) {

			if (str.indexOf("java", i) !=-1) {

				counter++;
			}

		}
		System.out.println("# of \"java\" in the given string: "+ counter);

	}

}
