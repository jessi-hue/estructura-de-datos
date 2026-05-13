public class Lista {
    private Nodo inicio;

    public Lista() {
        this.inicio = null;
    }

    public void insertarInicio(int id, String nombre, double gastos) {
        Nodo nuevo = new Nodo(id, nombre, gastos);
        nuevo.siguiente = inicio;
        inicio = nuevo;
    }

    public void insertarFinal(int id, String nombre, double gastos) {
        Nodo nuevo = new Nodo(id, nombre, gastos);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo actual = inicio;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
    }

    public Nodo buscar(int id) {
        Nodo actual = inicio;
        while (actual != null) {
            if (actual.identificacion == id) {
                return actual;
            }
            actual = actual.siguiente;
        }
        return null;
    }

    public boolean modificarGastos(int id, double nuevosGastos) {
        Nodo candidato = buscar(id);
        if (candidato != null) {
            candidato.gastosCampana = nuevosGastos;
            return true;
        }
        return false;
    }

    public boolean eliminar(int id) {
        if (inicio == null) {
            return false;
        }
        if (inicio.identificacion == id) {
            inicio = inicio.siguiente;
            return true;
        }
        Nodo actual = inicio;
        while (actual.siguiente != null) {
            if (actual.siguiente.identificacion == id) {
                actual.siguiente = actual.siguiente.siguiente;
                return true;
            }
            actual = actual.siguiente;
        }
        return false;
    }

    public void imprimir() {
        Nodo actual = inicio;
        while (actual != null) {
            System.out.println("ID: " + actual.identificacion +
                             ", Nombre: " + actual.nombre +
                             ", Gastos: " + actual.gastosCampana);
            actual = actual.siguiente;
        }
    }

    public boolean estaVacia() {
        return inicio == null;
    }
}