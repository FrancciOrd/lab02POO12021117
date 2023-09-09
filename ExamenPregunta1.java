/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenpregunta1;

import java.util.Scanner;

/**
 *
 * @author FRANCHESKA
 */
public class ExamenPregunta1 {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número a evaluar: ");
        
        try{
             long n = sc.nextLong();
             System.out.println(n + " puede ser almacenado en:");
        if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
            System.out.println("(*) byte");
        }
        if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
            System.out.println("(*) short");
        }
        if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
            System.out.println("(*) int");
        }
        if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
            System.out.println("(*) long");
        }}
        catch(Exception e)
                { 
                    System.out.println(sc.next()+"no puede ser almacenado en ningún lado");
                }
    }
}