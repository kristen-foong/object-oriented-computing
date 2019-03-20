/**
 * The QuizTime program creates two quizzes and gives them to the user.
 * QuizTime prints the questions and also displays the scores and number of quizzes to do.
 * 
 * @author: Kristen Foong
 * @date: January 25, 2019
 * @course: CPSC1181
 * @lab: Lab4
 */

public class QuizTime {

	public static void main(String[] args) {
		
		// Quiz 1
		Question q1 = new Question("Who composed the Firebird Suite?", "Stravinsky", 5);
		FillInQuestion q2 = new FillInQuestion("_Beethoven_ composed Moonlight Sonata.", 1);
		FillInQuestion q3 = new FillInQuestion("The Harry Potter Series was written by _Rowling_", 2);
		NumericQuestion q4 = new NumericQuestion("17.5 - 2.1 = ?", "15.4", 6, 0.5);
		NumericQuestion q5 = new NumericQuestion("20 - 10 = ?", "10", 1, 1);
		MultiChoiceQuestion q6 = new MultiChoiceQuestion("Which of these are dog breeds?", 4);
		q6.addChoice("calico", false);		
		q6.addChoice("bulldog", true);
		q6.addChoice("terrier", true);
		q6.addChoice("tabby", false);
		MultiChoiceQuestion q7 = new MultiChoiceQuestion("What colors are shades?", 2);
		q7.addChoice("purple", false);
		q7.addChoice("black", true);
		q7.addChoice("red", false);
		q7.addChoice("brown", true);
		Quiz quiz1 = new Quiz(6);
		quiz1.add(q1);
		quiz1.add(q2);
		quiz1.add(q3);
		quiz1.add(q4);
		quiz1.add(q5);
		quiz1.add(q6);
		quiz1.add(q7);
		
		// giveQuiz
		quiz1.giveQuiz();
	}

}
