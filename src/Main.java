import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sten saks papir 1.0");

        Haand benjamin = Haand.PAPIR;
        Haand kelvin = Haand.PAPIR;
        Haand henrik = Haand.SAKS;

        //Her starter spillet
        StenSaksPapir runde1 = new StenSaksPapir();
        //System.out.println(runde1.slaa(kelvin, henrik));

        //Indlæse spillerens hånd
        Scanner input = new Scanner(System.in);
        Haand spillersHaand = null;
        String spillerenString = input.next();
        if (spillerenString.equalsIgnoreCase("sten")) {spillersHaand = Haand.STEN;}
        if (spillerenString.equalsIgnoreCase("saks")) {spillersHaand = Haand.SAKS;}
        if (spillerenString.equalsIgnoreCase("papir")) {spillersHaand = Haand.PAPIR;}
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
        System.out.println("Resultatet er " + resultat);
        // TODO vis resultatet mere meningsfyldt
    }
}
