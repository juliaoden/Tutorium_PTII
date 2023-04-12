package Uebung01;

public class Verlag {
    String name;

    public Verlag(String name) {
        this.name = name;
    }

    public Verlag (Verlag verlag){
        this.name = verlag.name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
