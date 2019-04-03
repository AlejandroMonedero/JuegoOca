package org.vipsion.oca.modelo;

/**
 *Define al jugador.
 * @author Alejandro Monedero
 */
public class Jugador {

    private final Ficha ficha;
    private int ultimoValorDado;

    /**
     *Instancia el jugador con su ficha.
     * @see Ficha
     */
    public Jugador() {
        this.ficha = new Ficha();
    }

    /**
     *Gestiona los movimientos de cada jugador en su turno.
     * @param tablero Representa el tablero del juego.
     * @see Dado#dameNumero() 
     * @see Tablero#mueveFicha(org.vipsion.oca.modelo.Ficha, int) 
     * @see Ficha#getPosicion() 
     * @return <code>posicion de la ficha</code>
     */
    public int juegaTurno(Tablero tablero) {
        ultimoValorDado = Dado.dameNumero();
        tablero.mueveFicha(ficha, ultimoValorDado);
        return ficha.getPosicion();
    }

    /**
     *Indica el último valor obtenido del dado.
     * @return <code>ultimoValorDado</code>
     */
    public int getUltimoValorDado() {
        return ultimoValorDado;
    }

    /**
     *Fija el último valor del dado.
     * @param ultimoValorDado Último valor numérico del dado
     */
    public void setUltimoValorDado(int ultimoValorDado) {
        this.ultimoValorDado = ultimoValorDado;
    }

    /**
     *Retorna la posición de la ficha.
     * @see Ficha#getPosicion() 
     * @return <code>posicion</code>
     */
    public int getUltimaPosicionTablero() {
        return ficha.getPosicion();
    }

    /**
     *Devuelve el número de turnos extra del jugador.
     * @see Ficha#getTurnosExtra() 
     * @return <code>turnos extra</code>
     */
    public int getTurnosExtra() {
        return (ficha.getTurnosExtra());
    }

    /**
     *Reduce los turnos extra de los jugadores.
     * @see Ficha#decrementaTurnosExtra() 
     */
    public void decrementaTurnosExtra() {
        ficha.decrementaTurnosExtra();
    }

    /**
     *Determina si algún jugador ha ganado.
     * @see Ficha#getFin() 
     * @return <code>Fin</code>
     */
    public Boolean esGanador() {
        return ficha.getFin();
    }
}
