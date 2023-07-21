package Aula29;

import Aula26.*;

public class Carro {
    
    String marca;
    String modelo;
    String tipoCombustivel;
    int numPassageiros;
    double capCombustivel;
    double consumoPorKm;  
    
    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoPorKm_){
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoPorKm = consumoPorKm_;
        System.out.println("Classe Carro foi instanciada");
    }
    Carro(){
        
    }

    public Carro(String marca, String modelo, String tipoCombustivel, int numPassageiros, double capCombustivel, double consumoPorKm) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoPorKm = consumoPorKm;
    }
    
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é:" + obterAutonomia());
    }
    
    double obterAutonomia(){
        System.out.println("Você solicitou a autonomia");
        return consumoPorKm * capCombustivel;
    }
    
    double calcularCombustivelNecessario(double distanciaEmKM){
        
        return distanciaEmKM/consumoPorKm;
    }
}
