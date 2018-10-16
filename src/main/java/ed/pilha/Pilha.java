package ed.pilha;

import java.util.LinkedList;
import java.util.List;

public class Pilha {
    private List<String> nomes = new LinkedList<String>();

    public void push(String nome) {
        this.nomes.add(nome);
    }

    public String pop() {
        return this.nomes.remove(this.nomes.size()-1);
    }

    public boolean vazia() {
        return this.nomes.isEmpty();
    }

    @Override
    public String toString() {
        return this.nomes.toString();
    }
}