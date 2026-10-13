public class Nodo {
    ObjCancion Cancion;
    Nodo Siguiente;
    Nodo Anterior;

    public Nodo() {
        Cancion = null;
        Siguiente = null;
        Anterior = null;
    }

    public ObjCancion getCancion() {
        return Cancion;
    }

    public void setCancion(ObjCancion cancion) {
        Cancion = cancion;
    }

    public Nodo getSiguiente() {
        return Siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        Siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return Anterior;
    }

    public void setAnterior(Nodo anterior) {
        Anterior = anterior;
    }
}