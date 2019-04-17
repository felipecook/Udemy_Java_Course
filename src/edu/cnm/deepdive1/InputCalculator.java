package edu.cnm.deepdive1;

import java.util.Scanner;

public class InputCalculator {

  public static void inputThenPrintSumAndAverage() {

    int counter = 0;
    int sum = 0;
    long average = 0;
    int number = 0;
    Scanner scanner = new Scanner(System.in);



    while (true) {
      boolean hasNextInt = scanner.hasNextInt();

      if (hasNextInt) {
        number = scanner.nextInt();
        sum += number;

      } else {
        break;
      }
      counter++;

      scanner.nextLine();
    }


    average = Math.round((double) sum / counter);

    System.out.println("SUM = " + sum + " AVG = " + average);
    scanner.close();
  }




}
