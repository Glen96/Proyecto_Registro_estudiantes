public class Universidad {
    public String Universidadsede;
    


    //Metofo para busqueda de matricula
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
