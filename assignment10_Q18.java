package Assigment10;

public class assignment10_Q18 {

	public static void main(String[] args) {

		bigString("This", "and", 1);

	}

	public static void bigString(String str1, String str2, int i1) {

		String big = "";

		for (int i = 1; i <= i1; i++) {

			big = big + str1 + " ";

		}
		if (big.contains(" ")) {

			big=big.trim().replace(" ", str2);

		}
		System.out.println(big);

	} 

}
