public class Lista {
    Nodo inicio;

    public Lista() {
        this.inicio = null;
    }

    public void insertarInicio(int id, String nom, double gastos) {
        Nodo nuevo = new Nodo(id, nom, gastos);
        nuevo.siguiente = inicio;
        inicio = nuevo;
    }

    public void insertarFinal(int id, String nom, double gastos) {
        Nodo nuevo = new Nodo(id, nom, gastos);
        if (inicio == null) {
            inicio = nuevo;
        } else {
            Nodo temp = inicio;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
        }
    }

    public Nodo buscar(int id) {
        Nodo temp = inicio;
        while (temp != null) {
            if (temp.identificacion == id) {
                return temp;
            }
            temp = temp.siguiente;
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
        if (inicio == null) return false;
        if (inicio.identificacion == id) {
            inicio = inicio.siguiente;
            return true;
        }
        Nodo temp = inicio;
        while (temp.siguiente != null) {
            if (temp.siguiente.identificacion == id) {
                temp.siguiente = temp.siguiente.siguiente;
                return true;
            }
            temp = temp.siguiente;
        }
        return false;
    }

    public void imprimir() {
        Nodo temp = inicio;
        while (temp != null) {
            System.out.println("ID: " + temp.identificacion + ", Nombre: " + temp.nombre + ", Gastos: " + temp.gastosCampana);
            temp = temp.siguiente;
        }
    }
}