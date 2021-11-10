import javax.swing.JOptionPane;

public class Profesor extends Entidad{

    private int notaFinal;
    private String rep;

    public Profesor (String nombre, String Nacionalidad, short edad, Date fechaNaci, int cedula, int notaFinal, String rep){
        super(nombre, Nacionalidad, edad, fechaNaci, cedula);
        this.notaFinal=notaFinal;
        this.rep=rep;
    }


    public void Reportes(){
        rep= JOptionPane.showInputDialog(null, "Se hará un reporte al estudiante: "+getNombre()+ "\ncon el # de cedula: "+ getCedula());
        JOptionPane.showMessageDialog(null, "El reporte realizado dice: "+rep);
    }

    public void Calificar(){
        notaFinal= Integer.parseInt(JOptionPane.showInputDialog(null, "Vas a calificar al estudiante: "+getNombre()+ 
        "\n de edad de: "+ getEdad()+ " con # de cedula: "+ getCedula()));

        JOptionPane.showMessageDialog(null, "La nota final del estudiante: "+ getNombre()+ "es de: "+notaFinal);
    }

}