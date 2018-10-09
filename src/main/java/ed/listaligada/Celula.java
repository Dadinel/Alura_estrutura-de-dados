package ed.listaligada;

public class Celula {
    private Object elemento;

    private Celula anterior;
    private Celula proximo;

    public Celula(Object elemento) {
        this(null, elemento);
    }

    public Celula(Celula proximo, Object elemento) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public Celula getAnterior() {
        return this.anterior;
    }

    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

    public Celula getProximo() {
        return this.proximo;
    }

    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return this.elemento;
    }
}