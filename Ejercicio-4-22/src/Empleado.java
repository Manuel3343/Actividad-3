/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Empleado {
    protected String nombre;
    protected double salario;
    protected double horas;
    protected double sal;
public Empleado (String nombre, double salario, double horas){
    this.nombre = nombre;
    this.salario = salario;
    this.horas = horas;
    this.sal = this.horas * this.salario;
}
public String calcular_salario(){
    
    if (sal > 450000) {
        return (nombre + " " + sal);
                }
       
        else {
            return (nombre);
                    }
}
       
}

