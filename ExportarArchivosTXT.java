import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class ExportarArchivosTXT {
    // Método para exportar estudiantes de ingeniería a un archivo de texto
    public static void exportarEstudiantesIngenieria(String nameFile, ArrayList<EstudianteIngenieria> estudiantes){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile))){
            for(EstudianteIngenieria estudiante : estudiantes){
                bw.write("Cedula: " + estudiante.cedula + "\n" +
                         "Nombre: " + estudiante.nombre + "\n" + 
                         "Apellido " + estudiante.apellido + "\n" +
                         "Telefono " + estudiante.telefono + "\n" +
                         "Semestre " + estudiante.semestre + "\n" +
                         "Promedio" + estudiante.promedio + "\n" + 
                         "Serial " + estudiante.getSerial()+ "\n\n");
                bw.write("---------------------------------------\n");
                bw.newLine(); // Agregar una nueva línea para el próximo estudiante

            }
            System.out.println("Archivo exportado correctamente");
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    // Método para exportar estudiantes de diseño a un archivo de texto
    public static void exportarEstudiantesDiseno(String nameFile, ArrayList<EstudianteDiseno> estudiantes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile))) {
            for (EstudianteDiseno estudiante : estudiantes) {
                bw.write("Cedula: " + estudiante.cedula + "\n" +
                         "Nombre: " + estudiante.nombre + "\n" +
                         "Apellido " + estudiante.apellido + "\n" +
                         "Telefono " + estudiante.telefono + "\n" +
                         "Modalidad " + estudiante.modalidadEstudio + "\n" +
                         "Asignaturas" + estudiante.asignaturas + "\n" +
                         "Serial " + estudiante.getSerial() + "\n\n");
                bw.write("\n---------------------------------------\n");
                bw.newLine(); // Agregar una nueva línea para el próximo estudiante
            }
            System.out.println("Estudiantes de diseño exportados exitosamente.");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

