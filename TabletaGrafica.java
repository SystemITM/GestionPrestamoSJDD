import java.util.Scanner;
class TabletaGrafica {
    String serial;
    String marca;
    float tamano;
    float precio;
    String almacenamiento;
    float peso;
    int estado;

    public TabletaGrafica(String serial, String marca, float tamano, float precio, String almacenamiento, float peso, int estado) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
        this.peso = peso;
        this.estado = estado;
    }    

    // Métodos para el submenú de almacenamiento
    public static String seleccionarAlmacenamiento() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el almacenamiento:");
        System.out.println("1. 256 GB");
        System.out.println("2. 512 GB");
        System.out.println("3. 1 TB");
        int opcion = sc.nextInt();
        switch(opcion) {
            case 1: return "256 GB";
            case 2: return "512 GB";
            case 3: return "1 TB";
            default: return seleccionarAlmacenamiento(); // Validación recursiva
        }
    }

    // Métodos para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Tableta: " + marca + "\n" +
        " - Almacenamiento: " + almacenamiento +"\n" +
        " - Precio: " + precio + "\n" + 
        "- Serial: " + serial);
    }
    
    public String getSerial() {
        return serial;
    }
      // Método para cambiar el estado del equipo
      public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getEstado() {
        return estado;
    }
}
