/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula40;

import Aula39.*;
import Aula37.*;

/**
 *
 * @author worel
 */
public class Aluno extends Pessoa {
    private String curso;
    private double[] notas;

    public Aluno(){
        this.nomeVisivel = "sdasdsda";
    }
    
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
    
    public double calcularMedia(){
        return 0;
    }
    
    public boolean verificarAprovado(){
        return true;
    }
    
    public String obterEtiquetaEndereco(){
        String s = "Endereço do aluno: ";
        s += this.getEndereco();
        
        return s;
    }
}
