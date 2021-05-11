package Assigment10;

public class assignment10_Q22 {

	public static void main(String[] args) {

		String html = "<!DOCTYPE html><html><head><title>Java</title></head><body><p id=\"myid\"></p></body></html>";

		if (html.contains("<html>")) {

			int i = html.indexOf("id");

			String front = html.substring(0, i + 4);

			String back = html.replace(front, "");

			int id = back.indexOf("\"");

			String idValue = back.substring(0, id);

			System.out.println(idValue);

		} else {
			System.out.println("Invalid input!");
		}

	}

}
