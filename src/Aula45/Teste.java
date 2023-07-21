/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula45;

import Aula40.*;
import Aula39.*;

/**
 *
 * @author worel
 */
public class Teste {
    public static void main(String[] args){
//        Aluno aluno = new Aluno();
//        Pessoa pessoa = aluno;
//        Aluno aluno2 = (Aluno) pessoa;
//        
//        Pessoa aluno3= (Pessoa) new Aluno();   
//        Pessoa aluno4 = new Pessoa();
//        Aluno aluno5 = (Aluno) aluno3;  
        
        Pessoa pessoa = new Pessoa();
        Aluno aluno = new Aluno();
        Professor prof = new Professor();
        
        if(pessoa instanceof Pessoa){            
            System.out.println("E do tipo Pessoa");
        }
        if(aluno instanceof Aluno){            
            System.out.println("E do tipo Aluno");
        }
        if(prof instanceof Professor){            
            System.out.println("E do tipo Professor");
        }
        
        
        
    }
}
