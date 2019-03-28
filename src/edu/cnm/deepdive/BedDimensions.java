package edu.cnm.deepdive;

public class BedDimensions {

  private String length;
  private String height;
  private String width;

  public BedDimensions(String length, String height, String width) {
    this.length = length;
    this.height = height;
    this.width = width;
  }

  public String getLength() {
    return length;
  }

  public String getHeight() {
    return height;
  }

  public String getWidth() {
    return width;
  }

}
