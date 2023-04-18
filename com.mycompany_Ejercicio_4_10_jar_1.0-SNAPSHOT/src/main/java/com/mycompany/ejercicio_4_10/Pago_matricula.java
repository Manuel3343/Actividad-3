/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4_10;

public class Pago_matricula {
    protected double numero_inscripcion;
    protected String nombres;
    protected double patrimonio;
    protected int estrato;
    protected double pago_matricula;
  
public Pago_matricula (double numero_inscripcion, String nombres, double patrimonio, int estrato){
        this.numero_inscripcion = numero_inscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estrato = estrato;
        this.pago_matricula = 50000;
}
public void calcular_matricula(){
    if (this.estrato > 3 && this.patrimonio > 2000000) {
        this.pago_matricula = this.pago_matricula + this.patrimonio * 0.03;
    }
    }

}
