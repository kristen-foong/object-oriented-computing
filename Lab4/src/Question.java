/**
 * The Question program takes a question and answer or a question, answer and difficulty
 * and also checks if the answer is correct.
 * 
 * @author: Kristen Foong
 * @date: January 25, 2019
 * @course: CPSC1181
 * @lab: Lab4
 */

public class Question {
	private String question, answer;
	private int difficulty;
	
	/**
	 * Constructor for the Question class
	 * @param question 		the string question
	 * @param answer 		an answer to the question provided
	 * @param difficulty 	the difficulty of the question
	 */
	public Question(String question, String answer, int difficulty) {
		this.question = question;
		this.answer = answer;
		this.difficulty = difficulty;
	}
	
	/**
	 * Overloaded constructor for the Question class with default difficulty of 1
	 * @param question		the question string
	 * @param answer		the answer to the question provided
	 */
	public Question(String question, String answer) {
		this.question = question;
		this.answer = answer;
		this.difficulty = 1;
	}
	
	/**
	 * Gets the question
	 * @return 	the question
	 */
	public String getQuestion() {
		return question;
	}
	
	/**
	 * Sets the question to the passed in string
	 * @param question	the new question to be set
	 */
	public void setQuestion(String question) {
		this.question = question;
	}
	
	/**
	 * Gets the answer
	 * @return	the answer to the question
	 */
	public String getAnswer() {
		return answer;
	}
	
	/**
	 * Sets the answer to the question
	 * @param answer	the new answer to be set
	 */
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	/**
	 * Gets the difficulty level of the question and makes sure the value is between 1 and 10
	 * @return the difficulty level
	 */
	public int getDifficulty() {
		if (difficulty < 1) {
			this.difficulty = 1;
		} else if (difficulty > 10) {
			this.difficulty = 10;
		}
		return difficulty;
	}

	/**
	 * Sets the difficulty level of the question
	 * @param difficulty	the new difficulty level to be set
	 */
	public void setDifficulty(int difficulty) {
		if (difficulty < 1) {
			this.difficulty = 1;
		} else if (difficulty > 10) {
			this.difficulty = 10;
		} else {
			this.difficulty = difficulty;
		}
	}

	/**
	 * Summarizes the information about the question
	 */
	public String toString() {
		String str = this.question + " " + this.answer + " " + this.difficulty;
		return str;
	}

	/**
	 * Checks if the question has been answered correctly
	 * @param attemptedAnswer	the user's answer to the question
	 * @return					whether the answer is true or false
	 */
	public boolean isCorrect(String attemptedAnswer) {
		if (attemptedAnswer == null) {
			return false;
		}else if(attemptedAnswer.equalsIgnoreCase(this.getAnswer())) {
			return true;
		}else {
			return false;
		}
	}
	
	public String display() {
		String str = this.getQuestion() + " Difficulty: " + this.getDifficulty();
		return str;
	}
}
