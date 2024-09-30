package Instruments;

public class AnswerCheck {
    public static void checkAnswer(long userAnswer, long correctAnswer, String name) {
        if(userAnswer == correctAnswer) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + name + "!");
        }
        else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
