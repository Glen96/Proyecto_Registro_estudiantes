import javax.swing.JOptionPane;

public class menuPrincipal {

    // metodo para trabajar el menu principal
    public void menuPrincipal() {
        int opc;
        opc = Integer
                .parseInt(JOptionPane.showInputDialog(null, "!Bienvenido!\n" + "Por favor elija la opcion que desea\n"
                        + "1. Modulo Estudiantes\n" + "2. Consultas a la Universidad"));
    }
}
