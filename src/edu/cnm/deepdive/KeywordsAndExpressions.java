package edu.cnm.deepdive;

public class KeywordsAndExpressions {

  public static void main(String[] args) {

    System.out.println(calcFeetAndInchesToCentimeters(-1));
  }

  public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
    if ((feet < 0) || (inches <0 || inches > 12)) {
      return -1;
    }
    double centimeters = (feet * 12) * 2.54;
    centimeters += inches * 2.54  ;
    System.out.println("feet: " + feet + " inches: " + inches + " = centimeters: " + centimeters);
    return centimeters;
  }

  public static double calcFeetAndInchesToCentimeters(double inches) {
    if (inches < 0) {
      return -1;
    }
    int feet = (int) inches / 12;
    inches = inches % 12;
    return calcFeetAndInchesToCentimeters(feet, inches);
  }
}
