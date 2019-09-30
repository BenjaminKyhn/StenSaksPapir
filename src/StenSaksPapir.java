public class StenSaksPapir {

    /** Hvis den første hånd vinder, returneres 1.
     * Hvis den anden hånd vinder, returneres 2.
     * Hvis den tredje hånd vinder, returneres 0.
     * Hvis, der er en fejl, returneres -1.
     */
    int slaa(Haand a, Haand b){
        int resultat = -1;

        //Første hånd sten
        if (a == Haand.STEN){
            //Anden hånd sten
            if (b == Haand.STEN) { resultat = 0; }
            //Anden hånd saks
            if (b == Haand.SAKS){ resultat = 1; }
            //Anden hånd papir
            if (b == Haand.PAPIR){ resultat = 2; }
        }
        //Første hånd saks
        if (a == Haand.SAKS){
            //Anden hånd sten
            if (b == Haand.STEN) { resultat = 2; }
            //Anden hånd saks
            if (b == Haand.SAKS){ resultat = 0; }
            //Anden hånd papir
            if (b == Haand.PAPIR){ resultat = 1; }
        }
        //Første hånd papir
        if (a == Haand.PAPIR){
            //Anden hånd sten
            if (b == Haand.STEN) { resultat = 1; }
            //Anden hånd saks
            if (b == Haand.SAKS){ resultat = 2; }
            //Anden hånd papir
            if (b == Haand.PAPIR){ resultat = 0; }
        }
        return resultat;
    }

    // TODO flereKampe(){}
}
