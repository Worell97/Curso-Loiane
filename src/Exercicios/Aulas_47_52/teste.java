/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios.Aulas_47_52;

import java.util.Scanner;

/**
 *
 * @author worel
 */
public class teste {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        Agenda agenda = new Agenda();
        while(opcao != 3){            
            opcao = obterOpcaoMenu(scan);

            if(opcao == 1){
                consultarContato(scan, agenda);
            }else if(opcao ==2){
                adicionarContato(scan, agenda);
            }else{
                System.exit(0);
            }
        }
    }
    
    public static int obterOpcaoMenu(Scanner scan){
        boolean entradaValida = false;
        int opcao = 3;
        while (!entradaValida){            
            System.out.println("Digite a oção desejada:");
            System.out.println("1 - Consultar contato");
            System.out.println("2 - Adicionar contato");
            System.out.println("3 - Sair");
            try {
                opcao = Integer.parseInt(scan.nextLine());
                if (opcao == 1 || opcao == 2 || opcao == 3){
                    entradaValida = true;                   
                }else{
                    throw new Exception("Opção inválida"); 
                }
            } catch (Exception e) {
                System.out.println("Entrada invalida, digite novamente\n");
                
            }
        };
        return opcao;
        
    }
    
    public static String leInfo(Scanner scan, String msg){
        System.out.println(msg);
        return scan.nextLine();       
    }
    
    public static void consultarContato(Scanner scan, Agenda agenda){
        String nomeContato = leInfo(scan, "Informe o nome do contato a ser pesqusiado");
        try {             
            if(agenda.consultarContatoPorNome(nomeContato) >= 0){
                System.out.println("Contato existe");
            }   
        } catch (ContatoNaoExisteExceptions e) {
            System.out.println(e.getMessage());
        }        
    }
    
    public static void adicionarContato(Scanner scan, Agenda agenda){   
        try {          
            System.out.println("Criando um contato \n");
            String nomeContato = leInfo(scan, "Informe o nome:");
            String telefoneContato = leInfo(scan, "Informe o telefone:");
            String emailContato = leInfo(scan, "Informe o email:");
            Contato contato = new Contato();
            contato.setEmail(emailContato);
            contato.setNome(nomeContato);
            contato.setTelefone(telefoneContato);

            System.out.println("Contato criado com sucesso");
            System.out.println(contato);
            agenda.adicionarContato(contato); 
        } catch (AgendaCheiaException e) {
            System.out.println(e.getMessage());
            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }
    }
}
