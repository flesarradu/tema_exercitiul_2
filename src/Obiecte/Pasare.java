package Obiecte;

public class Pasare extends Animal {

    int viteza_zbor;

    public Pasare(int varsta, String nume, MEDIU mediu, int viteza_zbor) {
        super(varsta, nume, mediu);
        this.viteza_zbor = viteza_zbor;
    }
}
