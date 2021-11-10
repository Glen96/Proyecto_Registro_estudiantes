public class Universidad {

    public String sede;
    
// Opciones de Universidad
    public public static void opcionesuni() {

        public int option=0;
        do{

            String arr[]={"1.Elegir sede","2.Consultar matricula","3.Salir"};
		    cad=JOptionPane.showInputDialog(null,arr,"Universidad",JOptionPane.QUESTION_MESSAGE);
		    option=Integer.parseInt(cad);

		

               switch (option) {
                case 1:
                       this.Universidadsede;
                       break;
                case 2:
                       this.validarmatricula;

               }

        }while (op!=3);
    
        

    }
    
// Metodo para mostrar sedes de universidad
    public static void Universidadsede{
        String VU[] = {
            "Seleccione la sede",
            "San Pedro",
            "Cartago",
            "Heredia",
            "Salir",
            }; 
            
            String op = (String) JOptionPane.showInputDialog(null, "Opciones", "Universidad", JOptionPane.DEFAULT_OPTION,VU, VU[0]);

        if ("San Pedro".equals(op))
        sede="San Pedro";

        if ("Cartago".equals(op))
        sede="Cartago";

        if ("Heredia".equals(op))
        sede="Heredia";

    }

 
    //Metodo para busqueda de matricula
    public static void validarmatricula(int cedula){
        
        for (Universidad universidad : Estudiante) {
            if (Universidad.getCedula().equals(cedula){
                System.out.println("Estudiante matriculado correctamente");
            }else {
                System.out.println("Estudiante no matriculado")
            }



        }



    }
    
}
