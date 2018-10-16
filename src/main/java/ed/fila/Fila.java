package ed.fila;

import java.util.LinkedList;
import java.util.List;

public class Fila {
    private List<String> dados = new LinkedList<String>();

    public void adiciona(String dado) {
        this.dados.add(dado);
    }

    public String remove() {
        return this.dados.remove(0);
    }

    public boolean vazia() {
        return this.dados.isEmpty();
    }

    @Override
    public String toString() {
        return this.dados.toString();
    }
}