package org.example;
import games.Welcome;
import games.Divider;
import games.GeometricProgression;


public class Main {
    public static void main(String[] args) {
        String userName;

        userName = Welcome.SayHello();

        //Играем в НОК
        Divider.playInDivider(userName);
        Divider.playInDivider(userName);
        Divider.playInDivider(userName);

        System.out.println();

        //Играем в Геометрическую прогрессию
        GeometricProgression.playInGeometricProgression(userName);
        GeometricProgression.playInGeometricProgression(userName);
        GeometricProgression.playInGeometricProgression(userName);
        }
}
