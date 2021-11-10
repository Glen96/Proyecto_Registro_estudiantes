import java.util.Date;

public abstract class Entidad {

    // Se declaran todas las variables protegidas ya que se van a utilizar en otras
    // clases con herencia.
    protected String Nombre;
    protected String Nacionalidad;
    protected short edad;
    protected Date fechaNacimiento;
    protected int cedula;

    // se generan los setters y getters necesarios para el funcionamiento de la
    // clase
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        Nacionalidad = nacionalidad;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

}
