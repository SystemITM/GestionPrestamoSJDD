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
                String[] datos = linea.split(","); // Asumimos que los datos están separados por comas
                if (datos.length == 7) { //aseguramos que hay suficientes datos
                    String cedula = datos[0];
                    String nombre = datos[1];
                    String apellido = datos[2];
                    String telefono = datos[3];
                    int semestre = Integer.parseInt(datos[4]);
                    float promedio = Float.parseFloat(datos[5]);
                    String serial = datos[6];

                    EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, semestre, promedio, serial);
                    estudiantes.add(estudiante);
                }
            }
            System.out.println("Archivo importado correctamente.");
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
            String[] datos = linea.split(","); // Asumimos que los datos están separados por comas
            if (datos.length == 6) {
                String cedula = datos[0];
                String nombre = datos[1];
                String apellido = datos[2];
                String telefono = datos[3];
                String modalidad = datos[4];
                int asignaturas = Integer.parseInt(datos[5]);
                String serial = datos[6];

                EstudianteDiseno estudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidad, asignaturas, asignaturas);
                estudiantes.add(estudiante);
            }
        }
         System.out.println("Archivo importado correctamente.");
        }catch (IOException e) {
        e.printStackTrace();
        }
    return estudiantes;
    }
}

