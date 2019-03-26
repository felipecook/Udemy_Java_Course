package edu.cnm.deepdive;

import java.util.Scanner;

public class MinAndMaxInputChallenge {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int min = 0;
    int max = 0;
    int holder = 0;

    while (true) {
      System.out.println("Enter a number: ");
      boolean isNextInt = scanner.hasNextInt();

      if (isNextInt) {
        holder = scanner.nextInt();
        if (holder > max) {
          max = holder;
        } else if (holder < min) {
          min = holder;
        }
      } else {
        break;
      }

    }

    System.out.println("Your max number entered was: " + max);
    System.out.println("Your min number entered was: " + min);
    scanner.close();

  }

}
