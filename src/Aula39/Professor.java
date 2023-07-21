/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula39;

import Aula37.*;

/**
 *
 * @author worel
 */
public class Professor extends Pessoa {
    private double salario;
    private String nomeCurso;
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String curso) {
        this.nomeCurso = curso;
    }
    
    public double calcularSalarioLiquido(){
        return 0;
    }
    
}
