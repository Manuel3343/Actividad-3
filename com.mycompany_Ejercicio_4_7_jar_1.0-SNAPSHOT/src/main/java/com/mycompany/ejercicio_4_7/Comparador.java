/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio_4_7;


public class Comparador {
    protected double A;
    protected double B;
    
    public Comparador (double A, double B){
   
        this.A = A;
        this.B = B;
    }
    public String mayor(){
    if (A > B) {
        return "A es mayor que B";
                }
        else if (A==B) {
        return "A es igual que B";
                }
        else {
            return "A es menor que B";
                    }
               
                
    }
    
    }

