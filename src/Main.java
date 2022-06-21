/*
1. Creați o clasă abstractă Animal care are următoarele atribute: vârsta, nume și tipul de mediu pe care
îl preferă (apă, pământ, aer). Pentru atributul mediu utilizați o enumerare. Din clasa Animal derivă
clasele Mamifer, Pasăre și Reptilă. Clasa Mamifer are ca atribut numărul de copii medii care se pot naște
la o singură naștere; clasa Pasăre are ca atribut viteza medie de zbor; clasa Reptilă are ca atribut
numărul de ouă pe care le depune. Din fiecare clasă derivă câteva clase concrete (de exemplu din
Mamifer: Pisică, Câine, ...). Creați interfață Abilitate care conține următoarele metode:
i. boolean poateZbura ()
ii. boolean poateInota ()
iii. boolean sePoateCatara ()
Fiecare clasă concretă implementează metodele din interfață (de exemplu, un câine poate înota, dar
nu poate zbura și cățăra).
Rezolvați următoarele cerințe:
a) Creați o lista de animale (cel putin 2 din fiecare clasa) și afișați-l
b) Definiți o metodă care întoarce numărul/o lista de animale care pot zbura din lista principala
c) Definiți o metodă care întoarce media vârstei animalelor care se pot cățăra și nu pot înota
d),e) - 2 cerinte care presupun folosirea listei imaginate de voi

--- cerintele alese de mine ---
d) O metoda care returneaza cel mai batran animal din lista de animale;
e) O metoda care returneaza o lista cu animalele transformate in Gaina (dar pastrand atributele originale).
 */

import Obiecte.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Punctul a)
        int per_tip = 2;
        List<Animal> zoo = new ArrayList<>();

        for(int i = 1; i <= per_tip; i++) {

            zoo.add(new Pisica((2 * i) + 2, i > 1 ? "Pisic Sr" : "Pisic Jr", Animal.MEDIU.PAMANT, 2 * i));
            zoo.add(new Caine((3 * i) + 2, i > 1 ? "Dulau" : "Azorel", Animal.MEDIU.PAMANT, 2 + i));

            zoo.add(new Gaina(i + 1, i > 1 ? "Galileo" : "Galilei", Animal.MEDIU.PAMANT, 1));
            zoo.add(new Vultur(i + 7, "MIG", Animal.MEDIU.AER, 2 + i));

            zoo.add(new Sarpe(i + 10, i > 1 ? "Severus" : "Dl. S", Animal.MEDIU.APA, 15 * (i + 1)));
            zoo.add(new Crocodil(20 + (i * 3), i > 1 ? "Croco" : "Dilu", Animal.MEDIU.APA, 20 + i));

        }

        zoo.forEach(System.out::println);

        // System.out.println("Animale care pot zbura: " + zburatoare(zoo));
        // System.out.println("Media varstei animalelor care se pot catara si nu pot inota: " + cataratoare(zoo));
        // System.out.println("Varsnictul: " + varstnicul(zoo));
        // System.out.println("Gainile: " + blestem(zoo));

    }
    // Punctul b)
    public static List<Animal> zburatoare(List<Animal> lst) {

        List<Animal> zoo_zburatoare = new ArrayList<>();

        for(var z : lst) {
            if (z instanceof Pisica && ((Pisica) z).poateZbura()) {
                zoo_zburatoare.add(z);
                continue;
            }
            if (z instanceof Caine && ((Caine) z).poateZbura()) {
                zoo_zburatoare.add(z);
                continue;
            }
            if (z instanceof Gaina && ((Gaina) z).poateZbura()) {
                zoo_zburatoare.add(z);
                continue;
            }
            if (z instanceof Vultur && ((Vultur) z).poateZbura()) {
                zoo_zburatoare.add(z);
                continue;
            }
            if (z instanceof Sarpe && ((Sarpe) z).poateZbura()) {
                zoo_zburatoare.add(z);
                continue;
            }
            if (z instanceof Crocodil && ((Crocodil) z).poateZbura()) {
                zoo_zburatoare.add(z);
            }
        }

        return zoo_zburatoare;
    }

    // Punctul c)
    public static double cataratoare(List<Animal> lst) {

        int medie = 0;
        int n = 0;

        for(var z : lst) {
            if(z instanceof Pisica && ((Pisica) z).sePoateCatara() && !((Pisica) z).poateInota()) {
                medie += z.varsta;
                n++;
                continue;
            }
            if(z instanceof Caine && ((Caine) z).sePoateCatara() && !((Caine) z).poateInota()) {
                medie += z.varsta;
                n++;
                continue;
            }
            if(z instanceof Gaina && ((Gaina) z).sePoateCatara() && !((Gaina) z).poateInota()) {
                medie += z.varsta;
                n++;
                continue;
            }
            if(z instanceof Vultur && ((Vultur) z).sePoateCatara() && !((Vultur) z).poateInota()) {
                medie += z.varsta;
                n++;
                continue;
            }
            if(z instanceof Sarpe && ((Sarpe) z).sePoateCatara() && !((Sarpe) z).poateInota()) {
                medie += z.varsta;
                n++;
                continue;
            }
            if(z instanceof Crocodil && ((Crocodil) z).sePoateCatara() && !((Crocodil) z).poateInota()) {
                medie += z.varsta;
                n++;
            }
        }

        if(n == 0) {
            return 0;
        }
        else {
            return 1.0 * medie / n;
        }
    }

    public static List<Animal> varstnicul(List<Animal> lst) {

        int v = 0;
        List<Animal> a = new ArrayList<>();

        for(Animal z : lst) {
            if(z.varsta > v) {
                v = z.varsta;
                a.clear();
                a.add(z);
            }
        }

        return a;
    }

    public static List<Animal> blestem(List<Animal> lst) {

        List<Animal> gaini = new ArrayList<>();

        for(var z : lst) {
            if(!(z instanceof Gaina)) {
                gaini.add(new Gaina(z.varsta, z.nume, z.Mediu, 0));
            }
        }

        return gaini;
    }

}
