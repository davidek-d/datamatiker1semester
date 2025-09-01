package Lesson03.rectangle;

public class Rectangle02 {

    public static void main(String[] args) {
        OpretRectangle();
    }

    public static void OpretRectangle() {
        //Create rectangle
        Rectangle01 r1 = new Rectangle01(5, 5);
        UdskrivArealer(r1);
    }

    public static void UdskrivArealer(Rectangle01 r) {
        //Print
        System.out.println("Perimeter: " + r.getPerimeter());
        System.out.println("Area: " + r.getArea());
        System.out.println("Information: " + r.getInfo());
    }
}

