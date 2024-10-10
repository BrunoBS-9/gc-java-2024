package aula06.exercicio17;
import java.util.HashSet;

public class NumerosInteiros {
    public static void main(String[] args) {
        HashSet<Integer> numInteiros = new HashSet<>();

        numInteiros.add(1);
        numInteiros.add(2);
        numInteiros.add(3);
        numInteiros.add(4);
        numInteiros.add(4);
        numInteiros.add(5);

        System.out.println(numInteiros);
    }
}
