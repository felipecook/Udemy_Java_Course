package edu.cnm.deepdive1;

public class IntEqualityPicker {

  public static void printEqual(int varA, int varB, int varC) {
    if (varA <= 0 || varB <= 0 || varC <= 0) {
      System.out.println("Invalid Value");
    } else if (varA == varC && varA == varB) {
      System.out.println("All numbers are equal");
    } else if (varA != varC && varB != varC && varA != varB) {
      System.out.println("All numbers are different");
    } else {
      System.out.println("Neither all are equal or different");
    }
  }


}
