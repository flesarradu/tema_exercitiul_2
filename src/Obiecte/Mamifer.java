package Obiecte;

public class Mamifer extends Animal {

    int copii_per_nastere;

    public Mamifer(int varsta, String nume, MEDIU mediu, int copii_per_nastere) {
        super(varsta, nume, mediu);
        this.copii_per_nastere = copii_per_nastere;
    }
}
