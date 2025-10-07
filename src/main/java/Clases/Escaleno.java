
package Clases;

import java.awt.Color;


public class Escaleno  extends Triangulo{

    public Escaleno(double lado1, double lado2, double base, double altura, Color color) {
        super(lado1, lado2, base, altura, color);
    }

   

    @Override
    public double calcularArea() {
        return base*altura/2;
    }

    @Override
    public double perimetro() {
        return base+lado1+lado2;
    }
    
    
    
}
