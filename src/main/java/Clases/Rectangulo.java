
package Clases;

import java.awt.Color;

public class Rectangulo extends Forma{
    double base,altura;

    public Rectangulo(double base, double altura, Color color) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

   

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    /*public double perimetro(){
        return (base*2)+(altura*2);
    }
    
    public double area(){
        return base*altura;
    }*/

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double perimetro() {
        return (base*2)+(altura*2);
    }
}
