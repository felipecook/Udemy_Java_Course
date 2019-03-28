package edu.cnm.deepdive;

public class Main {

  public static void main(String[] args) {
    Dimensions dimensions = new Dimensions("10 Feet", "8 Feet", "10 Feet");
    Lamp lamp = new Lamp("Sony", "Blue", "Very Bright");
    Room room = new Room(
        "Blue",
        dimensions,
        new Bed(new BedDimensions("6 Feet", "2 Feet", "3 Feet"), "Blue", "Unknown"),
        lamp
    );

    room.getLamp().turnOn();
  }


}
