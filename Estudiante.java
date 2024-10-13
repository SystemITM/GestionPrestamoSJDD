abstract class Estudiante{
    String cedula;
    String nombre;
    String apellido;
    String telefono;

    public Estudiante(String cedula, String nombre, String apellido, String telefono) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
    }

   // Métodos abstractos para implementación en clases hijas
   public abstract void mostrarDatos();
   public abstract String getSerial();
    
   
}