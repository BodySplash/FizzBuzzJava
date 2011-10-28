package fr.epsi.fizzbuzz;

public class RègleFizz extends RègleFizzBuzz {

    public boolean estSafisfaitePar(int index) {
        return Multiples.estMultipleDe(index, 3);
    }

    public String valeur() {
        return "Fizz";
    }
}
