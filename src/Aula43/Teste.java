/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula43;


/**
 *
 * @author worel
 */
public class Teste {
    public static void main(String[] args){
        Aluno aluno = new Aluno();
        aluno.setCurso("Ciencia da computação");
        double[] notas = {10, 9, 8,7};
        aluno.setNotas(notas);
        
        Aluno aluno2 = new Aluno();
        aluno2.setCurso("Ciencia da computação");
        double[] notas2 = {6, 1, 3,7};
        aluno2.setNotas(notas2);
        
        System.out.println(aluno.toString());
        
        String s1 = "asdasdas";
        String s2 = "asdasdaS";
        
        System.out.println(aluno.equals(aluno2));
    }
}
