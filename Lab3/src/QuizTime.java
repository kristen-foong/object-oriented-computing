/**
 * The QuizTime program creates two quizzes and gives them to the user.
 * QuizTime prints the questions and also displays the scores and number of quizzes to do.
 * 
 * @author: Kristen Foong
 * @date: January 18, 2019
 * @course: CPSC1181
 * @lab: Lab3
 */

public class QuizTime {

	public static void main(String[] args) {
		
		// Quiz 1
		Question q1 = new Question("Who composed Eine Kleine Nacht Musik?", "Mozart", 3);
		Question q2 = new Question("Who composed the Firebird Suite?", "Stravinsky", 5);
		Question q3 = new Question("Who composed Danse Macabre?", "Saint-Saens", 9);
		Question q4 = new Question("Who composed Clair de Lune?", "Debussy", 7);
		Question q5 = new Question("Who composed Moonlight Sonata?", "Beethoven");
		Quiz quiz1 = new Quiz(4);
		quiz1.add(q1);
		quiz1.add(q2);
		quiz1.add(q3);
		quiz1.add(q4);
		quiz1.add(q5);
		
		//Quiz 2
		Question a1 = new Question("Who wrote The Name of the Wind?", "Rothfuss", 9);
		Question a2 = new Question("Who wrote Much Ado About Nothing?", "Shakespeare", 5);
		Question a3 = new Question("Who wrote Percy Jackson?", "Riordan", 3);
		Question a5 = new Question("Who wrote Lord of the Rings?", "Tolkien", 2);
		Question a4 = new Question("Who wrote Harry Potter?", "Rowling");
		Quiz quiz2 = new Quiz();
		quiz2.add(a1);
		quiz2.add(a2);
		quiz2.add(a3);
		quiz2.add(a4);
		quiz2.add(a5);
		
		// giveQuiz
		quiz1.giveQuiz();
		quiz2.giveQuiz(1,4);
	}

}
