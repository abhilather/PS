import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Week4AssignmentRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, TreeSet<String>> dictionary = new TreeMap<>();
		dictionary.put("GoodMorning", new TreeSet(Set.of("GoodMorning", "Shubhodaya", "Shubhoday", "Bonjour")));
		dictionary.put("GoodEvening", new TreeSet(Set.of("good Evening", "Shubh sange", "susandhya", "Bonsoir")));

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a word");
		String word = scanner.nextLine();
		if (dictionary.containsKey(word)) {
			System.out.println("Synonyms for the word " + word + " :-");
			for (String str : dictionary.get(word)) {
				System.out.println(str);
			}
		} else {
			System.out.println(
					"The current word is not present in the dictionary. Press \"Y\" to add the word. Press \"N\" to cancel.");
			String responseOfUser = scanner.nextLine();
			if (responseOfUser.equals("Y")) {
				dictionary.put(word, new TreeSet());
				while(true) {
					System.out.println("Please enter a new synonym. Press Enter to stop.");
					String synonym = scanner.nextLine();
					if(synonym.equals("")) {
						break;
					}else {
						Set<String> s = dictionary.get(word);
						s.add(synonym);
						dictionary.put(word, (TreeSet<String>) s);
					}

				}
				System.out.println("Synonyms for the word " + word + " :-");
				for (String str : dictionary.get(word)) {
					System.out.println(str);
				}
			}
			scanner.close();
		}

	}
}
