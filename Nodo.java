
class Nodo {
    public int[] valor = new int[4];
    public Nodo anterior;
    public Nodo siguiente;

    public Nodo(int[] valor) {
        this.valor = valor;
        this.anterior = null;
        this.siguiente = null;
    }
}
