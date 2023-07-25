/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula49;

/**
 *
 * @author worel
 */
public class Finally {
    public static void main(String[] args) {
        int[] numeros = {4, 8, 16 ,32, 64, 128};
        int[] denom = {2, 0, 4, 8, 0};
        
        
        for (int i = 0; i < numeros.length; i++) {
            try {
                System.out.println(numeros[i]+"/"+denom[i]+" = "+(numeros[i]/denom[i]));                       
            } catch (ArithmeticException e) {
                System.out.println("Erro ao dividir por 0");
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Erro ao acessar um indice inexistente do vetor");
            }finally{
                System.out.println("Sempre vai ser executado, fechar arquivos ou fechar conexões com banco de dados");
            }
        }
        
    }
    
}
