/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicios.Aulas_44_46;

/**
 *
 * @author worel
 */
public class Teste {
    public static void main(String[] args) {
        FiguraGeometrica[] figuras = new FiguraGeometrica[6];
        Quadrado quadrado1 = new Quadrado();
        quadrado1.setAltura(10);
        quadrado1.setComprimento(10);
        quadrado1.nome = "quadrado";
        quadrado1.cor = "vermelho";
        
        Triangulo triangulo = new Triangulo();
        triangulo.setAltura(10);
        triangulo.setBase(10);
        quadrado1.nome = "triangulo";
        quadrado1.cor = "vermelho";
        
        Circulo circulo = new Circulo();
        circulo.setRaio(2);
        quadrado1.nome = "quadrado";
        quadrado1.cor = "vermelho";
        
        Cubo cubo = new Cubo();
        cubo.setAltura(10);
        cubo.setComprimento(10);
        cubo.setProfundidade(10);
        quadrado1.nome = "quadrado";
        quadrado1.cor = "vermelho";
        
        Piramide piramide = new Piramide();
        piramide.setAltura(5);
        piramide.setAreaBase(20);
        quadrado1.nome = "quadrado";
        quadrado1.cor = "vermelho";
        
        Cilindro cilindro = new Cilindro();
        cilindro.setAltura(9);
        cilindro.setRaio(3);
        quadrado1.nome = "quadrado";
        quadrado1.cor = "vermelho";
        
        
        figuras[0] = quadrado1;
        figuras[1] = triangulo;
        figuras[2] = circulo;
        figuras[3] = cubo;
        figuras[4] = piramide;
        figuras[5] = cilindro;
        
        String resultado = "";
        for (FiguraGeometrica figura : figuras) {
            if(figura instanceof Figura2D){
                resultado = "Area da figura bidimensional é " + ((Figura2D) figura).calcularArea();
            }
            if(figura instanceof Figura3D){
                resultado = "O volume da figura bidimensional é " + ((Figura3D) figura).calcularVolume()+"cm²";
            }
            System.out.println(resultado);
        }
    }
    
}
