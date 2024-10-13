import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class ExportarArchivosTXT {
    // Método para exportar estudiantes de ingeniería a un archivo de texto
    public static void exportarEstudiantesIngenieria(String nameFile, ArrayList<EstudianteIngenieria> estudiantes){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile))){
            for(EstudianteIngenieria estudiante : estudiantes){
                bw.write(estudiante.cedula + "," +
                         estudiante.nombre + "," + 
                         estudiante.apellido + "," +
                         estudiante.telefono + "," +
                         estudiante.semestre + "," +
                         estudiante.promedio + "," + 
                         estudiante.getSerial());
                bw.newLine(); // Agregar una nueva línea para el próximo estudiante

            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    // Método para exportar estudiantes de diseño a un archivo de texto
    public static void exportarEstudiantesDiseno(String nameFile, ArrayList<EstudianteDiseno> estudiantes) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nameFile))) {
            for (EstudianteDiseno estudiante : estudiantes) {
                bw.write(estudiante.cedula + "," +
                         estudiante.nombre + "," +
                         estudiante.apellido + "," +
                         estudiante.telefono + "," +
                         estudiante.modalidadEstudio + "," +
                         estudiante.asignaturas + "," +
                         estudiante.getSerial());
                bw.newLine(); // Agregar una nueva línea para el próximo estudiante
            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}

