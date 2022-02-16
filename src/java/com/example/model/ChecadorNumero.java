/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

/**
 *
 * @author eber
 */
public class ChecadorNumero {
    private int respuesta;
    private int numero = (int) (Math.random() * 100);
    private String resultado = "";

    public ChecadorNumero(int respuesta) {
        this.setRespuesta(respuesta);
    }
    
    public String Evaluar(int respuesta, int numero){
        if(numero > respuesta){
            resultado = "el numero es muy bajo";
        } else if(numero < respuesta){
            resultado = "el numero es muy alto";
        } else{
            resultado = "Ganaste";
        }
        return resultado;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }
    
    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
