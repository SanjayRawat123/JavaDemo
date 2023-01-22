/*
 * Author Name:Sanjay Singh Rawat
 * Date: 1/20/2023
 * Created With: IntelliJ IDEA Community Edition
 */


package org.example;

import java.util.Scanner;

public class ReverseDigitDemo {
 public static void main(String[] args) {


  Scanner scanner = new Scanner(System.in);

  System.out.println("enter number that you want to reverse");
//take number from user and store that in variable num
  long num = scanner.nextInt();

  long reverse = 0;
  long remainder;
  while (num != 0) {
   remainder = num % 10;
   reverse = reverse * 10 + remainder;
   num = num / 10;


  }
  System.out.println("reverse number = " + reverse);

 }


}
