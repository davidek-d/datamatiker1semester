package Lesson03.rectangle;

public class Rectangle03 {
    public static void main(String[] args) {
    //opret metode til kreation af rectangle
        rectanglePerimeter();

}

    public static void rectanglePerimeter()
    {
        //opret rectangle med værdier for length og width
        Rectangle01 r1 = new Rectangle01(5, 5);

        //udskriv og vurder arealer
        double perimeter1 = r1.getPerimeter();

        System.out.println("Rectangle perimeter is: " + perimeter1);
        if (perimeter1 >= 25) {
            System.out.println("Rectangle is 25 or more");
        } else {
            System.out.println("Rectangle is less than 25");{
            }
        }
    }
}

