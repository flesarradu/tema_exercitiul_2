package Obiecte;

public class Reptila extends Animal {

    int oua_per_depunere;

    public Reptila(int varsta, String nume, MEDIU mediu, int oua_per_depunere) {
        super(varsta, nume, mediu);
        this.oua_per_depunere = oua_per_depunere;
    }
}
