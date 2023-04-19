package Uebung02;

public class TurboLernenFuerPruefungenTestlauf {
    public static void main(String[] args) {
        TurrboLernenFuerPruefung t1 = new TurrboLernenFuerPruefung();
        try{
            t1.lernen(true);
        } catch (PruefungsPanik p){
            System.out.println(p.getMessage());
        }

    }
}
