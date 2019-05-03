package edu.cnm.deepdive1;

public class NumberToWords {

  //prints the passed number using words instead of numbers
  public static void wordsToDigits (int number) {
    if (number < 0) {
      System.out.println("Invalid Value");
    }

    int reversedNumber = reverse(number);

    int lastDigit = 0;

    while (number != 0) {

      lastDigit = reversedNumber % 10;

      reversedNumber /= 10;

      switch (lastDigit) {
        case 0 :
          System.out.println("Zero");
          break;
        case 1 :
          System.out.println("One");
          break;
        case 2 :
          System.out.println("Two");
          break;
        case 3 :
          System.out.println("Three");
          break;
        case 4 :
          System.out.println("Four");
          break;
        case 5 :
          System.out.println("Five");
          break;
        case 6 :
          System.out.println("Six");
          break;
        case 7 :
          System.out.println("Seven");
          break;
        case 8 :
          System.out.println("Eight");
          break;
        case 9 :
          System.out.println("Nine");
          break;


      }
    }

  }


  public static int reverse (int number) {

    int reversedNumber = 0;
    int holderVariable = 0;

    while (number != 0) {

      holderVariable = number % 10;

      reversedNumber += holderVariable;

      reversedNumber *= 10;

      number /= 10;


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
    int test = getDigitCount(10);
    System.out.println(test);
    int reverse = reverse(10);
    System.out.println(reverse);
  }
}
