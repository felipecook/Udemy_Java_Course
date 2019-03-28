package edu.cnm.deepdive;

public class Lamp {

  private String brand;
  private String color;
  private String brightness;

  public Lamp(String brand, String color, String brightness) {
    this.brand = brand;
    this.color = color;
    this.brightness = brightness;
  }

  public String getBrand() {
    return brand;
  }

  public String getColor() {
    return color;
  }

  public String getBrightness() {
    return brightness;
  }

  public void turnOn() {
    System.out.println("Lamp is on");
  }


}
