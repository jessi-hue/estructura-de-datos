public class Nodo {
    int identificacion;
    String nombre;
    double gastosCampana;
    Nodo siguiente;

    public Nodo(int id, String nombre, double gastos) {
        this.identificacion = id;
        this.nombre = nombre;
        this.gastosCampana = gastos;
        this.siguiente = null;
    }
}