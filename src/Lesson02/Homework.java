package Lesson02;

public class Homework  {
    //remember to write in English

    public static void main(String[] args) {
        //extra methods
        namestring();
    }

public static String stars(){
        //string with text - stars
        String Text = "***********************";
        return Text;
}

    public static void namestring() {
        //method with string text and print
        String name = "* David K Johannessen *";
        String mail = "* dajo1002@stud.ek.dk *";

        System.out.println(stars());
        System.out.println(name);
        System.out.println(mail);
        System.out.println(stars());
    }
}
