import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class ImportarArchivosTXT {
    // Método para importar estudiantes de ingeniería desde un archivo de texto
    public static ArrayList<EstudianteIngenieria> importarEstudiantesIngenieria(String nameFile){
        ArrayList<EstudianteIngenieria> estudiantes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nameFile))){
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Cedula: ")) {
                    String cedula = linea.split(": ")[1].trim();
                    String nombre = br.readLine().split(": ")[1].trim();
                    String apellido = br.readLine().split(": ")[1].trim();
                    String telefono = br.readLine().split(": ")[1].trim();
                    int semestre = Integer.parseInt(br.readLine().split(": ")[1].trim());
                    float promedio = Float.parseFloat(br.readLine().split(": ")[1].trim());
                    String serial = br.readLine().split(": ")[1].trim();


                    EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, semestre, promedio, serial);
                    estudiantes.add(estudiante);
                }
            }
            System.out.println("Estudiantes de ingeniería importados correctamente.");
        }catch(IOException e){
            e.printStackTrace();
        }

        return estudiantes;
    }

    // Método para importar estudiantes de diseño desde un archivo de texto
    public static ArrayList<EstudianteDiseno> importarEstudiantesDiseno(String nameFile) {
        ArrayList<EstudianteDiseno> estudiantes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                if (linea.startsWith("Cedula: ")) {
                    String cedula = linea.split(": ")[1].trim();
                    String nombre = br.readLine().split(": ")[1].trim();
                    String apellido = br.readLine().split(": ")[1].trim();
                    String telefono = br.readLine().split(": ")[1].trim();
                    String modalidad = br.readLine().split(": ")[1].trim();
                    int asignaturas = Integer.parseInt(br.readLine().split(": ")[1].trim());
                    int serial = Integer.parseInt(br.readLine().split(": ")[1].trim());
                    
                EstudianteDiseno estudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidad, asignaturas, asignaturas);
                estudiantes.add(estudiante);
            }
        }
         System.out.println("Estudiantes de diseño importados correctamente.");
        }catch (IOException e) {
        e.printStackTrace();
        }
    return estudiantes;
    }
}

