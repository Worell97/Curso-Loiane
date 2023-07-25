/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios.Aulas_47_52;

/**
 *
 * @author worel
 */
public class Contato {
    private static int contador = 0;
    private String nome;
    private String telefone;
    private String email;
    private int id;   
    
    public Contato(){
        contador++;
        id = contador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    } 

    @Override
    public String toString() {
        String s = "[";
        s += "\n  id: "+ id;
        s += "\n  Nome: "+ nome;
        s += "\n  Telefone: "+telefone;
        s += "\n  Email: "+ email;
        return s+="\n]";
    }
}
