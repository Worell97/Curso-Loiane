/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios.Aulas_44_46;

/**
 *
 * @author worel
 */
public class Cilindro extends Figura3D {   

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    private double raio;
    private double altura;
    
    @Override
    public double calcularVolume() {
        return (3.14 * (raio * raio)) * altura;
    }
}
