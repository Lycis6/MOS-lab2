package games;
import java.util.Scanner;

public class Welcome {
    public String SayHello(){
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        name = sc.nextLine();
        System.out.println("Hello, "+name+"!");
        System.out.println("Welcome to the Brain Games!");
        return name;
    }
}


