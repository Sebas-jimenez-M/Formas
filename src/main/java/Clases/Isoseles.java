/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

/**
 *
 * @author sebai
 */
public class Isoseles extends Triangulo{

    public Isoseles( double ladosiguales, double base, double altura) {
        super(ladosiguales, ladosiguales, base, altura);
    }

    @Override
    public double perimetro() {
        return (this.lado1*2*this.base); 
    }

    @Override
    public double area() {
        return (this.base*this.altura)/2; 
    }
    
}
