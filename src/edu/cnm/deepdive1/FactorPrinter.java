package edu.cnm.deepdive1;

public class FactorPrinter {

  public static void printFactors(int number) {

    if (number < 1) {
      System.out.println("Invalid Value");
      return;
    }

    int factorialNumber = 1;

    do {
      if (number % factorialNumber == 0) {
        System.out.println(factorialNumber);
      }
      factorialNumber++;
    } while (factorialNumber <= number);

  }

}
