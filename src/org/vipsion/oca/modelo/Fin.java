package org.vipsion.oca.modelo;

/**
 *Define una casilla  de fin de juego.<br>
 * @author Alejandro Monedero
 * @see Casilla
 */
public class Fin extends Casilla {

    /**
     *Instancia una casilla.
     * @param posicion es posición que se le asigna a casilla.
     */
    public Fin(int posicion) {
        super(posicion);
    }

    /**
     * Fija el fin de la ficha a <code>true</code>. 
     * @param ficha {@inheritDoc}
     * @see Ficha#setFin(java.lang.Boolean)
     */
    @Override
    public void posaFicha(Ficha ficha) {
        ficha.setFin(true);
    }
}
