class ComputadorPortatil {
    String serial;
    String marca;
    float tamano;
    float precio;
    String sistemaOperativo;
    String procesador;

    public ComputadorPortatil(String serial, String marca, float tamano, float precio, String sistemaOperativo,String procesador) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.sistemaOperativo = sistemaOperativo;
        this.procesador = procesador;
    }    
    
    // Métodos para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Computador: " + marca + " - " + sistemaOperativo + " - Procesador: " + procesador + " - Precio: " + precio);
    }

    public String getSerial() {
        return serial;
    }
}
