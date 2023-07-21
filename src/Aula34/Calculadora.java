/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula34;

/**
 *
 * @author worel
 */
public class Calculadora {
    public static int soma(int num1, int num2){
        return num1 + num2;
    };

    public static  int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    };

    public static  int soma(int[] vetorInteiros){
        int total = 0 ;

        for (int i =0; i < vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }

        return total;
    };  
    
    public static int fatorial(int num1){
        if (num1 == 0){
            return 1;
        };
        
        return num1 * fatorial(num1 -1);
    };
}
