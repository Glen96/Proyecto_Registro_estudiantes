public class Materia {
    private String nombreCurso = "Matematicas";
    private String descrip = "Materia que se lleva en el segundo cuatrimestre de la carrera.";
    private int creditos = 4;
    protected int codCurso; //??

    public Materia (String nombreCurso, String descrip, int creditos){
        this.nombreCurso = nombreCurso;
        this.descrip = descrip;
        this.creditos = creditos;
    }

    public String getNombreCurso(){
        return nombreCurso;
    }
    public String getDescrip (){
        return descrip;
    }
    public int getCreditos (){
        return creditos;
    }
}
