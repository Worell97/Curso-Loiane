/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula33;

/**
 *
 * @author worel
 */
public class TesteCalculadora {
    public static void main (String[] args){
        int[] array = {1, 3, 23, 45, 111};
        MinhaCalculadora calc = new MinhaCalculadora();
        System.out.println(calc.soma(1,2)); 
        System.out.println(calc.soma(1,2, 4));
        System.out.println(calc.soma(array));       
    };
};
