/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Color;

/**
 *
 * @author sebai
 */
public class Isoseles extends Triangulo{

    public Isoseles(double ladosiguales, double base, double altura, Color color) {
        super(ladosiguales, ladosiguales, base, altura, color);
    }

  

    @Override
    public double perimetro() {
        return (this.lado1*2*this.base); 
    }

    @Override
    public double calcularArea() {
        return (this.base*this.altura)/2; 
    }
    
}
