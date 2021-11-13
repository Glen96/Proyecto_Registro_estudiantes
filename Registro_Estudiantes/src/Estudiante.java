import javax.swing.JOptionPane;

public class Estudiante extends Entidad{
    
    protected int idEstudiante;
    protected Aula aulaEstudiante;

    public Aula getAulaEstudiante() {
        return aulaEstudiante;
    }

    public void setAulaEstudiante(Aula aulaEstudiante) {
        this.aulaEstudiante = aulaEstudiante;
    }

    private void Matricular(){
        JOptionPane.showMessageDialog(null, "message");
    }
}
