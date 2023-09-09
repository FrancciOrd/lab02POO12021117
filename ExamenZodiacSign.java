/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenzodiacsign;

import java.util.Scanner;

/**
 *
 * @author FRANCHESKA
 */
public class ExamenZodiacSign {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserte el año de su nacimiento: ");
            int año = sc.nextInt();
            int zodiaco = año%12;
            switch (zodiaco){
                case 0 -> System.out.println(año + " es el año del Monkey");
                case 1 -> System.out.println(año + " es el año del gallo");
                case 2 -> System.out.println(año + " es el año del Perro");
                case 3 -> System.out.println(año + " es el año del cerdo");
                case 5 -> System.out.println(año + " es el año de la rata");
                case 6 -> System.out.println(año + " es el año del buey");
                case 7 -> System.out.println(año + " es el año del tigre");
                case 8 -> System.out.println(año + " es el año del conejo");
                case 9 -> System.out.println(año + " es el año del dragón");
                case 10 -> System.out.println(año + " es el año de la serpiente");
                case 11 -> System.out.println(año + " es el año del cabello");
            }
        }
            
}
