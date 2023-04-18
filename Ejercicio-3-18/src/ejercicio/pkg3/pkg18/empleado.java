/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.pkg3.pkg18;

/**
 *
 * 
 */
public class empleado {
    
    protected int codigo_empleado;
    protected String nombres;
    protected int horas_trabajadas;
    protected double salario_hora;
    protected double retencion_fuente = 0.125;
    protected double salario_bruto;
    protected double salario_neto;
    
    public empleado(int codigo_empleado, String nombres, int horas_trabajadas, double salario_hora){
        this.codigo_empleado = codigo_empleado;
        this.nombres = nombres;
        this.horas_trabajadas = horas_trabajadas;
        this.salario_hora = salario_hora;
    }

    
public void calcular_salario(){
    this.salario_bruto = this.salario_hora * this.horas_trabajadas;
    this.salario_neto = this.salario_bruto - (this.salario_bruto * this.retencion_fuente);
    }
    
    
}
