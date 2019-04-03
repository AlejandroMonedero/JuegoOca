package org.vipsion.oca.vista;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import org.vipsion.oca.controlador.Coordinador;

/**
 * Declara la ventana donde podran interactuar los jugadores
 * @author Alejandro Monedero
 */
public class OcaGUI extends JFrame {

    private List<PanelJugador> panelesJugador;
    private JLabel label;
    private Coordinador coordinador;

    /**
     * Se establece un coordinador al panel de cada jugador.
     * @see PanelJugador#setCoordinador(org.vipsion.oca.controlador.Coordinador)
     * @param coordinador Coordinador a establecer.
     */
    public void setCoordinador(Coordinador coordinador) {
        this.coordinador = coordinador;
        for (PanelJugador panelJugador : panelesJugador) {
            panelJugador.setCoordinador(coordinador);
        }
    }

    /**
     *Instancia la ventana e inicializa los componentes.
     *Establece la operacion de cierre del programa.
     */
    public OcaGUI() {
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     *Recupera el turno y asigna un valor del dado para cada turno de PanelJugador.
     * @param turno de la persona que le toca jugar.
     * @param valor el numero definido por el dado.
     * @see PanelJugador#setValorDado(int)
     */
    public void setValorDado(int turno, int valor) {
        PanelJugador panelJugador = panelesJugador.get(turno);
        panelJugador.setValorDado(valor);
    }

    /**
     *Recupera el turno en panelJugador.
     * Establece la posicion de la ficha.
     * @param turno jugador actual.
     * @param valor de la posicion ficha.
     * @see PanelJugador#setPosicionTablero(int)
     */
    public void setPosicionTablero(int turno, int valor) {
        PanelJugador panelJugador = panelesJugador.get(turno);
        panelJugador.setPosicionTablero(valor);
    }

    /**
     *Deshabilita el turno de tirada.
     * @param turno indica el turno deshabilitado.
     * @see PanelJugador#disableTiraDado()

     */
    public void disableTurno(int turno) {
        PanelJugador panelJugador = panelesJugador.get(turno);
        panelJugador.disableTiraDado();
    }

    /**
     *Habilita el siguiente turno de un mismo jugador.
     * @param turno turno del jugador a habilitar.
     * @see PanelJugador#disableTiraDado() 
     * @see PanelJugador#enableTiraDado()
     */
    public void sigTurno(int turno) {
        for (PanelJugador panelJugador : panelesJugador) {
            panelJugador.disableTiraDado();
        }
        panelesJugador.get(turno).enableTiraDado();
    }

    /**
     *Habilita un nuevo o primer turno de cada jugador.
     * @param turno turno del jugador.
     * @see PanelJugador#enableTiraDado() 
     */
    public void enableTurno(int turno) {
        PanelJugador panelJugador = panelesJugador.get(turno);
        panelJugador.enableTiraDado();
    }

    /**
     *Establece un ganador.
     * @param turno jugador que ha ganado.
     * @see PanelJugador#setGanador()
     */
    public void setGanador(int turno) {
        PanelJugador panelJugador = panelesJugador.get(turno);
        panelJugador.setGanador();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        panelesJugador = new ArrayList<>();
        PanelJugador panelJugador1 = new PanelJugador(1);
        PanelJugador panelJugador2 = new PanelJugador(2);
        panelesJugador.add(panelJugador1);
        panelesJugador.add(panelJugador2);
        label = new JLabel();
        label.setText("OCA");
        label.setFont(label.getFont().deriveFont(50.0f));
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(panelJugador1, GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelJugador2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(label)
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                .addComponent(panelJugador1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(panelJugador2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))));
        pack();
    }

    /**
     *Captura excepciones externas al programa.
     * <a href="http://puntocomnoesunlenguaje.blogspot.com/2012/08/el-argumento-args-de-main-en-java.html">Descripción y uso de args.</a><br>
     * <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/ClassNotFoundException.html">Excepción ClassNotFound</a><br>
     * <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/InstantiationException.html">Excepción Instantiation</a><br>
     * <a href="https://docs.oracle.com/javase/7/docs/api/java/lang/IllegalAccessException.html">Excepción IllegalAcces</a><br>
     * <a href="https://docs.oracle.com/javase/7/docs/api/javax/swing/UnsupportedLookAndFeelException.html">Excepción UnsupportedLookAndFeel</a>
     * @param args Recoge y almacena valores.
     */
    public static void main(String args) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OcaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OcaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OcaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OcaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new OcaGUI().setVisible(true);
            }
        });
    }
}
