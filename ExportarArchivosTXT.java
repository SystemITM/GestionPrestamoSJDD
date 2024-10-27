import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportarArchivosTXT {

    // Método para exportar estudiantes de ingeniería
    public static void exportarEstudiantesIngenieria(String filePath, ArrayList<EstudianteIngenieria> estudiantes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (EstudianteIngenieria estudiante : estudiantes) {
                writer.write("Cedula: " + estudiante.getCedula());
                writer.newLine();
                writer.write("Nombre: " + estudiante.getNombre());
                writer.newLine();
                writer.write("Apellido: " + estudiante.getApellido());
                writer.newLine();
                writer.write("Teléfono: " + estudiante.getTelefono());
                writer.newLine();
                writer.write("Semestre: " + estudiante.getSemestre());
                writer.newLine();
                writer.write("Promedio: " + estudiante.getPromedio());
                writer.newLine();
                writer.write("Serial: " + estudiante.getSerial());
                writer.newLine();
                writer.newLine();  // Espacio entre estudiantes
            }
            System.out.println("Archivo de estudiantes de ingeniería exportado con éxito en " + filePath);
        } catch (IOException e) {
            System.out.println("Error al exportar estudiantes de ingeniería: " + e.getMessage());
        }
    }

    // Método para exportar estudiantes de diseño
    public static void exportarEstudiantesDiseno(String filePath, ArrayList<EstudianteDiseno> estudiantes) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (EstudianteDiseno estudiante : estudiantes) {
                writer.write("Cedula: " + estudiante.getCedula());
                writer.newLine();
                writer.write("Nombre: " + estudiante.getNombre());
                writer.newLine();
                writer.write("Apellido: " + estudiante.getApellido());
                writer.newLine();
                writer.write("Teléfono: " + estudiante.getTelefono());
                writer.newLine();
                writer.write("Modalidad: " + estudiante.getModalidadEstudio());
                writer.newLine();
                writer.write("Cantidad de Asignaturas: " + estudiante.getAsignaturas());
                writer.newLine();
                writer.write("Serial: " + estudiante.getSerial());
                writer.newLine();
                writer.newLine();  // Espacio entre estudiantes
            }
            System.out.println("Archivo de estudiantes de diseño exportado con éxito en " + filePath);
        } catch (IOException e) {
            System.out.println("Error al exportar estudiantes de diseño: " + e.getMessage());
        }
    }

    // Método para exportar computadores portátiles
    public static void exportarComputadoresPortatiles(String filePath, ArrayList<ComputadorPortatil> portatiles) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (ComputadorPortatil portatil : portatiles) {
                writer.write("Serial: " + portatil.getSerial());
                writer.newLine();
                writer.write("Marca: " + portatil.getMarca());
                writer.newLine();
                writer.write("Tamaño: " + portatil.getTamano());
                writer.newLine();
                writer.write("Precio: " + portatil.getPrecio());
                writer.newLine();
                writer.write("Sistema operativo: " + portatil.getSistemaOperativo());
                writer.newLine();
                writer.write("Procesador: " + portatil.getProcesador());
                writer.newLine();
                writer.write("Estado: " + portatil.getEstado());
                writer.newLine();
                writer.newLine();  // Espacio entre computadores portátiles
            }
            System.out.println("Archivo de computadores portátiles exportado con éxito en " + filePath);
        } catch (IOException e) {
            System.out.println("Error al exportar computadores portátiles: " + e.getMessage());
        }
    }

    // Método para exportar tabletas gráficas
    public static void exportarTabletasGraficas(String filePath, ArrayList<TabletaGrafica> tabletas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (TabletaGrafica tableta : tabletas) {
                writer.write("Serial: " + tableta.getSerial());
                writer.newLine();
                writer.write("Marca: " + tableta.getMarca());
                writer.newLine();
                writer.write("Tamaño: " + tableta.getTamano());
                writer.newLine();
                writer.write("Precio: " + tableta.getPrecio());
                writer.newLine();
                writer.write("Almacenamiento: " + tableta.getAlmacenamiento());
                writer.newLine();
                writer.write("Peso: " + tableta.getPeso());
                writer.newLine();
                writer.write("Estado: " + tableta.getEstado());
                writer.newLine();
                writer.newLine();  // Espacio entre tabletas gráficas
            }
            System.out.println("Archivo de tabletas gráficas exportado con éxito en " + filePath);
        } catch (IOException e) {
            System.out.println("Error al exportar tabletas gráficas: " + e.getMessage());
        }
    }
}
