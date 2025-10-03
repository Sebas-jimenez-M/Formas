
package Clases;


public class Triangulo {
    double lado1,lado2,base,altura;

    public Triangulo(double lado1, double lado2,  double base, double altura) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
        this.altura = altura;
    }

    public double area(){
    return base*altura/2;
    }
    
    public double perimetro(){
    return base+lado1+lado2;
    }
    
    
    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }


    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }
    
    
   
}
