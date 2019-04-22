package edu.cnm.deepdive1;

public class LargestPrime {

//  public static int getLargestPrime(int number) {
//
//    if (number < 2) {
//      return -1;
//    }
//
//    int var1 = 0;
//
//    for (int i = 0; i < number; i++) {
//      if (number % i == 0) {
//        var1 = i;
//      }
//    }
//
//    return var1;
//  }

  public static int getLargestPrime(int number) {
    if (number <= 1) return -1;
    for (int i = number; i > 1; i--) {

      if (number % i == 0) {
        number = i;
      }
    }
    return number;
  }

  public static void main(String[] args) {
    getLargestPrime(21);
  }

}
