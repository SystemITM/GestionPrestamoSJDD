import java.util.ArrayList;

public class GestionArchivo {

    public static void importarEstudiantesIngenieria(ArrayList<EstudianteIngenieria> vectorIngenieros) {
        System.out.println("Importando estudiantes de Ingeniería...");
        vectorIngenieros.clear();
        vectorIngenieros.addAll(ImportarArchivosTXT.importarEstudiantesIngenieria("Ingenieria.txt"));
        System.out.println("Estudiantes de Ingeniería importados correctamente.");
    }

    public static void importarEstudiantesDiseno(ArrayList<EstudianteDiseno> vectorDisenadores) {
        System.out.println("Importando estudiantes de diseño...");
        vectorDisenadores.clear();
        vectorDisenadores.addAll(ImportarArchivosTXT.importarEstudiantesDiseno("diseno.txt"));
        System.out.println("Estudiantes de diseño importados correctamente.");
    }

    public static void importarComputadoresPortatiles(ArrayList<ComputadorPortatil> vectorPortatil) {
        System.out.println("Importando Computadores Portátiles...");
        vectorPortatil.clear();
        vectorPortatil.addAll(ImportarArchivosTXT.importarComputadoresPortatiles("ComputadoresPortatiles.txt"));
        System.out.println("Computadores Portátiles importados correctamente.");
    }

    public static void importarTabletasGraficas(ArrayList<TabletaGrafica> vectorTabletas) {
        System.out.println("Importando Tabletas Gráficas...");
        vectorTabletas.clear();
        vectorTabletas.addAll(ImportarArchivosTXT.importarTabletasGraficas("TabletasGraficas.txt"));
        System.out.println("Tabletas Gráficas importadas correctamente.");
    }
    public static void exportarEstudiantesIngenieria(ArrayList<EstudianteIngenieria> vectorIngenieros) {
        ExportarArchivosTXT.exportarEstudiantesIngenieria("Exportados_Ingenieria.txt", vectorIngenieros);
    }

    public static void exportarEstudiantesDiseno(ArrayList<EstudianteDiseno> vectorDisenadores) {
        ExportarArchivosTXT.exportarEstudiantesDiseno("Exportados_Diseno.txt", vectorDisenadores);
    }

    public static void exportarComputadoresPortatiles(ArrayList<ComputadorPortatil> vectorPortatil) {
        ExportarArchivosTXT.exportarComputadoresPortatiles("Exportados_ComputadoresPortatiles.txt", vectorPortatil);
    }

    public static void exportarTabletasGraficas(ArrayList<TabletaGrafica> vectorTabletas) {
        ExportarArchivosTXT.exportarTabletasGraficas("Exportados_TabletasGraficas.txt", vectorTabletas);
    }
}
