package fr.epsi.fizzbuzz;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class TestsFizzBuzzer {

    @Before
    public void setUp() throws Exception {
        fizzBuzzer = new FizzBuzzer();
        résultats = fizzBuzzer.calculeRésultat();
    }

    @Test
    public void donneBien100Réponses() {
        assertThat(résultats.size(), is(101));
    }

    @Test
    public void peutDonnerLesCasSimples() {
        test(1, "1");
        test(2, "2");
    }

    @Test
    public void donneFizz() {
        test(3, "Fizz");
        test(6, "Fizz");
    }

    @Test
    public void donneBuzz() {
        test(5, "Buzz");
    }

    @Test
    public void donneFizzBuzz() {
        test(15, "FizzBuzz");
    }


    @Test
    public void testPourLesSceptiques() {
        for (String résultat : résultats) {
            System.out.println(résultat);
        }
    }


    private void test(int index, String attendu) {
        assertThat(résultats.get(index), is(attendu));
    }

    private FizzBuzzer fizzBuzzer;
    private List<String> résultats;
}
