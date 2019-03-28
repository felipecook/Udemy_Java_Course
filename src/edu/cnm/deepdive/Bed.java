package edu.cnm.deepdive;

public class Bed {

  private BedDimensions bedDimensions;
  private String color;
  private String brand;

  public Bed(BedDimensions bedDimensions, String color, String brand) {
    this.bedDimensions = bedDimensions;
    this.color = color;
    this.brand = brand;
  }

  public BedDimensions getBedDimensions() {
    return bedDimensions;
  }

  public String getColor() {
    return color;
  }

  public String getBrand() {
    return brand;
  }



}
