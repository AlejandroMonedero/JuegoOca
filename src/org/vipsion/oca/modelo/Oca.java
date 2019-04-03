package org.vipsion.oca.modelo;

/**
 *Define la Casilla que representa a la Oca.<br>
 * @author Alejandro Monedero
 * @see Casilla
 */
public class Oca extends Casilla {

    private final int desplazamiento;
    private final int turnosExtra;

    /**
     * Instancia la casilla Oca.
     * Se le añade un turno extra.
     * @param posicion es el número de casilla que se le asigna a  la casilla.
     * @param desplazamiento El valor que le posiciona en la siguiente Casilla Oca.
     */
    public Oca(int posicion, int desplazamiento) {
        super(posicion);
        this.desplazamiento = desplazamiento;
        this.turnosExtra = 1;
    }

    /**
     *{@inheritDoc }<br>
     * Establece la nueva posición de la ficha.
     * Se le añade un turno extra.
     * @param ficha {@inheritDoc}.
     * @see Ficha#setPosicion(int) 
     * @see Ficha#setTurnosExtra(int) 
     */
    @Override
    public void posaFicha(Ficha ficha) {
        ficha.setPosicion(posicion + desplazamiento);
        ficha.setTurnosExtra(turnosExtra);
    }
}
