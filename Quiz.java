package training.sapient.publicis;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	private static ArrayList<Question> questions;


	public ArrayList<Question> getQuestions() {
		return questions;
	}


	public static void main(String[] args) {


		questions = new ArrayList<>();
		Question q = new Question();
		q.setQuestion("Who was the first Indian woman in Space?");
		q.setOpt1("A. Kalpana Chawla");
		q.setOpt2("B. Sunita Williams");
		q.setOpt3("C. Koneru Humpy");
		q.setOpt4("D. None of the above");
		q.setCorrectOpt("A");
		questions.add(q);

		Question q2 = new Question();
		q2.setQuestion("Who was the first Indian in space?");
		q2.setOpt1("A. Vikram Ambalal");
		q2.setOpt2("B. Ravish Malhotra");
		q2.setOpt3("C. Rakesh Sharma");
		q2.setOpt4("D. Nagapathi Bhat");
		q2.setCorrectOpt("C");
		questions.add(q2);

		Question q3 = new Question();
		q3.setQuestion("Who was the first Man to Climb Mount Everest Without Oxygen?");
		q3.setOpt1("A. Junko Tabei");
		q3.setOpt2("B. Reinhold Messner");
		q3.setOpt3("C. Peter Habeler");
		q3.setOpt4("D. Phu Dorji");
		q3.setCorrectOpt("D");
		questions.add(q3);

		Question q4 = new Question();
		q4.setQuestion("Who built the Jama Masjid?");
		q4.setOpt1("A. Jahangir");
		q4.setOpt2("B. Akbar");
		q4.setOpt3("C. Imam Bukhari");
		q4.setOpt4("D. Shah Jahan");
		q4.setCorrectOpt("D");
		questions.add(q4);

		Question q5 = new Question();
		q5.setQuestion("Who wrote the Indian National Anthem?");
		q5.setOpt1("A. Bakim Chandra Chatterji");
		q5.setOpt2("B. Rabindranath Tagore");
		q5.setOpt3("C. Swami Vivekanand");
		q5.setOpt4("D. None of the above");
		q5.setCorrectOpt("B");
		questions.add(q5);

		Question q6 = new Question();
		q6.setQuestion("Who was the first Indian Scientist to win a Nobel Prize?");
		q6.setOpt1("A. CV Raman");
		q6.setOpt2("B. Hargobind Khorana");
		q6.setOpt3("C. Amartya Sen");
		q6.setOpt4("D. Subramanian Chrandrashekar");
		q6.setCorrectOpt("A");
		questions.add(q6);

		Question q7 = new Question();
		q7.setQuestion("Who is the first Indian to win a Nobel Prize?");
		q7.setOpt1("A. Rabindranath Tagore");
		q7.setOpt2("B. CV Raman");
		q7.setOpt3("C. Mother Theresa");
		q7.setOpt4("D. Hargobind Khorana");
		q7.setCorrectOpt("A");
		questions.add(q7);

		Question q8 = new Question();
		q8.setQuestion("Who was the first Indian woman to win the Miss World Title?");
		q8.setOpt1("A. Aishwarya Rai");
		q8.setOpt2("B. Sushmita Sen");
		q8.setOpt3("C. Reita Faria");
		q8.setOpt4("D. Diya Mirza");
		q8.setCorrectOpt("C");
		questions.add(q8);

		Question q9 = new Question();
		q9.setQuestion("Who was the first President of India?");
		q9.setOpt1("A. Abdul Kalam");
		q9.setOpt2("B. Lal Bahadur Shastri");
		q9.setOpt3("C. Dr. Rajendra Prasad");
		q9.setOpt4("D. Zakir Hussain");
		q9.setCorrectOpt("C");
		questions.add(q9);

		Question q10 = new Question();
		q10.setQuestion("Who was the first Indian to win the Booker Prize?");
		q10.setOpt1("A. Dhan Gopal Mukerji");
		q10.setOpt2("B. Nirad C. Chaudhuri");
		q10.setOpt3("C. Arundhati Roy");
		q10.setOpt4("D. Aravind Adiga");
		q10.setCorrectOpt("C");
		questions.add(q10);

		Scanner scanner = new Scanner(System.in);
		for (Question i : questions) {
			QuizTimer quizTimer = new QuizTimer(10);
			System.out.println(i.getQuestion());
			System.out.println(i.getOpt1());
			System.out.println(i.getOpt2());
			System.out.println(i.getOpt3());
			System.out.println(i.getOpt4());

			String answer = scanner.nextLine();
			if (answer.equals(i.getCorrectOpt())) {
				System.out.println("Correct Answer");
				System.out.println();
				quizTimer.setFlag(true);

			} else {
				System.out.println("Wrong Answer");
				System.out.println();
				quizTimer.setFlag(true);
			}

		}


	}


}

