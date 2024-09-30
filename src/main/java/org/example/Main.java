package org.example;
import games.Welcome;
import games.Divider;
import games.GeometricProgression;


public class Main {
    public static void main(String[] args) {
        Welcome welcome = new Welcome();
        Divider divider = new Divider();
        GeometricProgression progression = new GeometricProgression();
        String userName;

        userName = welcome.SayHello();

        //Играем в НОК
        divider.playInDivider(userName);

        //Играем в Геометрическую прогрессию
        progression.playInGeometricProgression(userName);







        }
}
