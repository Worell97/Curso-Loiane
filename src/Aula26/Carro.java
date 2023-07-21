package Aula26;

public class Carro {
    
    String marca;
    String modelo;
    String tipoCombustivel;
    int numPassageiros;
    double capCombustivel;
    double consumoPorKm;  
    
    
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
