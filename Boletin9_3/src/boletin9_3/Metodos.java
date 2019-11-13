/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_3;

import java.util.Scanner;

/**
 *
 * @author jalvarezbretana
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);
    private float a;
    private float b;
    private float area;

    public void pedirDatos() {
        do {
            System.out.println("Dame a base");
            b = sc.nextFloat();
        } while (b < 0);

        do {
            System.out.println("Dame a altura");
            a = sc.nextFloat();
        } while (a < 0);

    }

    public void verDatos() {
        pedirDatos();
        area = a * b;
        System.out.println("El área es " + area);
    }

}
