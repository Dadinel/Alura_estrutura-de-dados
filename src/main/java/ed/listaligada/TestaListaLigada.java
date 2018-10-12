package ed.listaligada;

import ed.listaligada.ListaLigada;
import ed.listaligada.Celula;

public class TestaListaLigada {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("Daniel");
        System.out.println(lista);
        lista.adicionaNoComeco("Talita");
        System.out.println(lista);
        lista.adicionaNoComeco("Patrícia");
        System.out.println(lista);

        lista.adiciona("Albertino");
        System.out.println(lista);

        lista.adiciona(2, "Cira");
        System.out.println(lista);

        Object x = lista.pega(2);
        System.out.println(x);

        System.out.println(lista.tamanho());

        lista.removeDoComeco();
        System.out.println(lista);

        System.out.println(lista.tamanho());

        lista.removeDoFim();
        System.out.println(lista);

        lista.adiciona("João");
        lista.adiciona("José");

        System.out.println(lista);
        lista.remove(1);
        System.out.println(lista);

        System.out.println(lista.contem("Daniel"));
        System.out.println(lista.contem("Xisto"));
    }
}