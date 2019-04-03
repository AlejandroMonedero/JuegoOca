package org.vipsion.oca.modelo;

/**
 *Define la última casilla de Oca.
 * @author Alejandro Monedero
 */
public class OcaFin extends Casilla {

    private final int desplazamiento;

    /**
     *Instancia la Casilla OcaFin.<br>
     * @param posicion número de casilla que se le asigna a casilla.
     * @param desplazamiento El valor necesario para posicionarlo en la casilla fin.
     * @see Fin
     */
    public OcaFin(int posicion, int desplazamiento) {
        super(posicion);
        this.desplazamiento = desplazamiento;
    }

    /**
     *{@inheritDoc}
     * @param ficha {@inheritDoc}.
     * @see Ficha#setPosicion(int) 
     * @see Ficha#setFin(java.lang.Boolean) 
     */
    @Override
    public void posaFicha(Ficha ficha) {
        ficha.setPosicion(posicion + desplazamiento);
        ficha.setFin(true);
    }
}
