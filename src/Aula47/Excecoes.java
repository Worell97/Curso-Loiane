/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula47;

/**
 *
 * @author worel
 */
public class Excecoes {
    public static void main(String[] args) {
        try {
            int[] vetor = new int[4];
            System.out.println("Antes do exception");
            vetor[5] = 10;
            System.out.println("Não chegara aqui");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exceção ao acessar um indice do vetor inexistente");
        }
        System.out.println("programa continua executando normalmeente");        
    }
}
