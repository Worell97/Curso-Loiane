/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula26;

/**
 *
 * @author worel
 */
public class TesteCarro {
    public static void main(String[] args){
        Carro van = new Carro();
        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.tipoCombustivel = "gasolina";
        van.capCombustivel = 100;
        van.consumoPorKm = 10;
        
        van.exibirAutonomia();
        System.out.println("Autonomia do carro é : "+van.obterAutonomia());
        System.out.println("Para viajar 250km você precisa de "+van.calcularCombustivelNecessario(250)+" litros de "+van.tipoCombustivel);
    }
}
