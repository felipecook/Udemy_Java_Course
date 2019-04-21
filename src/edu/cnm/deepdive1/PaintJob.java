package edu.cnm.deepdive1;

public class PaintJob {

  public static int getBucketCount(double width, double height,
      double areaPerBucket, int extraBuckets) {
    if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
      return -1;
    }
    return getBucketCount((width * height), areaPerBucket) - extraBuckets;

  }

  public static int getBucketCount(double width, double height, int areaPerBucket) {
    return getBucketCount(width, height, areaPerBucket, 0);
  }

  public static int getBucketCount(double area, double areaPerBucket) {
    if (area <= 0 || areaPerBucket <=0) {
      return -1;
    }
    return (int) Math.ceil(area / areaPerBucket);

  }



    public static void main(String[] args) {
    System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
  }



}
