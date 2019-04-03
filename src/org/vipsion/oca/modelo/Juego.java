package org.vipsion.oca.modelo;

import java.util.ArrayList;
import java.util.List;
import org.vipsion.oca.controlador.Coordinador;

/**
 *Representa el juego en sí mismo.
 * @author Alejandro Monedero
 */
public class Juego {

    private Coordinador coordinador;
    private final List<Jugador> jugadores;
    private int turno = 0;
    private final Tablero tablero;
    private final int numJugadores = 2;

    /**
     *Instancia un objeto juego con un tablero y dos jugadores.
     * @see Jugador
     * @see Tablero
     */
    public Juego() {
        jugadores = new ArrayList<>();
        tablero = new Tablero();
        Jugador jugador1 = new Jugador();
        Jugador jugador2 = new Jugador();
        jugadores.add(jugador1);
        jugadores.add(jugador2);
    }

    /**
     *Determina el coordinador del juego.
     * @param coordinador Representa la instancia coordinador encargado del juego.
     */
    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
    }

    /**
     *Establece el siguiente turno de cada jugador.
     * @see Jugador#getTurnosExtra() 
     * @see Jugador#decrementaTurnosExtra() 
     * @return <code>sigTurno</code>
     */
    public int sigTurno() {
        int sigTurno;
        sigTurno = (turno + 1) % numJugadores;
        if (jugadores.get(turno).getTurnosExtra() > 0) {
            sigTurno = turno;
            jugadores.get(turno).decrementaTurnosExtra();
        }
        return (sigTurno);
    }

    /**
     *Indica el avance de los turnos.
     * @return <code>turno</code>
     */
    public int avanzaTurno() {
        turno = sigTurno();
        return turno;
    }

    /**
     *Determina el turno de los jugadores.
     * @param turno Recoge el turno de cada jugador
     */
    public void setTurno(int turno) {
        this.turno = turno;
    }

    /**
     * Coordina el turno de los jugadores
     * @return <code>turno</code>
     */
    public int getTurno() {
        return (turno);
    }

    /**
     *Indica el ultimo valor obtenido por los jugadores.
     * @see Jugador#getUltimoValorDado() 
     * @return <code>valorDado</code>
     */
    public int ultimoValorDado() {
        return jugadores.get(turno).getUltimoValorDado();
    }

    /**
     *Devuelve la última posición conocida de la ficha del jugador.
     * @see Jugador#getUltimaPosicionTablero() 
     * @return <code>posicion</code>
     */
    public int ultimaPosicionTablero() {
        return jugadores.get(turno).getUltimaPosicionTablero();
    }

    /**
     *Fija el turno del jugador en el tablero.
     * @see Jugador#juegaTurno(org.vipsion.oca.modelo.Tablero) 
     */
    public void juega() {
        jugadores.get(turno).juegaTurno(tablero);
    }

    /**
     *Indica si el juego finalizó preguntando a jugador si es ganador.
     * @see Jugador#esGanador() 
     * @return <code>true</code> o <code>false</code>.
     */
    public Boolean esFin() {
        return jugadores.get(turno).esGanador();
    }
}
