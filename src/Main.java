public class Main {
    public static void main(String[] args) {
        // Crear un array con las calificaciones
        double[] calificaciones = {70, 80, 55, 90, 68};

        // Crear una instancia de Estudiante
        Estudiante estudiante = new Estudiante("Sebastian", calificaciones);

        // Imprimir los resultados del estudiante
        estudiante.imprimirResultados();
    }
}
