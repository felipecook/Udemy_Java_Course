package edu.cnm.deepdive1;

public class NumberToWords {

  //prints the passed number using words instead of numbers
  public static void wordsToDigits (int number) {
    if (number < 0) {
      System.out.println("Invalid Value");
    }

    if (number == 0) {
      System.out.println("Zero");
    }

    int reversedNumber = reverse(number);

    int digitCountOfReversedNumber = getDigitCount(reversedNumber);
    int digitCountOfNumber = getDigitCount(number);



    int lastDigit = 0;

    while (reversedNumber != 0) {

      lastDigit = reversedNumber % 10;

      reversedNumber /= 10;

      switch (lastDigit) {
        case 0 :
          System.out.print("Zero ");
          break;
        case 1 :
          System.out.print("One ");
          break;
        case 2 :
          System.out.print("Two ");
          break;
        case 3 :
          System.out.print("Three ");
          break;
        case 4 :
          System.out.print("Four ");
          break;
        case 5 :
          System.out.print("Five ");
          break;
        case 6 :
          System.out.print("Six ");
          break;
        case 7 :
          System.out.print("Seven ");
          break;
        case 8 :
          System.out.print("Eight ");
          break;
        case 9 :
          System.out.print("Nine ");
          break;


      }
    }

    if (digitCountOfReversedNumber != digitCountOfNumber) {
      int counter = digitCountOfNumber - digitCountOfReversedNumber;
      for (int i = 0; i < counter; i++) {
        System.out.print("Zero ");
      }
    }

  }


  public static int reverse (int number) {

    int reversedNumber = 0;
    int lastDigit = 0;

    while (number != 0) {

      lastDigit = number % 10;
      reversedNumber += lastDigit;
      number /= 10;
      if (number == 0) {
        break;
      }
      reversedNumber *= 10;

    }

    return reversedNumber;
    
  }

  public static int getDigitCount (int number) {
    int counter = 0;
    if (number < 0) {
      return -1;
    }
    else if (number == 0) {
      return 1;
    } else {
      while (number != 0) {
        counter++;
        number /= 10;

      }
    }
    return counter;
  }

  public static void main(String[] args) {
    wordsToDigits(10);
  }

}
