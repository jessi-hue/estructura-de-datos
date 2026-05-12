public class Nodo {
    int identificacion;
    String nombre;
    double gastosCampana;
    Nodo siguiente;

    public Nodo(int id, String nom, double gastos) {
        this.identificacion = id;
        this.nombre = nom;
        this.gastosCampana = gastos;
        this.siguiente = null;
    }
}