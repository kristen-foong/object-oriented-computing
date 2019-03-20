/**
 * The FillInQuestion class is a subclass of the Question class
 * A statement is provided in which the answer is already given, with the answer
 * nested between two underscore marks. The methods getQuestion and getAnswer
 * take the question and answer from the provided statement.
 * 
 * @author Kristen Foong
 * @date: January 25, 2019
 * @course: CPSC1181
 * @lab: Lab4
 */

public class FillInQuestion extends Question {
	
	/**
	 * Gets a question with the answer between two '_', and also takes into account the
	 * difficulty. Calls the Question constructor.
	 * @param state		The question which contains the answer between two '_' marks
	 * @param diff		The difficulty of the Question
	 */
	public FillInQuestion(String state, int diff) {
		super(getQuestion(state), getAnswer(state), diff);
	}
	
	/**
	 * Overloads the parent method and gets the question which includes the answer
	 * between two '_' marks, then returns a String question with the answer omitted.
	 * @param state		The question to be passed in, which includes the answer
	 * @return			The question without the answer included
	 */
	public static String getQuestion(String state) {
		int startAns = state.indexOf("_");
		int endAns = state.lastIndexOf("_");
		String question = state.substring(0, startAns);
		question += "_____";
		question += state.substring(endAns, state.length());
		return question;
	}
	
	
	/**
	 * Overloads the parent method and gets the answer from the question statement
	 * @param state		The question which includes the answer
	 * @return			The string answer
	 */
	public static String getAnswer(String state) {
		int startAns = state.indexOf("_") + 1;
		int endAns = state.lastIndexOf("_");
		String ans = state.substring(startAns, endAns);
		return ans;
	}
}
