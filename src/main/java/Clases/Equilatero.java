
package Clases;

import java.awt.Color;

public class Equilatero extends Triangulo{

    public Equilatero(double base, double altura, Color color) {
        super(base, base, base, altura, color);
    }

    

   @Override
    public double calcularArea() {
        return base*altura/2;
    }

    @Override
    public double perimetro() {
        return base+base+base;
    }
    
    
    
    
}
