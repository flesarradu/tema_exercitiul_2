package Obiecte;

public class Gaina extends Pasare implements Abilitate {
    
    public static final VITEZA_ZBOR = 0;

    public Gaina(int varsta, String nume, MEDIU mediu) {
        super(varsta, nume, mediu, Gaina.VITEZA_ZBOR);
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
