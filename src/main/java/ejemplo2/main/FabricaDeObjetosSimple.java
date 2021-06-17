package ejemplo2.main;

import ejemplo2.modelo.Creador;
import ejemplo2.modelo.CreadorConcreto;

public class FabricaDeObjetosSimple {

    public static void main(String[] args) {

        try {
            Creador creador = new CreadorConcreto();
            creador.anOperation("Mensaje en memoria.", "Memoria");
            creador.anOperation("Mensaje en archivo.", "Archivo");
            creador.anOperation("Mensaje en base de datos.", "Base de datos");
            //creador.anOperation("Mensaje en default", " ");
            //creador.anOperation("", "Memoria");
            //creador.anOperation(null, "Memoria");
        }catch (RuntimeException e){
            System.out.println(""+e.getMessage());
        }

    }
}
