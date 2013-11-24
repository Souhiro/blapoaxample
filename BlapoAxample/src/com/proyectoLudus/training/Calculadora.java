/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyectoLudus.training;

/**
 *
 * @author Souhiro
 */
public class Calculadora {
    private float valor;
    
    public Calculadora() {
        this.valor = 0;
    }
    
    public void absoluto() {
        if (this.valor < 0)
            this.valor = -1*this.valor;
    }
    
    public void suma(float num) {
        this.valor = this.valor + num;
    }
    
    public void resta(float num) {
        this.valor = this.valor - num;
    }
    
    public void multiplicacion(float num) {
        this.valor = this.valor * num;
    }
    
    public void division(float num) {
        this.valor = this.valor / num;
    }
    
    public float devuelveValor() {
        return this.valor;
    }
}
