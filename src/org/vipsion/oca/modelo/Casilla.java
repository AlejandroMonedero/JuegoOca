package org.vipsion.oca.modelo;

/**
 * Define una casilla del juego.
 * @author Alejandro Monedero
 */
public class Casilla {

    /**
     *
     */
    protected int posicion;

    /**
     *Instancia una casilla con una posición.
     * @param posicion es el número de casilla que se le asigna a casilla.
     */
    public Casilla(int posicion) {
        this.posicion = posicion;
    }

    /**
     *<p>Establece la posición de la ficha</p> 
     * Comentario para el git
     * @param ficha  ficha que se posa en esa casilla
     * @see Ficha#setPosicion(int)
     */
    public void posaFicha(Ficha ficha) {
        ficha.setPosicion(posicion);
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    

}
