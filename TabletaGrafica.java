class TabletaGrafica {
    String serial;
    String marca;
    float tamano;
    float precio;
    String almacenamiento;
    float peso;

    public TabletaGrafica(String serial, String marca, float tamano, float precio, String almacenamiento, float peso) {
        this.serial = serial;
        this.marca = marca;
        this.tamano = tamano;
        this.precio = precio;
        this.almacenamiento = almacenamiento;
        this.peso = peso;
    }    

    // Métodos para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Tableta: " + marca + " - Almacenamiento: " + almacenamiento + " - Precio: " + precio);
    }
    
    public String getSerial() {
        return serial;
    }
}
