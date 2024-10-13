import java.util.ArrayList;
import java.util.Scanner;

class GestionPrestamos {

    ArrayList<EstudianteIngenieria> vectorIngenieros = new ArrayList<>();
    ArrayList<EstudianteDiseno> vectorDisenadores = new ArrayList<>(); 
    ArrayList<ComputadorPortatil> vectorPortatil = new ArrayList();
    ArrayList<TabletaGrafica> vectorTableta = new ArrayList();
    Scanner sc = new Scanner(System.in);

    // Método para registrar préstamo de equipo a un estudiante de ingeniería
    public void registrarPrestamoIngenieria(){
        System.out.println("=== Registrar Prestamo de Equipo (Ingenieria) ===");
        System.out.print("Ingrese la cedula del estudiante: ");
        String cedula = sc.next();

        //Validar que no tenga un equipo ya registrado
        if (buscarPorCedulaIngenieria(cedula) != null) {
            System.out.println("Este estudiante ya tiene un equipo prestado.");
            return;
        }

        System.out.print("Ingrese el nombre: ");
        String nombre = validarCadena(sc.next());
        System.out.print("Ingrese el apellido: ");
        String apellido = validarCadena(sc.next());
        System.out.print("Ingrese el telefono: ");
        String telefono = validarTelefono(sc.next());
        System.out.print("Ingrese el semestre actual: ");
        int semestre = sc.nextInt(); 
        System.out.print("Ingrese el promedio acumulado: ");
        float promedio = sc.nextFloat();
        System.out.print("Ingrese el serial del computador: ");
        String serialComputador = sc.next();

        //crear y almacenar el estudiante y su equipo
        EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, semestre, promedio, serialComputador);
        vectorIngenieros.add(estudiante);
        System.out.println(estudiante);
        System.out.println("Prestamo registrado exitosamente.");
    }

    // Método para modificar préstamo (Ingeniería)
    public void modificarPrestamoIngenieria(){
        System.out.println("=== Modificar Prestamos (Ingenieria) ===");
        System.out.print("Ingrese la cedula o  el serial del equipo: ");
        String busqueda = sc.next();
        EstudianteIngenieria estudiante = buscarPorCedulaOEquipoIngenieria(busqueda);

        if (estudiante == null) {
            System.out.println("No se encontro el registro.");
            return;
        }

        System.out.println("Modificar datos del estudiante: ");
        System.out.print("Ingrese el nuevo nombre: ");
        estudiante.nombre = validarCadena(sc.next());
        System.out.print("Ingrese el nuevo apellido: ");
        estudiante.apellido = validarCadena(sc.next());
        System.out.print("Ingrese el nuevo telefono: ");
        estudiante.telefono = validarTelefono(sc.next());

        System.out.println("Modificacion realizada con exito.");

    }

    //Método para buscar equipo (Ingeniería)
    public void buscarEquipoIngenieria(){
        System.out.println("=== Buscar equipo (Ingenieria) ===");
        System.out.print("Ingrese la cedula o el serial del equipo: ");
        String buscar = sc.next();
        EstudianteIngenieria estudiante = buscarPorCedulaOEquipoIngenieria(buscar);

        if (estudiante == null) {
            System.out.println("No se encontro el registro.");
        }else {
            estudiante.mostrarDatos();
        }
    }

    // Método para la devolución de equipo (Ingeniería)
    public void devolucionEquipoIngenieria(){
        System.out.println("=== Devolucion de equipo (Ingenieria) ===");
        System.out.print("Ingrese la cedula o el serial del equipo: ");
        String buscar = sc.next();
        EstudianteIngenieria estudiante = buscarPorCedulaOEquipoIngenieria(buscar);

        if (estudiante == null) {
            System.out.println("No se encontro el registro");            
        }else {
            vectorIngenieros.remove(estudiante);
            System.out.println("Equipo devuelto y registro eliminado.");
        }
    }

    // Métodos auxiliares para buscar estudiante por cédula o equipo (Ingeniería)
    EstudianteIngenieria buscarPorCedulaIngenieria(String cedula){
        for(EstudianteIngenieria estudiante : vectorIngenieros){
            if (estudiante.cedula.equals(cedula)) {
                return estudiante;
            }
        }
        return null;
    }

    EstudianteIngenieria buscarPorCedulaOEquipoIngenieria(String buscar){
        for(EstudianteIngenieria estudiante : vectorIngenieros){
            if (estudiante.cedula.equals(buscar) || estudiante.getSerial().equals(buscar)) {
                return estudiante;
            }
        }
        return null;
    }
 // Métodos equivalentes para estudiantes de diseño (registrar, modificar, buscar, devolución) 

    // Método para registrar préstamo de equipo a un estudiante de diseño
    public void registrarPrestamoDiseno() {
        System.out.println("=== Registrar Préstamo de Equipo (Diseño) ===");
        System.out.print("Ingrese la cédula del estudiante: ");
        String cedula = sc.next();

        // Validar que no tenga un equipo ya registrado
        if (buscarPorCedulaDiseno(cedula) != null) {
            System.out.println("Este estudiante ya tiene un equipo prestado.");
            return;
        }

        System.out.print("Ingrese el nombre: ");
        String nombre = validarCadena(sc.next());
        System.out.print("Ingrese el apellido: ");
        String apellido = validarCadena(sc.next());
        System.out.print("Ingrese el teléfono: ");
        String telefono = validarTelefono(sc.next());
        System.out.print("Ingrese la modalidad de estudio (Presencial o Virtual): ");
        String modalidad = sc.next();
        System.out.print("Ingrese la cantidad de asignaturas: ");
        int asignaturas = sc.nextInt();
        System.out.print("Ingrese el serial de la tableta: ");
        String serialTableta = sc.next();

         // Crear y almacenar el estudiante y su equipo
         EstudianteDiseno estudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidad, asignaturas, asignaturas);
         vectorDisenadores.add(estudiante);
         System.out.println("Préstamo registrado exitosamente.");
    }

    // Método para modificar préstamo (Diseño)
    public void modificarPrestamoDiseno() {
        System.out.println("=== Modificar Préstamo (Diseño) ===");
        System.out.print("Ingrese la cédula o el serial del equipo: ");
        String busqueda = sc.next();
        EstudianteDiseno estudiante = buscarPorCedulaOEquipoDiseno(busqueda);

        if (estudiante == null) {
            System.out.println("No se encontró el registro.");
            return;
        }
        System.out.println("Modificar datos del estudiante:");
        System.out.print("Ingrese el nuevo nombre: ");
        estudiante.nombre = validarCadena(sc.next());
        System.out.print("Ingrese el nuevo apellido: ");
        estudiante.apellido = validarCadena(sc.next());
        System.out.print("Ingrese el nuevo teléfono: ");
        estudiante.telefono = validarTelefono(sc.next());

        System.out.println("Modificación realizada con éxito.");
    }

    // Método para buscar equipo (Diseño)
    public void buscarEquipoDiseno() {
        System.out.println("=== Buscar Equipo (Diseño) ===");
        System.out.print("Ingrese la cédula o el serial del equipo: ");
        String buscar = sc.next();
        EstudianteDiseno estudiante = buscarPorCedulaOEquipoDiseno(buscar);

        if (estudiante == null) {
            System.out.println("No se encontró el registro.");
        } else {
            estudiante.mostrarDatos();
        }
    }

    // Método para la devolución de equipo (Diseño)
    public void devolucionEquipoDiseno() {
        System.out.println("=== Devolución de Equipo (Diseño) ===");
        System.out.print("Ingrese la cédula o el serial del equipo: ");
        String buscar = sc.next();
        EstudianteDiseno estudiante = buscarPorCedulaOEquipoDiseno(buscar);

        if (estudiante == null) {
            System.out.println("No se encontró el registro.");
        } else {
            vectorDisenadores.remove(estudiante);
            System.out.println("Equipo devuelto y registro eliminado.");
        }
    }

    // Métodos auxiliares para buscar estudiante por cédula o equipo (Diseño)
    EstudianteDiseno buscarPorCedulaDiseno(String cedula) {
        for (EstudianteDiseno estudiante : vectorDisenadores) {
            if (estudiante.cedula.equals(cedula)) {
                return estudiante;
            }
        }
        return null;
    }
    EstudianteDiseno buscarPorCedulaOEquipoDiseno(String buscar) {
        for (EstudianteDiseno estudiante : vectorDisenadores) {
            if (estudiante.cedula.equals(buscar) || estudiante.getSerial().equals(buscar)) {
                return estudiante;
            }
        }
        return null;
    }

    // Métodos de validación (nombre, apellido, teléfono)
    String validarCadena(String input){
        // Validación recursiva para nombres/apellidos
        if (input.matches("[a-zA-Z]+")) {
            return input;
        }else {
            System.out.println("Entrada invalida. Ingrese solo letras.");
            return validarCadena(sc.next());
        }
    }
    String validarTelefono(String input){
        // Validación para teléfonos (solo números)
        if (input.matches("[0-9]+")) {
            return input;
        }else {
            System.out.println("Telefono invalido. Ingrese solo numeros.");
            return validarTelefono(sc.next());
        }
    }

    // Método para imprimir el inventario total
    public void imprimirInventario(){
        System.out.println("=== Inventario Total ===");
        System.out.println("Equipos prestados a estudiantes de Ingenieria:");
        for(EstudianteIngenieria estudiante : vectorIngenieros){
            estudiante.mostrarDatos();
        }

        System.out.println("Equipos prestados a estudiaantes de Diseño:");
        for(EstudianteDiseno estudiante : vectorDisenadores){
            estudiante.mostrarDatos();
        }
    }
}
