import java.util.Scanner;
class ComputadorPortatil {
    Scanner sc = new Scanner(System.in);
    String serial;
    String marca;
    float tamano;
    float precio;
    String sistemaOperativo;
    String procesador;
    int estado;
    public ComputadorPortatil(String serial, String marca, float tamano, float precio, String sistemaOperativo,String procesador, int estado) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
        this.estado = estado;
    }    
     // Métodos para el submenú de sistema operativo y procesador
     public static String seleccionarSistemaOperativo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el sistema operativo:");
        System.out.println("1. Windows 7");
        System.out.println("2. Windows 10");
        System.out.println("3. Windows 11");
        int opcion = sc.nextInt();
        switch(opcion) {
            case 1: return "Windows 7";
            case 2: return "Windows 10";
            case 3: return "Windows 11";
            default: return seleccionarSistemaOperativo(); // Validación recursiva
        }
    }

    public static String seleccionarProcesador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el procesador:");
        System.out.println("1. AMD Ryzen");
        System.out.println("2. Intel® Core™ i5");
        int opcion = sc.nextInt();
        switch(opcion) {
            case 1: return "AMD Ryzen";
            case 2: return "Intel® Core™ i5";
            default: return seleccionarProcesador(); // Validación recursiva
        }
    }

    
    // Métodos para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Computador: " + marca + "\n" +
        " - " + sistemaOperativo + "\n" + 
        " - Procesador: " + procesador +"\n" +
         " - Precio: " + precio + "\n" + 
         "- Serial: " + serial);
    }

    public String getSerial() {
        return serial;
    }

    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public float getTamano() {
        return tamano;
    }
    public void setTamano(float tamano) {
        this.tamano = tamano;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
    public String getProcesador() {
        return procesador;
    }
    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
}
