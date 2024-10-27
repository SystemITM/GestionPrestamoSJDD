import java.util.ArrayList;

public class GestionArchivo {

    public static void importarEstudiantesIngenieria(ArrayList<EstudianteIngenieria> vectorIngenieros) {
        System.out.println("Importando estudiantes de Ingeniería...");
        vectorIngenieros.clear();//vacia los datos antes de importar
        vectorIngenieros.addAll(ImportarArchivosTXT.importarEstudiantesIngenieria("Ingenieria.txt"));
        System.out.println("Estudiantes de Ingeniería importados correctamente. \n");
    }

    public static void importarEstudiantesDiseno(ArrayList<EstudianteDiseno> vectorDisenadores) {
        System.out.println("Importando estudiantes de diseño...");
        vectorDisenadores.clear();//vacia los datos antes de importar
        vectorDisenadores.addAll(ImportarArchivosTXT.importarEstudiantesDiseno("diseno.txt"));
        System.out.println("Estudiantes de diseño importados correctamente. \n");
    }

    public static void importarComputadoresPortatiles(ArrayList<ComputadorPortatil> vectorPortatil) {
        System.out.println("Importando Computadores Portátiles...");
        vectorPortatil.clear();//vacia los datos antes de importar
        vectorPortatil.addAll(ImportarArchivosTXT.importarComputadoresPortatiles("ComputadoresPortatiles.txt"));
        System.out.println("Computadores Portátiles importados correctamente. \n");
    }

    public static void importarTabletasGraficas(ArrayList<TabletaGrafica> vectorTabletas) {
        System.out.println("Importando Tabletas Gráficas...");
        vectorTabletas.clear();//vacia los datos antes de importar
        vectorTabletas.addAll(ImportarArchivosTXT.importarTabletasGraficas("TabletasGraficas.txt"));
        System.out.println("Tabletas Gráficas importadas correctamente. \n");
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
