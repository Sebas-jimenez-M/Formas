
package Clases;


public class Cuadrado extends Rectangulo{

    public Cuadrado(double lado) {
        super(lado,lado);
    }

    @Override
    public double area() {
        return Math.pow(this.base, 2); 
    }

    @Override
    public double perimetro() {
        return this.altura*4;
    }
    
    
    
}
