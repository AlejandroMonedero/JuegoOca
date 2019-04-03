/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.vipsion.oca.modelo;

/**
 *
 * @author alejandromonederoacebal
 */
public class CasillaDado extends Casilla {
    
    public CasillaDado(int posicion) {
        super(posicion);
    }
    
    //Comentario para el método posaFicha
    @Override
    public void posaFicha(Ficha ficha){
        ficha.setTurnosExtra(1);
        
    }
    
}
