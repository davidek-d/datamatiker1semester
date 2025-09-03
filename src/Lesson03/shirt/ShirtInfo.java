package Lesson03.shirt;


public class ShirtInfo {
    public static void main(String[] args) {

        //first t-shirt
        Shirt s1 = new Shirt();
        s1.color = "Black ";
        s1.size = "M ";
        s1.print = "Missing cat poster ";
        s1.cost = 49.99;
        s1.playIt();

        //second t-shirt
        Shirt s2 = new Shirt();
        s2.color = "Yellow ";
        s2.size = "S ";
        s2.print = "Beehive ";
        s2.cost = 29.99;
        s2.playIt();

        //third t-shirt
        Shirt s3 = new Shirt();
        s3.color = "Red ";
        s3.size = "L ";
        s3.print = "Tattoo design ";
        s3.cost = 69.99;
        s3.playIt();
    }
}
