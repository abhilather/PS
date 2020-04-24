package training.sapient.publicis;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimerValues {

	public static void main(String[] args) {
		ArrayList<ArrayList<Object>> finalArray = new ArrayList<ArrayList<Object>>();
		int[] primeArray = { 1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
				89, 97 };
		for (int i = 0; i < 26; i++) {
			ArrayList<Object> al = new ArrayList<>();
			al.add((char) (i + 65));
			al.add(primeArray[i]);
			finalArray.add(al);
		}
		System.out.println("Please enter a word: ");
		try (Scanner scanner = new Scanner(System.in)) {
			String name = scanner.nextLine();
			String result = "";
			for (int i = 0; i < name.length() - 1; i++) {
				result += finalArray.get(name.charAt(i) - 65).get(1) + ", ";
			}
			result += finalArray.get(name.charAt(name.length() - 1) - 65).get(1);
			System.out.println(result);
		}
	}
}
