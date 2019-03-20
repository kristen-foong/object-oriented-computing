/**
 * The NumericQuestion class takes a question, answer, difficulty, and a tolerance
 * where tolerance is the amount by which the answer can differ. NumericQuestion's
 * isCorrect overrides the parent method to allow checking for an answer within range.
 * 
 * @author Kristen Foong
 * @date: January 25, 2019
 * @course: CPSC1181
 * @lab: Lab4
 */

public class NumericQuestion extends Question{
	public double tolerance;
	
	/**
	 * The NumericQuestion constructor
	 * @param q		The numeric question
	 * @param a		The numeric answer
	 * @param d		The difficulty of the question
	 * @param t		The tolerance range allowed
	 */
	public NumericQuestion(String q, String a, int d, double t) {
		super(q,a,d);
		this.tolerance = t;
	}
	
	/**
	 * The isCorrect method overrides the parent method and checks 
	 * if the answer is within the tolerated range
	 * @param attempt 	the attempted answer string
	 * @return 			whether the answer is correct or not
	 */
	public boolean isCorrect(String attempt) {
		double answer = Double.valueOf(this.getAnswer());
		double low = answer - this.tolerance;
		double high = answer + this.tolerance;
		if(attempt == null) {
			return false;
		}else if(answer == Double.valueOf(attempt)){
			return true;
		}else if(Double.valueOf(attempt) >= low && Double.valueOf(attempt) <= high) {
			return true;
		}else {
			return false;
		}
	}
}
