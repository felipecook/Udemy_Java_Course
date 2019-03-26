package edu.cnm.deepdive;

import java.util.Scanner;

public class ReadingUserInputChallenge {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean hasNextInt;

    int counter = 0;
    int sum = 0;

    for (int i = 1; i < 11;) {
      System.out.println("Please enter #" + i);
      counter = scanner.nextInt();
      hasNextInt = scanner.hasNextInt();
      if (hasNextInt) {
        sum += counter;
        i++;
      } else {
        System.out.println("Please enter a valid number.");
      }
    }
    System.out.println(sum);

    scanner.close();


  }
}
