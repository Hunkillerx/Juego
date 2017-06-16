/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
import Vista.Caronte;

/**
 * Esta clase dibuja el panel en el que se mueve la imagen.
 *
 * @author Jose Diaz & Brayan Herrera
 * @since 08/06/2017
 * @version 1.0
 */
public class Dibujar extends JPanel implements ActionListener {

    HeroeMovimiento heroe = new HeroeMovimiento();
    Timer timer = new Timer(5, this);

    /**
     * Constructor de la clase dibujar.
     */
    public Dibujar() {

        setBackground(Color.BLACK);
        setFocusable(true);
        setOpaque(false);
        addKeyListener(new teclado());
        timer.start();
    }

    /**
     * Este metodo pinta una grafica que contien la imagen.
     *
     * @param grafica grafica creada.
     */
    @Override
    public void paint(Graphics grafica) {
        super.paint(grafica);
        Graphics2D g2 = (Graphics2D) grafica;
        
    }

    /**
     * Este metodo lee las acciones del teclado y repinta cuando la imagen se
     * mueve.
     *
     * @param e accion del teclado.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        heroe.mover();
        repaint();

    }

    /**
     * Esta clase sirve para tomar las acciones del teclado.
     */
    private class teclado extends KeyAdapter {

        /**
         * Metodo para leer cuando precionan una tecla.
         *
         * @param e accion de presionar.
         */
        @Override
        public void keyPressed(KeyEvent e) {
            heroe.keyPressed(e);
        }

        /**
         * Metodo para leer cuando sueltan una tecla.
         *
         * @param e accion de soltar.
         */
        @Override
        public void keyReleased(KeyEvent e) {
            heroe.keyReleased(e);
        }
    }

}
