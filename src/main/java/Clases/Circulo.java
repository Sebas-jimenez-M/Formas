/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Color;

/**
 *
 * @author sebai
 */
public class Circulo extends Forma{
    double diametro;

    public Circulo(double diametro, Color color) {
        super(color);
        this.diametro = diametro;
    }

   

    public double getDiametro() {
        return diametro;
    }
    
   /* public double area(){
     return Math.pow((diametro/2),2)*Math.PI;
    }*/
    
    /*public double perimetro(){
    return diametro*Math.PI;
    }
*/
    @Override
    public double calcularArea() {
        return Math.pow((diametro/2),2)*Math.PI;
    }
    @Override
    public double perimetro() {
        return diametro*Math.PI;
    }
    
    
    
   
    
}
