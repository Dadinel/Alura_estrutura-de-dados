package ed.conjunto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Conjunto {
    private ArrayList<LinkedList<String>> tabela = new ArrayList<LinkedList<String>>();

    public Conjunto() {
        for(int i=0; i < 26; i++) {
            this.tabela.add( new LinkedList<String>());
        }
    } 

    public void adiciona(String palavra) {
        if(!this.contem(palavra)) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.add(palavra);
        }
    }

    public void remove(String palavra) {
        if(this.contem(palavra)) {
            int indice = this.calculaIndiceDaTabela(palavra);
            List<String> lista = this.tabela.get(indice);
            lista.remove(palavra);
        }
    }

    private int calculaIndiceDaTabela(String palavra) {
        return palavra.toLowerCase().charAt(0) % 26;
    }

    private boolean contem(String palavra) {
        int indice = this.calculaIndiceDaTabela(palavra);
        return this.tabela.get(indice).contains(palavra);
    }

    @Override
    public String toString() {
        return this.tabela.toString();
    }
}