/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_2;

/**
 *
 * @author jalvarezbretana
 */
public class Metodos {

    private int cont = 10;
    private int suma;
    private double prod = 1;

    public void verDatos() {
        while (cont <= 90) {
            suma = cont + suma;
            prod = cont * prod;
            cont++;
        }

        System.out.println("La suma de los numeros comprendidos entre 10 y 90 es " + suma);
        System.out.println("El producto de los numeros comprendidos entre 10 y 90 es " + prod);
    }

}
