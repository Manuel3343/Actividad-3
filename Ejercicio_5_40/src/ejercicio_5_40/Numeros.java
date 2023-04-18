/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_5_40;

public class Numeros {
    protected double A;
    protected double B;
    protected double raiza;
    protected double raizb;
    protected double cuadradoa;
    protected double cuadradob;
    protected double cuboa;
    protected double cubob;
  

public Numeros(double A, double B){
    this.A = A;
    this.B = B;
   
    
}
public void calcular_numero(){
    raiza = Math.sqrt(this.A);
    raizb = Math.sqrt(this.B);
    cuadradoa = (this.A * this.A);
    cuadradob = (this.B * this.B);
    cuboa = (this.A * this.A * this.A);
    cubob = (this.B * this.B * this.B);
            
}


    
}

