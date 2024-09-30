package games;
import java.util.Random;
import java.util.Scanner;

public class Divider {

    public static void playInDivider(String name) {
        Random rnd = new Random();
        long correctAnswer, userAnswer;
        long number1 = rnd.nextLong(1,99);
        long number2 = rnd.nextLong(1,99);
        long number3 = rnd.nextLong(1,99);
        Scanner sc = new Scanner(System.in);

        System.out.println("Find the smallest common multiple of given numbers.");
        System.out.println("Question: "+number1+" "+number2+" "+number3);
        System.out.print("Your answer: ");

        userAnswer = sc.nextLong();
        correctAnswer = lcm3(number1, number2, number3);

        //сверка ответов
        if(userAnswer == correctAnswer) {
            System.out.println("Correct!");
            System.out.println("Congratulations, " + name + "!");
        }
        else{
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
            System.out.println("Let's try again, " + name + "!");
        }
    }

    static long gcd(long a,long b){ //НОД
        return b == 0 ? a : gcd(b,a % b);
    }

    static long lcm(long a,long b){ //НОК
        return a / gcd(a,b) * b;
    }

    static long lcm3(long a, long b, long c){ //НОК для 3 чисел
        return lcm(a,lcm(b,c));
    }

}
