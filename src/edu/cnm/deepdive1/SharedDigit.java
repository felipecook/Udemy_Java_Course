package edu.cnm.deepdive1;

public class SharedDigit {

  public static boolean hasSharedDigit (int var1, int var2) {

    if (var1 < 10 || var1 > 99) {
      return false;
    }

    if (var2 < 10 || var2 > 99) {
      return false;
    }

    int var1LastDigit = var1 % 10;
    int var1FirstDigit = var1 / 10;

    int var2LastDigit = var2 % 10;
    int var2FirstDigit = var2 / 10;

    if (var1LastDigit == var2LastDigit) {
      return true;
    } else if (var1LastDigit == var2FirstDigit) {
      return true;
    } else if (var1FirstDigit == var2LastDigit) {
      return true;
    } else if (var1FirstDigit == var2FirstDigit) {
      return true;
    } else {
      return false;
    }

  }

  public static void main(String[] args) {
    System.out.println(hasSharedDigit(12, 43));
  }

}
