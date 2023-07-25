/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula50;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author worel
 */
public class Throws {
    public static void main(String[] args) {
        System.out.println("informe um decimal");
        try {
            double num = leNumero();
            System.out.println("você informou o numero"+num);
        } catch (Exception ex) { 
            System.out.println("Entrada invalida");
            ex.printStackTrace();
        }
    }
    
    public static double leNumero() throws Exception{
        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;
    }
    
}
