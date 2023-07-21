/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula17;

/**
 *
 * @author worel
 */
public class Aula17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("i tem valor: " + i);            
        }
        for (int i = 5; i > 0; i--) {
            System.out.println("i tem valor: " + i);
        }
        
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("i = "+i+"; j = "+j);
        }
    }
    
}
