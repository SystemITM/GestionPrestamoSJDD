import java.util.ArrayList;

public class GestionArchivo {
    public static void importarEstudiantesIngenieria(ArrayList<EstudianteIngenieria> vectorIngenieros){
        System.out.println("Importando estudiatnes de Ingenieria...");
        vectorIngenieros = ImportarArchivosTXT.importarEstudiantesIngenieria("Ingenieria.txt");
        System.out.println("Estudiante de Ingernieria Importados correctamente.");
    }

    public static void exportarEstudiantesIngenieria(ArrayList<EstudianteIngenieria> vectorIngenieros){
        System.out.println("Exportando estudiantes de ingenieria...");
        ExportarArchivosTXT.exportarEstudiantesIngenieria("Exportados_Ingenieria.txt", vectorIngenieros);
        System.out.println("Estudiantes de Ingenieria exportados correctamente.");
    }
    public static void importarEstudiantesDiseno(ArrayList<EstudianteDiseno> vectorDisenadores) {
        System.out.println("Importando estudiantes de diseño...");
        vectorDisenadores = ImportarArchivosTXT.importarEstudiantesDiseno("diseno.txt");
        System.out.println("Estudiantes de diseño importados correctamente.");
    }
    public static void exportarEstudiantesDiseno(ArrayList<EstudianteDiseno> vectorDisenadores) {
        System.out.println("Exportando estudiantes de diseño...");
        ExportarArchivosTXT.exportarEstudiantesDiseno("exportados_diseno.txt", vectorDisenadores);
        System.out.println("Estudiantes de diseño exportados correctamente.");
    }

}
