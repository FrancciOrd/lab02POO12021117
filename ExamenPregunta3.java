/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenpregunta3;

import java.util.Scanner;

/**
 *
 * @author FRANCHESKA
 */
public class ExamenPregunta3 {

    public static void main(String[] args) {
        double actualSalario;
        double calificacion;
        double aumento = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese el salario actual: ");
        actualSalario = sc.nextDouble();
        
        System.out.println("Ingrese la calificación de desempeño: ");
        calificacion = sc.nextDouble();
        
        if (calificacion == 1){
            aumento = 0.06*actualSalario;
        }else if (calificacion == 2){
            aumento = 0.04*actualSalario;
        }else if (calificacion == 3){
            aumento = 0.015*actualSalario;
        }
        double nuevoSalario = aumento + actualSalario;
        System.out.println("Tu aumento de salario es: $" + aumento);
        System.out.println("Tu nuevo salario es: $" + nuevoSalario);
    }
}
