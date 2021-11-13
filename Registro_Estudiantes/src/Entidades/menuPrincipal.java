package Entidades;
import javax.swing.JOptionPane;

public class menuPrincipal {

    // metodo para trabajar el menu principal
    public void menuPrincipal() {
        int opc;
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "¡Bienvenido a la Universidad los Patitos!\n" + "Por favor elija la opcion que desea\n"
                        + "1. Modulo Estudiantes\n" + "2. Consultas a la Universidad\n"+"3. Salir"));

        switch (opc) {
        default:
            JOptionPane.showMessageDialog(null, "Opcion ingresada incorrectamente", null, JOptionPane.ERROR_MESSAGE);
            menuPrincipal();break;
            case 1:
            //Se crea el objeto de estudiante para hacer el llamado del metodo Menu Estudiante
            Estudiante2 estudiante = new Estudiante2();
            estudiante.menuEstudiante();
            break;
            case 2:
            //Se crea el objeto de universidad para hacer el llamado del metodo opciones uni
            Universidad2 universidad = new Universidad2();
            universidad.opcionesuni();
            break;
            case 3:
            JOptionPane.showMessageDialog(null, "¡Saliendo del sistema!",null, JOptionPane.WARNING_MESSAGE);
            System.exit(0);
            break;
        }
    }
}
