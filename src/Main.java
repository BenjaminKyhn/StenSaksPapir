import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Velkommen til sten, saks, papir 1.0. Du spiller nu 10 runder mod computeren.\n");

        Haand benjamin = Haand.PAPIR;
        Haand kelvin = Haand.PAPIR;
        Haand henrik = Haand.SAKS;

        //Her starter spillet
        StenSaksPapir runde1 = new StenSaksPapir();
        //System.out.println(runde1.slaa(kelvin, henrik));

        for (int i = 0; i < 10; i++) {
            //Indlæse spillerens hånd
            Scanner input = new Scanner(System.in);
            System.out.println("Vælg sten, saks eller papir: ");
            String spillerenString = input.next();
            Haand spillersHaand = null;
            if (spillerenString.equalsIgnoreCase("sten")) {spillersHaand = Haand.STEN;}
            else if (spillerenString.equalsIgnoreCase("saks")) {spillersHaand = Haand.SAKS;}
            else if (spillerenString.equalsIgnoreCase("papir")) {spillersHaand = Haand.PAPIR;}
            else {
                System.out.println("Du har tastet forkert input. Spillet slutter.");
                System.exit(0);
            }

            System.out.println("Spilleren slår " + spillersHaand);

            //Computeren generer en hånd
            Haand computersHaand = null;
            int haandInt = (int)(Math.random()*3+1);
            // computersHaand = Haand.values()[haandInt]; /** Smart metode */
            if (haandInt == 1) {computersHaand = Haand.STEN;}
            if (haandInt == 2) {computersHaand = Haand.SAKS;}
            if (haandInt == 3) {computersHaand = Haand.PAPIR;}
            System.out.println("Computeren slår " + computersHaand);

            //Sammenligne med slaa metoden
            int resultat = runde1.slaa(computersHaand, spillersHaand);

            //Udråb en vinder
            if (resultat == 0)
                System.out.println("Spillet er uafgjort.\n");
            if (resultat == 1)
                System.out.println("Computeren har vundet.\n");
            if (resultat == 2)
                System.out.println("Spilleren har vundet.\n");
        }
        }
}
