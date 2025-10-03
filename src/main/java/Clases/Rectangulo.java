
package Clases;

public class Rectangulo {
    double base,altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    public double perimetro(){
        return (base*2)+(altura*2);
    }
    
    public double area(){
        return base*altura;
    }
}
