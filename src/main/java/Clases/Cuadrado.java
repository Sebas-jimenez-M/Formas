
package Clases;

import java.awt.Color;


public class Cuadrado extends Rectangulo{

    public Cuadrado(double base, double altura, Color color) {
        super(base, altura, color);
    }

    

   /* @Override
    public double area() {
        return Math.pow(this.base, 2); 
    }

    @Override
    public double perimetro() {
        return this.altura*4;
    }*/
    
    @Override
    public double calcularArea() {
        return Math.pow(this.base, 2); 
    }
    @Override
    public double perimetro() {
        return this.altura*4;
    }
    
    
    
}
