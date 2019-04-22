package edu.cnm.deepdive1;

public class PerfectNumber {

  public static boolean isPerfectNumber(int number) {

    if (number < 1) {
      return false;
    }

    int var1 = 0;

    for (int i = 1; i < number; i++) {

      if (number % i == 0) {
        var1 += i;
      }

    }

    return var1 == number;

  }

  public static void main(String[] args) {
    isPerfectNumber(6);
  }


}
