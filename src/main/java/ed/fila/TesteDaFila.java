package ed.fila;

import ed.fila.Fila;
import java.util.Queue;

public class TesteDaFila {
    public static void main(String[] args) {
        Fila fila = new Fila();

        fila.adiciona("Maurício");
        fila.adiciona("Guilherme");

        System.out.println(fila);

        String x1 = fila.remove();
        System.out.println(x1);

        System.out.println(fila);

        //Java
        Queue<String> filaDoJava = new LinkedList<String>();
        filaDoJava.add("Maurício");
        String x2 = filaDoJava.poll();
        System.out.println(x2);
        System.out.println(filaDoJava);
    }
}