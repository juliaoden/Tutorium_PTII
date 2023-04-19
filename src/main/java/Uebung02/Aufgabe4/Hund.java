package Uebung02;

public class Hund {
    String name;
    int alter;


    public Hund (String name, int alter) throws HundeAlterInvalide {
        this.name = name;
        if (alter >= 0) {
            this.alter = alter;
        } else {
            throw new HundeAlterInvalide("Das ist eine Fehlermeldung");
        }
    }

    public Hund (){}

    public void setAlter(int alter) throws HundeAlterInvalide {
        if (alter >= 0) {
            this.alter = alter;
        } else {
            throw new HundeAlterInvalide("Das ist eine Fehlermeldung");
        }
    }


}
