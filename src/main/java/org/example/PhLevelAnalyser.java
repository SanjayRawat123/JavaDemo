/*
 * Author Name:Sanjay Singh Rawat
 * Date: 1/20/2023
 * Created With: IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Scanner;

public class PhLevelAnalyser {
    public static void main(String[] args) {
        // create scanner class object and use it to take input from user

        Scanner scanner = new Scanner(System.in);

        //ask user to enter ph value of watter and store that in variable using scanner class object
        System.out.println("please enter ph value of water");
        double phValue = scanner.nextInt();

        //check the condition of  ph value  of water bye using logic

        if (phValue == 7) {
            System.out.println("ph value is low , partial water change required");
        } else if (phValue >= 7 && phValue <= 8) {
            System.out.println("ph value is fine ");

        } else {
            System.out.println("ph value is high, partial water change required");

        }


    }
}
