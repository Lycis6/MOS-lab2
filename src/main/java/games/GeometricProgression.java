package games;
import java.util.Random;
import java.util.Scanner;
import Instruments.AnswerCheck;

public class GeometricProgression {
    public static void playInGeometricProgression(String name){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        int length, numOfMissing; //длина и номер пропущенного
        long [] progression; //массив с прогрессией
        long multiplier = rnd.nextLong(2,20);; //множитель и ответ пользователя

        length = rnd.nextInt(5,10);
        numOfMissing = Math.abs(length - rnd.nextInt(5,10));
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
        AnswerCheck.checkAnswer(sc.nextLong(),progression[numOfMissing],name); //сверка ответов
    }
}
