/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

/**
 *
 * @author Joaco
 */
public class Asiento {

    private String codigo;
    private boolean ocupado;
    private Espectador espectador;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public Asiento(String codigo, boolean ocupado, Espectador espectador) {
        this.codigo = codigo;
        this.ocupado = ocupado;
        this.espectador = espectador;
    }

    public Asiento() {
    }

    public String asientoAleatorio() {

        char letraRandom;
        String letraCadena;
        int numeroRandom;   

        //creo el objeto asiento
        Asiento asiento1 = new Asiento();

        //hallo el codigo
        letraRandom = (char) (int) Math.floor((Math.random()*8)+66);
        
        letraCadena = Character.toString(letraRandom);
        numeroRandom = (int) Math.floor((Math.random()*8)+1);
        
        codigo = numeroRandom + letraCadena;

        //seteo butaca como ocupada
        ocupado = true;
        return codigo;

    }

}
