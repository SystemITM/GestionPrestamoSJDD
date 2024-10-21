import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ExportarArchivosTXT {
    
    // Método para exportar estudiantes de ingeniería a un archivo de texto
    public static void exportarEstudiantesIngenieria(String nameFile, ArrayList<EstudianteIngenieria> estudiantes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile))) {
            for (EstudianteIngenieria estudiante : estudiantes) {
                bw.write("Cedula: " + estudiante.cedula + "\n" +
                         "Nombre: " + estudiante.nombre + "\n" + 
                         "Apellido: " + estudiante.apellido + "\n" + // Agregado ":" para consistencia
                         "Telefono: " + estudiante.telefono + "\n" + // Agregado ":" para consistencia
                         "Semestre: " + estudiante.semestre + "\n" + // Agregado ":" para consistencia
                         "Promedio: " + estudiante.promedio + "\n" + // Agregado ":" para consistencia
                         "Serial: " + estudiante.getSerial() + "\n\n"); // Agregado ":" para consistencia
                
                bw.write("---------------------------------------\n");
                bw.newLine(); // Agregar una nueva línea para el próximo estudiante
            }
            System.out.println("Archivo exportado correctamente.");
        } catch (IOException e) {
            e.printStackTrace(); // Imprimir error en caso de fallo en la escritura
        }
    }

    // Método para exportar estudiantes de diseño a un archivo de texto
    public static void exportarEstudiantesDiseno(String nameFile, ArrayList<EstudianteDiseno> estudiantes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile))) {
            for (EstudianteDiseno estudiante : estudiantes) {
                bw.write("Cedula: " + estudiante.cedula + "\n" +
                         "Nombre: " + estudiante.nombre + "\n" +
                         "Apellido: " + estudiante.apellido + "\n" + // Agregado ":" para consistencia
                         "Telefono: " + estudiante.telefono + "\n" + // Agregado ":" para consistencia
                         "Modalidad: " + estudiante.modalidadEstudio + "\n" + // Agregado ":" para consistencia
                         "Asignaturas: " + estudiante.asignaturas + "\n" + // Agregado ":" para consistencia
                         "Serial: " + estudiante.getSerial() + "\n\n"); // Agregado ":" para consistencia
                
                bw.write("---------------------------------------\n");
                bw.newLine(); // Agregar una nueva línea para el próximo estudiante
            }
            System.out.println("Estudiantes de diseño exportados exitosamente.");
        } catch (IOException e) {
            e.printStackTrace(); // Imprimir error en caso de fallo en la escritura
        }
    }
}
