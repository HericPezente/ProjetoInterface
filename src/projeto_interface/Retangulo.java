/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_interface;

/**
 *
 * @author i03
 */
public class Retangulo implements AreaCalculavel {

    private int largura;

    private int altura;

    public Retangulo(int largura, int altura) {
        this.largura = largura;

        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return this.largura * this.altura;
    }

}
