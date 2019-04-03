package org.vipsion.oca;

import org.vipsion.oca.vista.OcaGUI;
import org.vipsion.oca.controlador.Coordinador;
import org.vipsion.oca.modelo.Juego;


/**
 * <p>Contiene el main con las instancias de Coordinador,Juego y OcaGUI.</p> 
 * @since 0.5
 * @version 0.5
 * @author Alejandro Monedero
 * {@docRoot }
 */

public class Principal {

    /**
     *<p>Al Juego se le asigna un coordinador.<br>
    * A OcaGUI se le asigna un coordinador.<br>
    * Al Coordinador se le asignan instancias OcaGUI y Juego.<br>
    * Se habilita la visibilidad de la interfaz gráfica.<br>
    * </p>
    * @param args Recoge los valores del main.
    * @author Alejandro
    * @see Juego
    * @see Coordinador
    * @see OcaGUI
    * @see Coordinador#inicia()
     */
    public static void main(String[] args) {
        Coordinador miCoordinador = new Coordinador();
        Juego miJuego = new Juego();
        OcaGUI miGUI = new OcaGUI();
        miJuego.setCoordinador(miCoordinador);
        miGUI.setCoordinador(miCoordinador);
        miCoordinador.setGUI(miGUI);
        miCoordinador.setJuego(miJuego);
        miGUI.setVisible(true);
        miCoordinador.inicia();
    }
}
