/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula42;

/**
 *
 * @author worel
 */
public class Teste {
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor professor = new Professor();
        
        aluno.setCurso("rua 2 n° 2");
        professor.setNomeCurso("rua 3 n° 3");
        
        aluno.imprimirEtiquetaEndereco();
        professor.imprimirEtiquetaEndereco();
        //Constantes.URL_BLOG = "teste";
        Constantes.CURSO_COMPLETO = "teste";
        System.out.println(Constantes.URL_BLOG);
        
    }
}
