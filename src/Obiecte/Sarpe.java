package Obiecte;

public class Sarpe extends Reptila implements Abilitate {

    public Sarpe(int varsta, String nume, MEDIU mediu, int oua_per_depunere) {
        super(varsta, nume, mediu, oua_per_depunere);
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
        return "Sarpe{" +
                "oua_per_depunere=" + oua_per_depunere +
                ", varsta=" + varsta +
                ", nume='" + nume + '\'' +
                ", Mediu=" + Mediu +
                '}';
    }
}
