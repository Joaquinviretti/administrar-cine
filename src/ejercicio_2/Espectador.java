/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author Joaco
 */
public class Espectador {

    private String nombre;
    private int edad;
    private double dinero;
    private String codigoAsiento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public String getCodigoAsiento() {
        return codigoAsiento;
    }

    public void setCodigoAsiento(String codigoAsiento) {
        this.codigoAsiento = codigoAsiento;
    }

    public Espectador(String nombre, int edad, double dinero, String codigoAsiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
        this.codigoAsiento = codigoAsiento;
    }

    public Espectador() {
    }

    public void llenarEspectador() {

        Scanner scan = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese nombre: ");
        nombre = scan.next();

        System.out.println("Ingrese edad: ");
        edad = scan.nextInt();

        System.out.println("Ingrese dinero disponible: ");
        dinero = scan.nextDouble();

        codigoAsiento = null;
    }
    
    @Override
    public String toString()    {
        return "Nombre: " + nombre + " { edad: " + edad + ", dinero: " + dinero + ", butaca: " + codigoAsiento + " }";
    }

}
