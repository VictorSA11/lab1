/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import carro.Carro;
import carro.Suv;
import carro.Sedan;
/**
 *
 * @author Victor Segura
 */
public class Test
{
private void ejecutarCarro(){
        Sedan carro =new Sedan();
        carro.imprimir();
        
      //  carro = new Suv();
        carro.imprimir();
        }
         private static void ejecutarAvion(){
        // Aeropuerto aeropuerto = new Aeropuerto (new Jet());
         //aeropuerto.takeOff();
        // Aeropuerto aeropuerto = new Aeropuerto (new Avioneta());
         //aeropuerto.takeOff();
         }

    public static void main(String[] args) {
        // TODO code application logic here
       
     ejecutarAvion();   
         
        
    }
    }
    

