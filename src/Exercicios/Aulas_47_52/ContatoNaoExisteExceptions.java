/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios.Aulas_47_52;

/**
 *
 * @author worel
 */
public class ContatoNaoExisteExceptions extends Exception{
    private String nome;
    
    public ContatoNaoExisteExceptions(String nomeContato){
        this.nome = nomeContato;
    }

    @Override
    public String getMessage() {
        return "contato "+ this.nome + " não existe na agenda!";
    }   
}
