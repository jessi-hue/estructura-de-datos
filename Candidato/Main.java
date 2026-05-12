public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();

        // Insertar candidatos
        System.out.println("Insertando candidatos:");
        lista.insertarInicio(1, "Juan", 1000.0);
        lista.insertarFinal(2, "Maria", 1500.0);
        lista.insertarInicio(3, "Pedro", 2000.0);
        lista.imprimir();

        // Buscar candidato
        System.out.println("\nBuscando candidato con ID 2:");
        Nodo encontrado = lista.buscar(2);
        if (encontrado != null) {
            System.out.println("Encontrado: ID: " + encontrado.identificacion + ", Nombre: " + encontrado.nombre + ", Gastos: " + encontrado.gastosCampana);
        } else {
            System.out.println("Candidato no encontrado.");
        }

        // Modificar gastos
        System.out.println("\nModificando gastos de candidato con ID 1:");
        boolean modificado = lista.modificarGastos(1, 1200.0);
        if (modificado) {
            System.out.println("Gastos modificados exitosamente.");
        } else {
            System.out.println("Candidato no encontrado para modificar.");
        }

        // Eliminar candidato
        System.out.println("\nEliminando candidato con ID 3:");
        boolean eliminado = lista.eliminar(3);
        if (eliminado) {
            System.out.println("Candidato eliminado exitosamente.");
        } else {
            System.out.println("Candidato no encontrado para eliminar.");
        }

        // Imprimir lista final
        System.out.println("\nLista final:");
        lista.imprimir();
    }
}