/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author Victor Segura
 */

    public abstract class Carro {
    public  abstract String tipo();
    
     
    public final void imprimir(){
    System.out.print("carro tipo: "+tipo());
    }
    
}


