/**
 * The Quiz program creates an array list of questions, prints the questions 
 * takes input from the user, checks the answers, and displays the score and
 * number of quizzes created.
 * 
 * @author: Kristen Foong
 * @date: January 25, 2019
 * @course: CPSC1181
 * @lab: Lab4
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
	private ArrayList<Question> quiz;
	static int score = 0;
	static int numQuiz = 0;
	
	/**
	 * Constructor for the Quiz class
	 */
	public Quiz(int questions) {
		quiz = new ArrayList<Question>(questions);
		numQuiz++;
	}
	
	/**
	 * default constructor for the Quiz class
	 */
	public Quiz() {
		quiz = new ArrayList<Question>(25);
		numQuiz++;
	}

	/**
	 * Gets the ArrayList of questions
	 * @return	the arrayList of questions
	 */
	public ArrayList<Question> getQuiz() {
		return quiz;
	}

	/**
	 * adds a question to the quiz array list
	 * @param q	the question to be added
	 */
	public void add(Question q) {
		if(quiz.size() <= 25) {
			quiz.add(q);
		}
	}

	/**
	 * calls giveQuiz and allows the difficulty level to be 
	 * anywhere between and including 1 and 10
	 */
	public void giveQuiz() {
		giveQuiz(1,10);
	}
	
	/**
	 * Overloaded constructor that accepts two difficulty levels
	 * and presents questions within that difficulty range
	 * @param minDiff	the minimum difficulty level
	 * @param maxDiff	the maximum difficulty level
	 */
	public void giveQuiz(int minDiff, int maxDiff) {
		for(int i = 0; i < quiz.size(); i++) {
			if(this.getQuiz().get(i).getDifficulty() < minDiff || this.getQuiz().get(i).getDifficulty() > maxDiff) {
				this.getQuiz().remove(i);
				i--;
			}
		}
		if(numQuiz > 1) {
			System.out.println("You have " + numQuiz + " quizzes to do.");
		}else {
			System.out.println("You have " + numQuiz + " quiz to do.");
		}
		Scanner sc = new Scanner(System.in);
		for (Question q : this.getQuiz()) {
			System.out.print(q.display());
			String response = sc.nextLine();
			if(q.isCorrect(response)) {
				System.out.println("Correct!");
				score++;
			}else {
				System.out.println("Incorrect.");
			}
		}
		System.out.println("Total Score: " + score + "/" + quiz.size());
		numQuiz--;
		score = 0;
	}
}
