
import java.io.FileReader;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Automata a1 = new Automata();
        a1.readAutomat("D:\\Прога\\AvtomatJava\\src\\AutomatN1.txt");
        Automata a2 = new Automata();
        a2.readAutomat("D:\\Прога\\AvtomatJava\\src\\AutomatN2.txt");
        System.out.println(Automata.equals(a1, a2, 5));

    }
}
