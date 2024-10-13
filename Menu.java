import java.util.Scanner;

public class Menu {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            GestionPrestamos gestionPrestamos = new GestionPrestamos();
            ImportarArchivosTXT importarArchivosTXT = new ImportarArchivosTXT();
            ExportarArchivosTXT exportarArchivosTXT = new ExportarArchivosTXT();
            GestionArchivo gestionArchivo = new GestionArchivo();
            int opcion;

            do{
                //Menu principal
                System.out.println("=== GESTIÓN PRÉSTAMOS UNIVERSIDAD SAN JUAN DE DIOS ===");
                System.out.println("1. Estudiantes de Ingenieria"); // Computadores
                System.out.println("2. Estudiantes de Diseño"); // Tabletas
                System.out.println("3. Imprimir Inventario Total");
                System.out.println("4. Importar Estudiantes de Ingenieria");
                System.out.println("5 Exportar estudiantes de Ingenieria");
                System.out.println("6. Importar estudiantes de Diseño");
                System.out.println("7. Exportar estudiantes de Diseño");
                System.out.println("8. Salir");
                System.out.println("Selecione una opcion: ");
                opcion = sc.nextInt();
                sc.nextLine();// Consumir la nueva línea 

                switch (opcion) {
                    case 1:
                        menuEstudiantesIngenieria(gestionPrestamos);
                        break;
                    case 2:
                        menuEstudiantesDiseno(gestionPrestamos);
                        break;
                    case 3:
                        gestionPrestamos.imprimirInventario();
                        break;
                    case 4:
                        gestionArchivo.importarEstudiantesIngenieria(gestionPrestamos.vectorIngenieros);
                        break;
                    case 5:
                        gestionArchivo.exportarEstudiantesIngenieria(gestionPrestamos.vectorIngenieros);
                        break;
                    case 6:
                        gestionArchivo.importarEstudiantesDiseno(gestionPrestamos.vectorDisenadores);
                        break;
                    case 7:
                        gestionArchivo.exportarEstudiantesDiseno(gestionPrestamos.vectorDisenadores);
                        break;
                    case 8:
                        System.out.println("Saliendo del programa...");
                        break;
                    default:
                        System.out.println("Opcion no valida, intente nuevamente.");
                        break;
                }
            }while(opcion != 8);
        }

        //Submenú para estudiantes de ingeniería
        public static void menuEstudiantesIngenieria(GestionPrestamos gestionPrestamos){
            Scanner sc = new Scanner(System.in);
            int opcion;
            do{
                System.out.println("=== Menú Estudiantes de Ingeniería ===");
                System.out.println("1. Registrar prestamos de equipo");
                System.out.println("2. Modificar prestamos de equipo");
                System.out.println("3. Devolucion de equipo");
                System.out.println("4. Buscar equipo");
                System.out.println("5. Volver al menu principal");
                System.out.println("Seleccione una opcion: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        gestionPrestamos.registrarPrestamoIngenieria();
                        break;
                    case 2:
                        gestionPrestamos.modificarPrestamoIngenieria();
                        break;
                    case 3:
                        gestionPrestamos.devolucionEquipoIngenieria();
                        break;
                    case 4:
                        gestionPrestamos.buscarEquipoIngenieria();
                        break;
                    case 5:
                        System.out.println("Volviendo al menu principal...");
                        break;
                    default:
                        System.out.println("Opcion no valida, intente nuevamente.");
                        break;
                }
            }while (opcion !=5);
        }

        // Submenú para estudiantes de diseño
        public static void menuEstudiantesDiseno(GestionPrestamos gestionPrestamos){
            Scanner sc = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("=== Menú Estudiantes de Diseño ===");
                System.out.println("1. Registrar préstamo de equipo");
                System.out.println("2. Modificar préstamo de equipo");
                System.out.println("3. Devolución de equipo");
                System.out.println("4. Buscar equipo");
                System.out.println("5. Volver al menú principal");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();

                switch (opcion) {
                    case 1:
                        gestionPrestamos.registrarPrestamoDiseno();
                        break;
                    case 2:
                        gestionPrestamos.modificarPrestamoDiseno();
                        break;
                    case 3:
                        gestionPrestamos.devolucionEquipoDiseno();
                        break;
                    case 4:
                        gestionPrestamos.buscarEquipoDiseno();
                        break;
                    case 5:
                        System.out.println("Volviendo al menú principal...");
                        break;
                    default:
                        System.out.println("Opción no válida, intente nuevamente.");
                        break;
            }
        } while (opcion != 5);

    }
}
