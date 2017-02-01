/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.abarnetches.t1;

import java.util.Scanner;

/**
 *
 * @author albertobarnetche
 */
public class SPPABarnetcheST1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here// Calculadora de promedio
        double c1, c2, c3, c4, c5, promedio;
        int matricula;
        Scanner entradaDato = new Scanner(System.in);
        System.out.println("Ingresa la calificaicon 1:");
        c1 = entradaDato.nextDouble();
        System.out.println("Ingresa la calificacion 2:");
        c2 = entradaDato.nextDouble();
        System.out.println("Ingresa la calificacion 3:");
        c3 = entradaDato.nextDouble();
        System.out.println("Ingresa la calificacion 4:");
        c4 = entradaDato.nextDouble();
        System.out.println("Ingresa la calificacion 5:");
        c5 = entradaDato.nextDouble();
        System.out.println("Ingresa tu matricula sin A0:");
        matricula = entradaDato.nextInt();
        promedio = (c1 + c2 + c3 + c4 + c5)/(5);
        if (promedio >= 70){
            System.out.println("APROBADO");
        } else {
            System.out.println("REPROBDAO");
        }
        System.out.println("MATRICULA: A0" + matricula);
        System.out.println("PROMEDIO: " + promedio);
    }
    
    
}
