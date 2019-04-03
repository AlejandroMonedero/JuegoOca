package org.vipsion.oca.modelo;

/**
 *Define la ficha del jugador.
 * @author Alejandro Monedero
 */
public class Ficha {

    private int posicion;
    private int turnosExtra;
    private Boolean fin;
    // private int turnosSinTirar; 

    /**
     *Devuelve el fin de la partida.
     * @return <code>fin</code>
     */
    public Boolean getFin() {
        return fin;
    }

    /**
     *Establece el fin de la partida.
     * @param fin Representa la propiedad que se le pasa 
     */
    public void setFin(Boolean fin) {
        this.fin = fin;
    }

    /**
     *Instancia una ficha inicializada.
     */
    public Ficha() {
        posicion = 1;
        fin = false;
        turnosExtra = 0;
    }

    /**
     *Devuelve la posicion de la ficha.
     * @return <code>posicion</code>
     */
    public int getPosicion() {
        return posicion;
    }

    /**
     *Determina la posicion de la ficha.
     * @param posicion Es el numero de casilla que se le asigna a la ficha.
     */
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    /**
     *Indica los posibles turnos extra.
     * @return <code>turnosExtra</code>
     */
    public int getTurnosExtra() {
        return turnosExtra;
    }

    /**
     *Establece posibles turnos extra.
     * @param turnosExtra Número de turnos extra.
     */
    public void setTurnosExtra(int turnosExtra) {
        this.turnosExtra = turnosExtra;
    }

    /**
     *Disminuye el número de turnos extra.
     */
    public void decrementaTurnosExtra() {
        turnosExtra--;
    }

}
