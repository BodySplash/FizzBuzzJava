package fr.epsi.fizzbuzz;

public class RègleBuzz implements Règle {

    public boolean estSafisfaitePar(int index) {
        return Multiples.estMultipleDe(index, 5);
    }

    public String valeur() {
        return "Buzz";
    }
}
