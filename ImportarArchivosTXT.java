import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ImportarArchivosTXT {

    public static ArrayList<EstudianteIngenieria> importarEstudiantesIngenieria(String filePath) {
        ArrayList<EstudianteIngenieria> estudiantesIngenieria = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            String cedula = "", nombre = "", apellido = "", telefono = "";
            int semestre = 0;
            float promedio = 0;
            String serial = "";
            
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                // Verificar si es una línea vacía para crear el estudiante
                if (linea.isEmpty()) {
                    // Crear un nuevo objeto EstudianteIngenieria con los datos leídos
                    EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, semestre, promedio, serial);
                    estudiantesIngenieria.add(estudiante);

                    // Reiniciar las variables para el siguiente bloque
                    cedula = nombre = apellido = telefono = serial = "";
                    semestre = 0;
                    promedio = 0;
                } else {
                    String[] partes = linea.split(":", 2);
                    if (partes.length < 2) continue;
                    String clave = partes[0].trim();
                    String valor = partes[1].trim();

                    // Asignar los valores correspondientes
                    switch (clave) {
                        case "Cedula":
                            cedula = valor;
                            break;
                        case "Nombre":
                            nombre = valor;
                            break;
                        case "Apellido":
                            apellido = valor;
                            break;
                        case "Teléfono":
                            telefono = valor;
                            break;
                        case "Semestre":
                            semestre = Integer.parseInt(valor);
                            break;
                        case "Promedio":
                            promedio = Float.parseFloat(valor);
                            break;
                        case "Serial":
                            serial = valor;
                            break;
                    }
                }
            }
            // Agregar el último estudiante si el archivo no termina en una línea vacía
            if (!cedula.isEmpty()) {
                EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, semestre, promedio, serial);
                estudiantesIngenieria.add(estudiante);
            }
            System.out.println(" ");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de estudiantes de Ingeniería: " + e.getMessage());
        }
        return estudiantesIngenieria;
    }

    public static ArrayList<EstudianteDiseno> importarEstudiantesDiseno(String filePath) {
        ArrayList<EstudianteDiseno> estudiantesDiseno = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            String cedula = "", nombre = "", apellido = "", telefono = "", modalidad = "";
            int cantidadAsignaturas = 0;
            String serial = "";
            
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                // Verificar si es una línea vacía para crear el estudiante
                if (linea.isEmpty()) {
                    // Crear un nuevo objeto EstudianteDiseno con los datos leídos
                    EstudianteDiseno estudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidad, cantidadAsignaturas, serial);
                    estudiantesDiseno.add(estudiante);

                    // Reiniciar las variables para el siguiente bloque
                    cedula = nombre = apellido = telefono = modalidad = serial = "";
                    cantidadAsignaturas = 0;
                } else {
                    String[] partes = linea.split(":", 2);
                    if (partes.length < 2) continue;
                    String clave = partes[0].trim();
                    String valor = partes[1].trim();

                    // Asignar los valores correspondientes
                    switch (clave) {
                        case "Cedula":
                            cedula = valor;
                            break;
                        case "Nombre":
                            nombre = valor;
                            break;
                        case "Apellido":
                            apellido = valor;
                            break;
                        case "Teléfono":
                            telefono = valor;
                            break;
                        case "Modalidad":
                            modalidad = valor;
                            break;
                        case "Cantidad de Asignaturas":
                            cantidadAsignaturas = Integer.parseInt(valor);
                            break;
                        case "Serial":
                            serial = valor;
                            break;
                    }
                }
            }
            // Agregar el último estudiante si el archivo no termina en una línea vacía
            if (!cedula.isEmpty()) {
                EstudianteDiseno estudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidad, cantidadAsignaturas, serial);
                estudiantesDiseno.add(estudiante);
            }
            System.out.println(" ");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de estudiantes de Diseño: " + e.getMessage());
        }
        return estudiantesDiseno;
    }
    public static ArrayList<ComputadorPortatil> importarComputadoresPortatiles(String filePath) {
        ArrayList<ComputadorPortatil> computadoresPortatiles = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            String serial = "", marca = "", sistemaOperativo = "", procesador = "";
            float tamano = 0, precio = 0;
            int estado = 0;

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                if (linea.isEmpty()) {
                    // Crear un nuevo objeto ComputadorPortatil con los datos leídos
                    ComputadorPortatil portatil = new ComputadorPortatil(serial, marca, tamano, precio, sistemaOperativo, procesador, estado);
                    computadoresPortatiles.add(portatil);

                    // Reiniciar las variables para el siguiente bloque
                    serial = marca = sistemaOperativo = procesador = "";
                    tamano = precio = 0;
                    estado = 0;
                } else {
                    String[] partes = linea.split(":", 2);
                    if (partes.length < 2) continue;
                    String clave = partes[0].trim();
                    String valor = partes[1].trim();

                    switch (clave) {
                        case "Serial":
                            serial = valor;
                            break;
                        case "Marca":
                            marca = valor;
                            break;
                        case "Tamaño":
                            tamano = Float.parseFloat(valor);
                            break;
                        case "Precio":
                            precio = Float.parseFloat(valor);
                            break;
                        case "Sistema operativo":
                            sistemaOperativo = valor;
                            break;
                        case "Procesador":
                            procesador = valor;
                            break;
                        case "Estado":
                            estado = Integer.parseInt(valor);
                            break;
                    }
                }
            }
            // Agregar el último computador portátil si el archivo no termina en una línea vacía
            if (!serial.isEmpty()) {
                ComputadorPortatil portatil = new ComputadorPortatil(serial, marca, tamano, precio, sistemaOperativo, procesador, estado);
                computadoresPortatiles.add(portatil);
            }
            System.out.println(" ");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de Computadores Portátiles: " + e.getMessage());
        }
        return computadoresPortatiles;
    }

    public static ArrayList<TabletaGrafica> importarTabletasGraficas(String filePath) {
        ArrayList<TabletaGrafica> tabletasGraficas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String linea;
            String serial = "", marca = "", almacenamiento = "";
            float tamano = 0, precio = 0, peso = 0;
            int estado = 0;

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                if (linea.isEmpty()) {
                    // Crear un nuevo objeto TabletaGrafica con los datos leídos
                    TabletaGrafica tableta = new TabletaGrafica(serial, marca, tamano, precio, almacenamiento, peso, estado);
                    tabletasGraficas.add(tableta);

                    // Reiniciar las variables para el siguiente bloque
                    serial = marca = almacenamiento = "";
                    tamano = precio = peso = 0;
                    estado = 0;
                } else {
                    String[] partes = linea.split(":", 2);
                    if (partes.length < 2) continue;
                    String clave = partes[0].trim();
                    String valor = partes[1].trim();

                    switch (clave) {
                        case "Serial":
                            serial = valor;
                            break;
                        case "Marca":
                            marca = valor;
                            break;
                        case "Tamaño":
                            tamano = Float.parseFloat(valor);
                            break;
                        case "Precio":
                            precio = Float.parseFloat(valor);
                            break;
                        case "Almacenamiento":
                            almacenamiento = valor;
                            break;
                        case "Peso":
                            peso = Float.parseFloat(valor);
                            break;
                        case "Estado":
                            estado = Integer.parseInt(valor);
                            break;
                    }
                }
            }
            // Agregar la última tableta gráfica si el archivo no termina en una línea vacía
            if (!serial.isEmpty()) {
                TabletaGrafica tableta = new TabletaGrafica(serial, marca, tamano, precio, almacenamiento, peso, estado);
                tabletasGraficas.add(tableta);
            }
            System.out.println(" ");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de Tabletas Gráficas: " + e.getMessage());
        }
        return tabletasGraficas;
    }
}
