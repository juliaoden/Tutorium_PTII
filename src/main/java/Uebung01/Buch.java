package Uebung01;

public class Buch {
    private String titel;
    private long isbn;
    private double preis;

    private Verlag verlag;

    public Buch(String titel, long isbn, double preis, Verlag verlag){
        this.titel= titel;
        this.isbn = isbn;
        this.preis = preis;
        this.verlag = verlag;
    }

    // Copy-Konstruktor
    public Buch(Buch buch){
        this.titel= buch.getTitel();
        this.preis = buch.getPreis();
        this.isbn = buch.getIsbn();
        this.verlag = new Verlag(buch.getVerlag());
        //this(buch.getTitel(), buch.getIsbn(), buch.getPreis(), buch.getVerlag());
    }


    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public Verlag getVerlag() {
        return verlag;
    }

    public void setVerlag(Verlag verlag) {
        this.verlag = verlag;
    }
}
