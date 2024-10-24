class EstudianteDiseno extends Estudiante{
    String modalidadEstudio;
    int asignaturas;
    String serialTableta;

    public EstudianteDiseno(String cedula, String nombre, String apellido, String telefono, String modalidadEstudio,int asignaturas, String serialTableta) {
        super(cedula, nombre, apellido, telefono);
        this.modalidadEstudio = modalidadEstudio;
        this.asignaturas = asignaturas;
        this.serialTableta = serialTableta;
    }

    // Métodos para mostrar detalles
    @Override
    public void mostrarDatos(){
        System.out.println("Estudiante Diseño: " + nombre + " " + apellido + "\n" +
         " - Modalidad: " + modalidadEstudio + "\n" +
         " - Asignaturas: " + asignaturas);
    }

    @Override
    public String getSerial(){
        return serialTableta;
    }
}
