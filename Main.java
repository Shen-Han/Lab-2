package Lab2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.printf("How old/young are you?:%n");
        Scanner age = new Scanner(System.in);
        int age1 = age.nextInt();
        //scanning for an integer not string.

        System.out.printf("%s", canDo(age1));
        //Using canDo to call a method using the input from Scanner above.
    }

    public static String canDo(int age1) {
        if ( age1 > 5 && age1 <= 16) {
            //Learned to use && to put two conditions, commas do not work.
            return "Go ride a bike.";
        } else if (age1 > 16 && age1 <=18) {
            //using <= symbol to fill in the one year in age that would be omitted if I just used a smaller than symbol.
            return "Have fun as you ride a bike, drive a car.";
        } else if (age1 > 18 && age1 <=19) {
            return "Now you can ride a bike, drive a car, vote.";
        } else if (age1 > 19) {
            return "FInally, you can ride a bike, drive a car, vote and order an alcoholic beverage.";
        } else if (age1 < 0) {
            return "You are speaking from the womb! What a prodigy!!!";
        } else {
            return "You are young... too young... You can probably still ride a bike though...";
        }

    }
}