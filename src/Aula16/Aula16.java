/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Aula16;

/**
 *
 * @author worel
 */
public class Aula16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 1;
        int max = 10;
        
        System.out.println("Contando até 10");
        
        while(i <= max){
            System.out.println(i);
            i++;
        }
        
        do{
            i++;
            System.out.println(i);
        }while(i < 15);
    }
    
}
