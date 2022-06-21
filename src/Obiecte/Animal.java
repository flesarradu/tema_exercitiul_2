package Obiecte;

public abstract class Animal {

    public int varsta;
    public String nume;
    public MEDIU Mediu;

    public enum MEDIU {
        APA,
        PAMANT,
        AER
    }

    public Animal(int varsta, String nume, MEDIU mediu) {
        this.varsta = varsta;
        this.nume = nume;
        Mediu = mediu;
    }
}
