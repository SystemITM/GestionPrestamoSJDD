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
        

        System.out.println("=== Arma tu computador portatil === ");
        
        String serialComputador = "CPT-"+ (vectorPortatil.size() + 1); // Generar serial automático
        System.out.print("Ingrese la marca del computador: ");
        String marca = sc.next();
        System.out.print("Ingrese el tamaño del computador: ");
        float tamano = sc.nextFloat();
        System.out.print("Ingrese el precio del computador: ");
        float precio = sc.nextFloat();
        String sistemaOperativo = ComputadorPortatil.seleccionarSistemaOperativo();
        String procesador = ComputadorPortatil.seleccionarProcesador();

        //crear y almacenar el estudiante y su equipo

         // Establecer el estado a 1 (prestado)
        ComputadorPortatil nuevoPortatil = new ComputadorPortatil(serialComputador, marca, tamano, precio, sistemaOperativo, procesador, 1);
        vectorPortatil.add(nuevoPortatil);
        
        EstudianteIngenieria estudiante = new EstudianteIngenieria(cedula, nombre, apellido, telefono, semestre, promedio, serialComputador);
        vectorIngenieros.add(estudiante);
        System.out.println(estudiante);
        System.out.println("Préstamo de computador portátil registrado exitosamente.");
    }

    // Método para modificar préstamo (Ingeniería)
    public void modificarPrestamoIngenieria(){
        System.out.println("=== Modificar Prestamos (Ingenieria) ===");
        System.out.print("Ingrese la cedula o  el serial del equipo: ");
        String busqueda = sc.next();
        EstudianteIngenieria estudiante = buscarPorCedulaOEquipoIngenieria(busqueda);
        

        if (estudiante == null) {
            System.out.println("No se encontró ningún préstamo con el serial o cédula proporcionados.");
            return;
        }

        System.out.println("Préstamo encontrado para el estudiante: " + estudiante.nombre);
        // Mostrar opciones de modificación

        System.out.println("¿Qué desea modificar?");
            System.out.println("1. Marca del computador");
            System.out.println("2. Tamaño del computador");
            System.out.println("3. Precio del computador");
            System.out.println("4. Sistema operativo del computador");
            System.out.println("5. Procesador del computador");
            System.out.print("Seleccione una opción: ");
            int opcion = sc.nextInt();
        
        for(ComputadorPortatil portatil : vectorPortatil){
            if (portatil.serial.equals(estudiante.serialComputador)) {
                switch(opcion){
                    case 1:
                            System.out.println("Ingrese la nueva marca: ");
                            String nuevaMarca = sc.next();
                            portatil.marca = nuevaMarca;
                            System.out.println("Marca modificada exitosamente");
                            break;
                    case 2:
                            System.out.print("Ingrese el nuevo tamaño en pulgadas: ");
                            float nuevoTamano = sc.nextFloat();
                            portatil.tamano = nuevoTamano;
                            System.out.println("Tamaño modificado exitosamente.");
                            break;
                        case 3:
                            System.out.print("Ingrese el nuevo precio: ");
                            float nuevoPrecio = sc.nextFloat();
                            portatil.precio = nuevoPrecio;
                            System.out.println("Precio modificado exitosamente.");
                            break;
                        case 4:
                            String nuevoSO = ComputadorPortatil.seleccionarSistemaOperativo();
                            portatil.sistemaOperativo = nuevoSO;
                            System.out.println("Sistema operativo modificado exitosamente.");
                            break;
                        case 5:
                            String nuevoProcesador = ComputadorPortatil.seleccionarProcesador();
                            portatil.procesador = nuevoProcesador;
                            System.out.println("Procesador modificado exitosamente.");
                            break;
                        default:
                            System.out.println("Opción no válida.");
                }
                break;        
            }
        }

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
            ComputadorPortatil portatil = buscarPorPortatil(estudiante.serialComputador);
            estudiante.mostrarDatos();
            System.out.println("\n Computador prestado: ");
            portatil.mostrarDetalles();
        }
    }

    // Método para la devolución de equipo (Ingeniería)
    public void devolucionEquipoIngenieria(){
        System.out.println("=== Devolucion de equipo (Ingenieria) ===");
        System.out.print("Ingrese el serial del equipo o la cédula del estudiante para buscar el préstamo: ");
        String buscar = sc.next();
        EstudianteIngenieria estudiante = buscarPorCedulaOEquipoIngenieria(buscar);
        
        if (estudiante == null ) {
            System.out.println("No se encontro el registro");            
        }else {
            // Encontrar el portátil asociado al estudiante
            ComputadorPortatil portatilADevolver = buscarPorPortatil(estudiante.serialComputador);
            
            portatilADevolver.setEstado(0);// Cambiar el estado del equipo a 0 (disponible)
            System.out.println("El equipo con serial " + portatilADevolver.serial + " ahora está disponible.");

            vectorIngenieros.remove(estudiante);
            
            System.out.println("Préstamo de equipo devuelto y el estado del equipo ha sido actualizado Registro del estudiante eliminado.");
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

    ComputadorPortatil buscarPorPortatil(String buscar){
        for (ComputadorPortatil portatil : vectorPortatil) {
            if (portatil.serial.equals(buscar)) {
                return portatil;
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
        
        System.out.println("=== Arma tu Tableta Grafica === ");
        String serialTableta = "TBL-" + (vectorTableta.size() + 1); // Generar serial automático
        String marca = sc.next();
        System.out.print("Ingrese el tamaño de la tableta (en pulgadas): ");
        float tamano = sc.nextFloat();
        System.out.print("Ingrese el precio de la tableta: ");
        float precio = sc.nextFloat();

        String almacenamiento = TabletaGrafica.seleccionarAlmacenamiento();
        System.out.println("Ingrese el peso de la tableta (en kg): ");
        float peso = sc.nextFloat();

        // Crear y almacenar el estudiante y su equipo
        // Establecer el estado a 1 (prestado)
        TabletaGrafica nuevaTableta = new TabletaGrafica(serialTableta, marca, tamano, precio, almacenamiento, peso, 1);
        vectorTableta.add(nuevaTableta);

         EstudianteDiseno estudiante = new EstudianteDiseno(cedula, nombre, apellido, telefono, modalidad, asignaturas, serialTableta);
         vectorDisenadores.add(estudiante);

        System.out.println("Préstamo de tableta gráfica registrado exitosamente.");
    }

    // Método para modificar préstamo (Diseño)
    public void modificarPrestamoDiseno() {
        System.out.println("=== Modificar Préstamo (Diseño) ===");
        System.out.print("Ingrese la cédula o el serial del equipo: ");
        String busqueda = sc.next();
        EstudianteDiseno estudiante = buscarPorCedulaOEquipoDiseno(busqueda);

        if (estudiante == null) {
            System.out.println("No se encontró ningún préstamo con el serial o cédula proporcionados.");
            return;
        }

         // Mostrar opciones de modificación
         System.out.println("¿Qué desea modificar?");
         System.out.println("1. Marca de la trableta grafica");
         System.out.println("2. Tamaño de la trableta grafica");
         System.out.println("3. Precio de la trableta grafica");
         System.out.println("4. Almacenamiento de la trableta grafica");
         System.out.println("5. Peso de la trableta grafica");
         System.out.print("Seleccione una opción: ");
         int opcion = sc.nextInt();

        for(TabletaGrafica tGrafica : vectorTableta){
            if (tGrafica.serial.equals(estudiante.serialTableta)) {
                switch (opcion) {
                    case 1:
                        System.out.print("Ingrese la nueva marca: ");
                        String nuevaMarca = sc.next();
                        tGrafica.marca = nuevaMarca;
                        System.out.println("Marca modificada exitosamente.");
                        break;
                    case 2:
                        System.out.print("Ingrese el nuevo tamaño en pulgadas: ");
                        float nuevoTamano = sc.nextFloat();
                        tGrafica.tamano = nuevoTamano;
                        System.out.println("Tamaño modificado exitosamente.");
                        break;
                    case 3:
                        System.out.print("Ingrese el nuevo precio: ");
                        float nuevoPrecio = sc.nextFloat();
                        tGrafica.precio = nuevoPrecio;
                        System.out.println("Precio modificado exitosamente.");
                        break;
                    case 4:
                        String nuevoAlmacenamiento = TabletaGrafica.seleccionarAlmacenamiento();
                        tGrafica.almacenamiento = nuevoAlmacenamiento;
                        System.out.println("Almacenamiento modificado exitosamente.");
                        break;
                    case 5:
                        System.out.println("Ingrese el nuevo peso en kg: ");
                        float nuevoPeso = sc.nextFloat();
                        tGrafica.peso = nuevoPeso;
                        System.out.println("Peso modificado exitosamente.");
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
                    break;
            }   

        System.out.println("Modificación realizada con éxito.");
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
            //Encontrar tableta asociada al estudiante
            TabletaGrafica tabletaADevolver = buscarPorTabletaGrafica(estudiante.serialTableta);
            tabletaADevolver.setEstado(0);//cambiar el estado de la tableta a 0 (disponible)

            vectorDisenadores.remove(estudiante);
            System.out.println("Prestamo de tableta devuelto y estatdo de la tableta ha sido actualizado, Registro del estudiante eliminado.");
        }
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
            TabletaGrafica tableta = buscarPorTabletaGrafica(estudiante.serialTableta);
            estudiante.mostrarDatos();
            System.out.println("\n Tableta Grafica Prestada: ");
            tableta.mostrarDetalles();
        }
    }

    TabletaGrafica buscarPorTabletaGrafica(String buscar){
        for (TabletaGrafica tableta : vectorTableta) {
            if (tableta.serial.equals(buscar)) {
                return tableta;
            }
        }
        return null;
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
        System.out.println("\n");
        System.out.println("Equipos prestados a estudiaantes de Diseño:");
        for(EstudianteDiseno estudiante : vectorDisenadores){
            estudiante.mostrarDatos();
        }
        System.out.println("Computadores Portatiles: ");
        for(ComputadorPortatil portatil : vectorPortatil){
            if (portatil.estado == 1) {
                System.out.println("Portatiles prestados: ");
                portatil.mostrarDetalles();
            }
            else{
                System.out.println("Portatiles disponibles: ");
                portatil.mostrarDetalles();
            }
            
        }
    }
}
