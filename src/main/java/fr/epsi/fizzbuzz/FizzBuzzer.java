package fr.epsi.fizzbuzz;

import com.google.common.collect.Lists;

import java.util.List;

public class FizzBuzzer {
    public List<String> calculeRésultat() {
        final List<String> résultats = Lists.newArrayList();
        for (int i = 0; i < 101; i++) {
            résultats.add(valeurPour(i));
        }
        return résultats;
    }

    private String valeurPour(int index) {
        for (Règle règle : règles) {
            if(règle.estSafisfaitePar(index)) {
                return règle.valeur();
            }
        }
        return String.valueOf(index);
    }

    private List<Règle> règles = Lists.newArrayList(new RègleFizzBuzz(), new RègleFizz(), new RègleBuzz());
}
