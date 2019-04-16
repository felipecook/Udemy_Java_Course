package edu.cnm.deepdive1;

public class LastDigitChecker {

  public static boolean hasSameLastDigit (int number1, int number2, int number3) {


    if (isValid(number1) && isValid(number2) && isValid(number3)) {
      int number1LastDigit = number1 % 10;
      int number2LastDigit = number2 % 10;
      int number3LastDigit = number3 % 10;

      if ((number1LastDigit == number2LastDigit || number1LastDigit == number3LastDigit) || (number2LastDigit == number3LastDigit)) {
        return true;
      } else {
        return false;
      }

    } else {
      return false;
    }
  }

  public static boolean isValid (int number) {
    return (number > 9 && number < 1001);
  }

  public static void main(String[] args) {
    System.out.println(hasSameLastDigit(12, 145, 1000));
  }
}
