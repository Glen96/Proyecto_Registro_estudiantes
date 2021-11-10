import javax.swing.JOptionPane;

public class menuPrincipal {

    // metodo para trabajar el menu principal
    public void menuPrincipal() {
        int opc;
        opc = Integer
                .parseInt(JOptionPane.showInputDialog(null, "!Bienvenido a la Universidad los Pollitos!\n" + "Por favor elija la opcion que desea\n"
                        + "1. Modulo Estudiantes\n" + "2. Consultas a la Universidad\n" + "3. Salir"));
        switch (opc) {
        default:
            JOptionPane.showMessageDialog(null, "Opcion elegida incorrecta");
            menuPrincipal();
            break;
        case 1:
            Estudiante e = new Estudiante();
            e.menuEstudiante();
            break;
        }
    }
}
