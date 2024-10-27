class EstudianteIngenieria extends Estudiante {

    int semestre;
    float promedio;
    String serialComputador;

    //constructor 
    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int semestre,float promedio, String serialComputador) {
        super(cedula, nombre, apellido, telefono);
        this.semestre = semestre;
        this.promedio = promedio;
        this.serialComputador = serialComputador;
    }

    // Métodos para mostrar detalles
    @Override
    public void mostrarDatos(){
        System.out.println("Estudiante Ingeniería: " + nombre + " " + apellido + 
        "\n" + " - Semestre: " + semestre + 
        "\n" + " - Promedio: " + promedio);
    }

    @Override
    public String getSerial(){
        return serialComputador;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public float getPromedio() {
        return promedio;
    }
    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }
    public void setSerialComputador(String serialComputador) {
        this.serialComputador = serialComputador;
    }
    
}
