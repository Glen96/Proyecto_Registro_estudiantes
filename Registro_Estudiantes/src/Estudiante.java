import javax.swing.JOptionPane;

public class Estudiante extends Entidad {
    public int idEstudiante;

    public void menuEstudiante() {
        int opc;
        opc = Integer
                .parseInt(JOptionPane.showInputDialog(null, "!Bienvenido!\n" + "Por favor elija la opcion que desea\n"
                        + "1. Modulo Estudiantes\n" + "2. Consultas a la Universidad\n" + "3. Salir"));
        switch (opc) {
        default:
            JOptionPane.showMessageDialog(null, "Opcion elegida incorrecta");
            menuEstudiante();
            break;
        case 1:
            Matricular();
            break;
        }
    }

    private void Matricular() {
        JOptionPane.showMessageDialog(null, "Modulo de Matricula");

    }
}
