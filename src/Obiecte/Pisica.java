package Obiecte;

public class Pisica extends Mamifer implements Abilitate {

    public Pisica(int varsta, String nume, MEDIU mediu, int copii_per_nastere) {
        super(varsta, nume, mediu, copii_per_nastere);
    }

    @Override
    public boolean poateZbura() {
        return false;
    }

    @Override
    public boolean poateInota() {
        return true;
    }

    @Override
    public boolean sePoateCatara() {
        return true;
    }

    @Override
    public String toString() {
        return "Pisica{" +
                "copii_per_nastere=" + copii_per_nastere +
                ", varsta=" + varsta +
                ", nume='" + nume + '\'' +
                ", Mediu=" + Mediu +
                '}';
    }
}
