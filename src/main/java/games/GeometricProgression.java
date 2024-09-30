package games;
import java.util.Random;
import java.util.Scanner;

public class GeometricProgression {
    public void playInGeometricProgression(String name){
        int length, numOfMissing; //длина и номер пропущенного
        long [] progression; //массив с прогрессией
        long multiplier, userAnswer; //множитель и ответ пользователя
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        length = rnd.nextInt(5,10);
        numOfMissing = Math.abs(length - rnd.nextInt(5,10));
        multiplier = rnd.nextLong(2,20);
        progression = new long[length];
        progression[0] = rnd.nextLong(1,10);

        for(int i = 1; i < length; i++){
            progression[i] = progression[i-1]*multiplier;
        }

        System.out.println("What number is missing in the progression?");
        System.out.print("Question: ");
        for (int i = 0; i < length; i++){
            if(i != numOfMissing){
                System.out.print(progression[i] + " ");
            }
            else{
                System.out.print(".. ");
            }
        }

        System.out.println();
        System.out.print("Your answer: ");
        userAnswer = sc.nextLong();
        if(userAnswer == progression[numOfMissing]){
            System.out.println("Correct");
            System.out.println("Congratulations, " + name + "!");
        }
        else {
            System.out.println("'" + userAnswer + "' " + "is wrong answer ;(. Correct answer was " + "'" +
                    progression[numOfMissing] +"'.");
            System.out.println("Let's try again, " + name + "!");
        }
    }
}
