package ed.conjunto;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import ed.conjunto.Conjunto;

public class TesteDeConjunto {
    public static void main(String[] args) {
        Conjunto conjunto = new Conjunto();

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Marcelo");
        System.out.println(conjunto);

        conjunto.adiciona("Guilherme");
        System.out.println(conjunto);

        conjunto.adiciona("Albertino");
        System.out.println(conjunto);

        conjunto.adiciona("Beto");
        System.out.println(conjunto);

        conjunto.adiciona("Cira");
        System.out.println(conjunto);

        conjunto.adiciona("Daniel");
        System.out.println(conjunto);

        conjunto.adiciona("Eduardo");
        System.out.println(conjunto);

        conjunto.adiciona("Talita");
        System.out.println(conjunto);

        conjunto.adiciona("Patricia");
        System.out.println(conjunto);

        conjunto.adiciona("Fernando");
        System.out.println(conjunto);

        conjunto.adiciona("Guilherme");
        System.out.println(conjunto);

        conjunto.remove("Mauricio");
        System.out.println(conjunto);

        Set<String> conjuntoDoJava = new HashSet<String>();

        conjuntoDoJava.add("Mauricio");
        conjuntoDoJava.add("Paulo");

        System.out.println(conjuntoDoJava);
    }
}