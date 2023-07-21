/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula36;

/**
 *
 * @author worel
 */
public class Teste {
    public static void main(String[] args){
        
        Endereco endereco = new Endereco();
        endereco.setNomeRua("teste");
        endereco.setNumero("n/a");
        endereco.setComplemento("Bloco C");
        endereco.setCidade("Kings Landing");
        endereco.setEstado("Westeros");
        endereco.setCep("999999999");
        
        Contato contato = new Contato();
        contato.setNome("Tyrion");
        contato.setEndereco(endereco);
        
        Telefone telefone = new Telefone();
        telefone.setDdd("011");
        telefone.setTipo("Celular");
        telefone.setNumero("99999-9999");
        
        Telefone telefone2 = new Telefone();
        telefone2.setDdd("012");
        telefone2.setTipo("Fixo");
        telefone2.setNumero("88888-8888");
        
        Telefone[] telefones = {telefone, telefone2};
        contato.setTelefone(telefones);
        
        System.out.println(contato.getNome());
        if(contato != null && contato.getEndereco() != null){
            System.out.println(contato.getEndereco().getCidade());
        }

        if(contato != null && contato.getTelefone() != null){
            for(Telefone t : contato.getTelefone()){
                System.out.println(t.getNumero());
            }
        }
        
    }
    
}
