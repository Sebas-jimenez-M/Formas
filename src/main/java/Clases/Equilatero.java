
package Clases;

public class Equilatero extends Triangulo{

    public Equilatero(double lado1, double lado2, double base, double altura) {
        super(lado1, lado2, base, altura);
    }

    @Override
    public double area() {
        return (this.base*this.altura)/2; 
    }

    @Override
    public double perimetro() {
        return this.lado1*3;
    }
    
    
    
    
}
