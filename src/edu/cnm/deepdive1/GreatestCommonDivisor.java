package edu.cnm.deepdive1;

public class GreatestCommonDivisor {

  public static int getGreatestCommonDivisor(int number1, int number2) {
    if (number1 < 10 || number2 < 10) {
      return -1;
    }

    int lesserNumber = Math.min(number1, number2);
    int greatestCommonDivisor = 0;

    for (int i = 1; i <= lesserNumber;) {
      if (number1 % i == 0 && number2 % i == 0) {
        greatestCommonDivisor = i;
      }
      i++;
    }

    return greatestCommonDivisor;
  }

  public static void main(String[] args) {
    System.out.println(getGreatestCommonDivisor(12, 30));
  }

}
