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
public class CasillaCarcel extends Casilla {
    
    public CasillaCarcel(int posicion) {
        super(posicion);
    }
    
    @Override
    public void posaFicha(Ficha ficha){
        int turnoExtra=-3;
        ficha.setTurnosExtra(turnoExtra);
    }
    
}
