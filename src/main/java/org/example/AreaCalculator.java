/*
 * Author Name:Sanjay Singh Rawat
 * Date: 1/20/2023
 * Created With: IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rep;
        int shape;
        do {

            System.out.println("Please enter 1 to find area of Rectangle");
            System.out.println("Please enter 2 to find area of Square");
            System.out.println("Please enter 3 to find area of Triangle");
            System.out.println("Please enter 4 to find area of Circle");

            double result;
            shape = scanner.nextInt();
            switch (shape) {
                case 1:
                    System.out.println("enter the length of rectangle");
                    double length = scanner.nextInt();
                    System.out.println("enter the width of rectangle");
                    double width = scanner.nextInt();
                    result = length * width;
                    System.out.println("Area of rectangle is = " + result);
                    break;

                case 2:
                    System.out.println("enter the side of Square");
                    double side = scanner.nextInt();
                    result = side * side;
                    System.out.println("Area of Square is = " + result);
                    break;


                case 3:
                    System.out.println("enter the base of Triangle");
                    double base = scanner.nextInt();
                    System.out.println("enter the height of Triangle");
                    double height = scanner.nextInt();
                    result = 0.5 * (base * height);
                    System.out.println("Area of Triangle is = " + result);
                    break;
                case 4:
                    System.out.println("enter the radius  of Cricle");
                    double radius = scanner.nextInt();
                    result = 3.141 * radius * radius;
                    System.out.println("Area of rectangle is = " + result);
                    break;
            }
            System.out.println("enter any number  for continue ");
            System.out.println("enter -1 for exit");
            rep = scanner.nextInt();
        } while (rep != -1);
        System.out.println("Thank you ! I hope that you enjoy");
    }

}
