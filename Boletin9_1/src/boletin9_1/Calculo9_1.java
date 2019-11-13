/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9_1;

import java.util.Scanner;

/**
 *
 * @author jalvarezbretana
 */
public class Calculo9_1 {

    Scanner sc = new Scanner(System.in);
    private int num;
    private int ctd_posicion;
    private int ctd_positivo;
    private int ctd_negativo;
    private int ctd_cero;

    public void calculo() {

        while (ctd_posicion < 10) {
            System.out.println("Dame números");
            num = sc.nextInt();
            if (num > 0) {
                ctd_positivo++;
            } else if (num < 0) {
                ctd_negativo++;
            } else {
                ctd_cero++;
            }
            ctd_posicion++;
        }
        System.out.println("Los positivos son "+ctd_positivo);
        System.out.println("Los negativos son "+ctd_negativo);
        System.out.println("Los ceros son "+ctd_cero);
    }
}
