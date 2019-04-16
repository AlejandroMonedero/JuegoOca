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
public class CasillaPuente extends Casilla {
    
    public CasillaPuente(int posicion) {
        super(posicion);
    }
    
    @Override
    public void posaFicha(Ficha ficha){
        ficha.setPosicion(19);
    }
    
}
