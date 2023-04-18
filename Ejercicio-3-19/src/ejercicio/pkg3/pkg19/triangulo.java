/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3.pkg19;

/**
 *
 * 
 */
public class triangulo {
    protected double lado_triangulo;
    protected double area;
    protected double perimetro;
    protected double altura;
    
public triangulo(double lado_triangulo){
        this.lado_triangulo = lado_triangulo;
}
public void calcular_triangulo(){
        this.perimetro = this.lado_triangulo * 3;
        this.altura = Math.sqrt((this.lado_triangulo * this.lado_triangulo) - (this.lado_triangulo/2 * this.lado_triangulo/2));
        this.area = ((this.lado_triangulo * this.altura ) /2);
}
}
