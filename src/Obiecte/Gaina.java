package Obiecte;

public class Gaina extends Pasare implements Abilitate {

    public Gaina(int varsta, String nume, MEDIU mediu, int viteza_zbor) {
        super(varsta, nume, mediu, viteza_zbor);
    }

    @Override
    public boolean poateZbura() {
        return false;
    }

    @Override
    public boolean poateInota() {
        return false;
    }

    @Override
    public boolean sePoateCatara() {
        return false;
    }

    @Override
    public String toString() {
        return "Gaina{" +
                "viteza_zbor=" + viteza_zbor +
                ", varsta=" + varsta +
                ", nume='" + nume + '\'' +
                ", Mediu=" + Mediu +
                '}';
    }
}
