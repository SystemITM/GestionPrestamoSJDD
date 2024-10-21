import java.util.ArrayList;

public class GestionArchivo {

    // Método para importar estudiantes de ingeniería
    public static void importarEstudiantesIngenieria(ArrayList<EstudianteIngenieria> vectorIngenieros) {
        System.out.println("Importando estudiantes de Ingeniería...");
        vectorIngenieros.clear(); // Limpiar el vector antes de importar
        vectorIngenieros.addAll(ImportarArchivosTXT.importarEstudiantesIngenieria("Ingenieria.txt")); // Añadir estudiantes importados
        System.out.println("Estudiantes de Ingeniería importados correctamente.");
    }

    // Método para exportar estudiantes de ingeniería
    public static void exportarEstudiantesIngenieria(ArrayList<EstudianteIngenieria> vectorIngenieros) {
        System.out.println("Exportando estudiantes de Ingeniería...");
        ExportarArchivosTXT.exportarEstudiantesIngenieria("Exportados_Ingenieria.txt", vectorIngenieros);
        System.out.println("Estudiantes de Ingeniería exportados correctamente.");
    }

    // Método para importar estudiantes de diseño
    public static void importarEstudiantesDiseno(ArrayList<EstudianteDiseno> vectorDisenadores) {
        System.out.println("Importando estudiantes de diseño...");
        vectorDisenadores.clear(); // Limpiar el vector antes de importar
        vectorDisenadores.addAll(ImportarArchivosTXT.importarEstudiantesDiseno("diseno.txt")); // Añadir estudiantes importados
        System.out.println("Estudiantes de diseño importados correctamente.");
    }

    // Método para exportar estudiantes de diseño
    public static void exportarEstudiantesDiseno(ArrayList<EstudianteDiseno> vectorDisenadores) {
        System.out.println("Exportando estudiantes de diseño...");
        ExportarArchivosTXT.exportarEstudiantesDiseno("exportados_diseno.txt", vectorDisenadores);
        System.out.println("Estudiantes de diseño exportados correctamente.");
    }
}
