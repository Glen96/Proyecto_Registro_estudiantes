package Entidades;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import Interfaces.Retirable;
import Interfaces.Matriculable;
import Interfaces.Pagable;

public class Estudiante2 extends Entidad implements Matriculable, Retirable, Pagable {

    protected int idEstudiante;
    private ArrayList<Entidad> entidad = new ArrayList();

    public void menuEstudiante() {
        int opc;
        opc = Integer.parseInt(JOptionPane.showInputDialog(null,
                "!Bienvenidoa la Universidad los Patitos!\n" + "Por favor elija la opcion que desea\n"
                        + "1. Matricular\n" + "2.Retirar materia\n" + "3. Pagar Matricula"
                        + "4. Regresar al menu Principal"));

        switch (opc) {
        default:
            JOptionPane.showMessageDialog(null, "Opcion ingresada incorrectamente", null, JOptionPane.ERROR_MESSAGE);
            menuEstudiante();
            break;
        case 1:
            // Se hace el llamado del metodo Matricular
            Matricular();
            break;
        case 2:
            // Se haceace el llamado al metodo Retirar
            Retirar();
            break;
        case 3:
            break;
        case 4:
            menuPrincipal menuPrincipal = new menuPrincipal();
            menuPrincipal.menuPrincipal();
            break;
        }
    }

    @Override
    public void Matricular() {

    }

    @Override
    public void Retirar() {
        // TODO Auto-generated method stub

    }

}
