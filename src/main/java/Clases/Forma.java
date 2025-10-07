package Clases;

import java.awt.Color;

public abstract class Forma {
    public Color color;

    public Forma(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
    public abstract double calcularArea();
    public abstract double perimetro();
}
