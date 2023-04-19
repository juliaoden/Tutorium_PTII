package Uebung02;

public class TurrboLernenFuerPruefung {
    public void lernen(boolean nochGenugZeit) throws PruefungsPanik{
        if(nochGenugZeit){
            System.out.println("Großartiges Zeitmanagement. Weiter so!");
        }else{
            throw new PruefungsPanik("In der Ruhe liegt die Kraft");
        }
    }
}
