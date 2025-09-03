package Lesson04.dato.lektier;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dato01 {

    public static void main(String[] args) {
        /* metoder med statements */
        datemethod();
        }

    public static void datemethod() {
        //europæisk dato formateret (MM = nummer, MMM = forkotelse, MMMM = fuld månedsnavn)
        DateTimeFormatter formateu = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");

        //amerikansk dato formateret
        DateTimeFormatter formatus = DateTimeFormatter.ofPattern("MMMM.dd.yyyy");

        //localdate henter Lokal dato for nu og kalder objektet >date<
        LocalDate date = LocalDate.now();

        //formattere date via. format eu og format usa og kalder en ny string "dateeufinal" eksempelvis
        String dateeufinal = date.format(formateu);
        String dateusafinal = date.format(formatus);

        //Output for print og færdig formatterede datoer
        System.out.println("Amerikansk format: " + dateusafinal + "\nEuropæisk format: " + dateeufinal);
    }
}

