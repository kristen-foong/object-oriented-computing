/**
 * The MultiChoiceQuestion class is a subclass of Question. It creates a question
 * which has multiple possible answers. The method display() overrides the parent method
 * to display all possible choices. The addChoices method adds possible answers
 * to the arraylist choices.
 * 
 * @author Kristen Foong
 * @date: January 25, 2019
 * @course: CPSC1181
 * @lab: Lab4
 */

import java.util.ArrayList;

public class MultiChoiceQuestion extends Question{
	private ArrayList<String> choices;
	
	/**
	 * The constructor for the MultiChoiceQuestion class
	 * @param q			The question to be passed in
	 * @param diff		The difficulty of the question
	 */
	public MultiChoiceQuestion(String q, int diff) {
		super(q, "", diff);
		this.choices = new ArrayList<String>();
	}
	
	/**
	 * Displays the question along with all possible choices.
	 * @return 		A string displaying the question, all possible choices, and instructions
	 */
	public String display() {
		String str = this.getQuestion() + " (" + this.getDifficulty() + ")\n";
		int count = 1;
		for(String choice : choices) {
			str += count + ". " + choice + "\n";
			count++;
		}
		str += "Enter all correct answers. For example, if you think 1 and 2 are correct, enter 12.";
		return str;
	}
	
	/**
	 * addChoice adds to the ArrayList choices, which lists possible choices
	 * addChoice also sets the correct answer
	 * @param a			a string containing a possible answer
	 * @param correct	a boolean whether the passed in answer is correct
	 */
	public void addChoice(String a, boolean correct) {
		choices.add(a);
		if(correct == true) {
			String ans = this.getAnswer();
			ans += Integer.toString(choices.size());
			this.setAnswer(ans);
		}
	}
}
