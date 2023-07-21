/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula40;

import Aula39.*;

/**
 *
 * @author worel
 */
public class Teste {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();
        
        pessoa.setEndereco("Rua 1 n° 1 bairro teste");
        aluno.setEndereco("rua 2 n° 2");
        professor.setEndereco("rua 3 n° 3");
        
        System.out.println(pessoa.obterEtiquetaEndereco());
        System.out.println(aluno.obterEtiquetaEndereco());
        System.out.println(professor.obterEtiquetaEndereco());
                
                
        
    }
}
