package Uebung01;

public class Test {

    public static void main(String[] args) {
        Verlag v1 = new Verlag("Rüdigers");
        Buch b1 = new Buch("Der Heimweg", 2735824, 22.99, v1);
        Buch b2 = b1;

        /*System.out.println(b1.getTitel());
        System.out.println(b2.getTitel());

        b2.setTitel("blubb");

        System.out.println("Titel b1 nach ändern von b2: " + b2.getTitel());

        Buch b3 = new Buch(b1);

        b3.setTitel("anderer Titel");

        System.out.println("Titel von b1 nach ändern von b3: " + b1.getTitel());*/

        Buch b3 = new Buch(b1);
        Verlag v2 = new Verlag("Ritas");
        Verlag v3 = new Verlag("Ollis");


        b2.setVerlag(v2);
        System.out.println(b1.getVerlag().getName());
        b3.setVerlag(v3);
        System.out.println(b1.getVerlag().getName());



    }
}
