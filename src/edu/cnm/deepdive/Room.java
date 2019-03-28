package edu.cnm.deepdive;

public class Room {

  private String roomColor;
  private Dimensions dimensions;
  private Bed bed;
  private Lamp lamp;

  public Room(String roomColor, Dimensions dimensions, Bed bed, Lamp lamp) {
    this.roomColor = roomColor;
    this.dimensions = dimensions;
    this.bed = bed;
    this.lamp = lamp;
  }

  private String getRoomColor() {
    return roomColor;
  }

  private Dimensions getDimensions() {
    return dimensions;
  }

  private Bed getBed() {
    return bed;
  }

  public Lamp getLamp() {
    return lamp;
  }




}

