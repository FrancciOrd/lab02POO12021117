/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examenpregunta2;

import java.util.Scanner;

/**
 *
 * @author FRANCHESKA
 */
public class ExamenPregunta2 {

     public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserte el valor de N: ");
            int N = sc.nextInt();
            
            if (N%2 == 1){
                System.out.println("Luna");
            }
            else if (N%2 == 0 && N >= 2 && N <= 5){
                System.out.println("Sol");
            }
            else if (N%2 == 0 && N >= 6 && N <= 20){
                System.out.println("Tierra");
            }
            else if (N%2 == 0 && N > 20){
                System.out.println("Galaxia");
            }
        }
        }
        
    
