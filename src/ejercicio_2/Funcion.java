/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import java.util.ArrayList;

/**
 *
 * @author Joaco
 */
public class Funcion {

    private Pelicula pelicula;
    private double precio;
    private ArrayList<Espectador> espectadores;
    private Asiento[][] asientos;

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public Asiento[][] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[][] asientos) {
        this.asientos = asientos;
    }

    public Asiento[][] getAsiento() {
        return asientos;
    }

    public void setAsiento(Asiento[][] asiento) {
        this.asientos = asiento;
    }

    public Funcion(Pelicula pelicula, double precio, ArrayList<Espectador> espectadores, Asiento[][] asientos) {
        this.pelicula = pelicula;
        this.precio = precio;
        this.espectadores = espectadores;
        this.asientos = asientos;
    }

    public Funcion() {

        espectadores = new ArrayList();

    }

    //lleno la matriz Asientos con objetos asientos.
    public void enumerarSala() {

        char letra;
        String letraCadena;
        int contadorLetra = 65;
        int contadorNum = 8;
        String codigo;

        asientos = new Asiento[8][9];

        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 9; j++) {

                //creo el objeto asiento
                Asiento asiento1 = new Asiento();

                //hallo el codigo
                letra = (char) contadorLetra;
                letraCadena = Character.toString(letra);
                codigo = contadorNum + letraCadena;

                //seteo el codigo
                asiento1.setCodigo(codigo);
                asiento1.setOcupado(false);

                //le paso el asiento a la matriz asientos
                asientos[i][j] = asiento1;
                contadorLetra = contadorLetra + 1;
            }

            contadorLetra = 65;
            contadorNum = contadorNum - 1;
        }
    }

    //imprimir el mapa de las sala
    public void verSala() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {
                if (asientos[i][j].isOcupado()) {
                    System.out.print("[ -- ]");
                } else {
                    System.out.print("[ " + asientos[i][j].getCodigo() + " ]");
                }
            }
            System.out.println("");
        }
    }

    //corroborar datos
    public boolean corroborarDatos(Espectador espectador, Pelicula pelicula) {

        if (espectador.getEdad() < pelicula.getEdadMinima()) {
            System.out.println("Usted no tiene la edad necesaria para ver la pelicula.");
            return false;
        } else if (espectador.getDinero() < precio) {
            System.out.println("Usted no tiene el dinero necesario para ver la pelicula.");
            return false;
        } else {

            espectadores.add(espectador);
            
            
            return true;
        }

    }

    public void verEspectadores() {

        for (Espectador espectador : espectadores) {
            System.out.println(espectador.toString());
        }

    }

    public void ocuparAsiento(String codigo) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {

                if (asientos[i][j].getCodigo().equals(codigo)) {

                    asientos[i][j].setOcupado(true);

                }

            }

        }
    }

    public boolean estaOcupado(String codigo) {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 9; j++) {

                if (asientos[i][j].isOcupado() && codigo.equals(asientos[i][j].getCodigo())) {

                    return true;

                }

            }

        }

        return false;

    }

}
