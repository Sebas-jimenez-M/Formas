
package Clases;


public class Escaleno  extends Triangulo{

    public Escaleno(double lado1, double lado2, double base, double altura) {
        super(lado1, lado2, base, altura);
    }

    @Override
    public double perimetro() {
        return this.base+this.lado1+this.lado2; 
    }

    @Override
    public double area() {
        return this.base*this.altura/2; 
    }
    
    
    
}
