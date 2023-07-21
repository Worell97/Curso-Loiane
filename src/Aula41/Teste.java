/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula41;

/**
 *
 * @author worel
 */
public class Teste {
    public static void main(String[] args){
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        
        aluno.setEndereco("rua 2 n° 2");
        professor.setEndereco("rua 3 n° 3");
        
        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
                
                
        
    }
}
