package fr.epsi.fizzbuzz;

public class RègleFizzBuzz implements Règle {
    public boolean estSafisfaitePar(int index) {
        return Multiples.estMultipleDe(index, 15);
    }

    public String valeur() {
        return "FizzBuzz";
    }
}
