package ejercicio_2;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        //pelicula
        Pelicula pelicula = new Pelicula("Wonder Woman", 140, 16, "Patty Jenkins");
        System.out.println(pelicula.toString());
        
        //funcion
        Funcion funcion = new Funcion();
        funcion.setPrecio(300);
        funcion.enumerarSala();
        funcion.verSala();

        //espectadores
        String siguiente = "si";
        String codigoAsiento;
        int cantidadEspectadores = 0;
        boolean ocupado;

        while ("si".equals(siguiente) && 72 > cantidadEspectadores) {

            //lleno el espectador
            Espectador espectador = new Espectador();
            espectador.llenarEspectador();

            //corroboro los datos (que sea mayor y tenga dinero)
            if (funcion.corroborarDatos(espectador, pelicula)) {

                //asigno butaca aleatoria
                 Asiento asiento = new Asiento();
                
                do {

                    codigoAsiento = asiento.asientoAleatorio();

                    System.out.println(codigoAsiento);

                    ocupado = funcion.estaOcupado(codigoAsiento);

                } while (ocupado);

                espectador.setCodigoAsiento(codigoAsiento);
                asiento.setEspectador(espectador);

                //seteo ocupada
                funcion.ocuparAsiento(espectador.getCodigoAsiento());

            }

            cantidadEspectadores = cantidadEspectadores + 1;

            System.out.println("Desea añadir otro espectador?");
            siguiente = scan.next();

        }

        funcion.verSala();

        System.out.println("");

        funcion.verEspectadores();

    }

}
