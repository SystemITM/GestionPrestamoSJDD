class EstudianteDiseno extends Estudiante{
String modalidadEstudio;
int asignaturas;
int serialTableta;

public EstudianteDiseno(String cedula, String nombre, String apellido, String telefono, String modalidadEstudio,int asignaturas, int serialTableta) {
    super(cedula, nombre, apellido, telefono);
    this.modalidadEstudio = modalidadEstudio;
    this.asignaturas = asignaturas;
    this.serialTableta = serialTableta;
}

@Override
public void mostrarDatos(){
    System.out.println("Estudiante Diseño: " + nombre + " " + apellido + " - Modalidad: " + modalidadEstudio + " - Asignaturas: " + asignaturas);
}

@Override
public String getSerial(){
    return String.valueOf(serialTableta); //Convierte a una cadena String los tipos de datos pasados como parámetro.
}
}
