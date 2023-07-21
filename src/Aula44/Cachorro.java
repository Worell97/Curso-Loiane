/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Aula44;

/**
 *
 * @author worel
 */
public class Cachorro extends Mamifero implements AnimalDomesticado, AnimalDeEstimacao{

    @Override
    public void Alimentar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void brincar() {
        
    }

    @Override
    public void levarVeterinario() {
        
    }

    @Override
    public void levarPassear() {
        
    }

    @Override
    public void amamentar() {
        
    }

    @Override
    public void emitirSom() {
        
    }
    private int tamanho;
    private String raca;    

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
