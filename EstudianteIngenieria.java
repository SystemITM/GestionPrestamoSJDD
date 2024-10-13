class EstudianteIngenieria extends Estudiante {

    int semestre;
    float promedio;
    String serialComputador;

    public EstudianteIngenieria(String cedula, String nombre, String apellido, String telefono, int semestre,float promedio, String serialComputador) {
        super(cedula, nombre, apellido, telefono);
        this.semestre = semestre;
        this.promedio = promedio;
        this.serialComputador = serialComputador;
    }

    @Override
    public void mostrarDatos(){
        System.out.println("Estudiante Ingeniería: " + nombre + " " + apellido + " - Semestre: " + semestre + " - Promedio: " + promedio);
    }
    
    @Override
    public String getSerial(){
        return serialComputador;
    }
}
