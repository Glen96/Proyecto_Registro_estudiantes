package Entidades;
public class ProfesorXMateria extends Materia {
        //protected int codProfesor;
    //protected int codCurso;

    String nombreProf = "Mateo";

    public ProfesorXMateria(String nombreCurso, String descrip, int creditos){
        super(nombreCurso, descrip, creditos);
    }

    public void asignarProfesor(){
        System.out.println("Al profesor: "+nombreProf + "le toca dar la materia: "+ getNombreCurso()+
        "\n La descripción del curso es: "+getDescrip()+ "\nel total de creditos es de: "+getCreditos());
    }
}
