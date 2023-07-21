package Aula31;


class Carro {
    
    String marca;
    String modelo;
    String tipoCombustivel;
    int numPassageiros;
    double capCombustivel;
    double consumoPorKm;  

    public Carro(String marca, String modelo, String tipoCombustivel, int numPassageiros, double capCombustivel, double consumoPorKm) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.numPassageiros = numPassageiros;
        this.capCombustivel = capCombustivel;
        this.consumoPorKm = consumoPorKm;
    }

    public Carro() {
    }

    public Carro(String marca, String modelo) {
        this(marca, modelo, 10);
    }

    public Carro(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
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
