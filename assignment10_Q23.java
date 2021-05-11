package Assigment10;

public class assignment10_Q23 {

	public static void main(String[] args) {

		String str = "breadbutterbread";

		if (str.indexOf("bread") >= 0) {

			int i = str.indexOf("bread");
			int j = str.indexOf("bread", i + 1);

			if (i != j && j != -1) {

				System.out.println(str.substring(i + 5, j));
			} else {
				System.out.println("nothing");
			}

		}

	}

}
