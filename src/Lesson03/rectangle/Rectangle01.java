package Lesson03.rectangle;

public class Rectangle01 {
  //attributes
    private double length;
    private double width;

    //constructor
    public Rectangle01(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //method: calculate perimiter
    public double getPerimeter() {
        return (length * 2) + (width * 2);
    }
    //method: calculate area
    public double getArea() {
        return length * width;
    }
    //method: output information print
    public String getInfo() {
        return "Rectangle Information: length= " + length + ", width= " + width;
    }
}