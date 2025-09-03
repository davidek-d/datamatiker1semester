package Lesson04.dato.scanner01;

import java.util.Scanner;

public class scannerTest {
    public static void main(String[] args) {
        tivoliRide();


    }
    public static void tivoliRide() {

        // scanner lavet
        Scanner input = new Scanner(System.in);

        // printout prompt for at få input af bruger
        System.out.println("Welcome. Enter your height in meters!");
        // gør height til input af bruger
        double height = input.nextDouble();

        // laver objekt med input
        Tivoli heightInput = new Tivoli(height);

        //lukker mulighed for flere input
        input.close();

        }
        }
