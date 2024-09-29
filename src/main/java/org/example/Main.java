package org.example;
import games.Welcome;
import games.Divider;


public class Main {
    public static void main(String[] args) {
        Welcome welcome = new Welcome();
        Divider divider = new Divider();

        String userName;

        userName = welcome.SayHello();

        //Играем в НОК
        divider.PlayInDivider(userName);






        }
}
