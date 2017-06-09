/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Herrera Hernandez
 */
public class Dibujar extends JPanel implements ActionListener {
    
    Heroe heroe = new Heroe();
    Timer timer = new Timer(5, this);

    /**
     *
     */
    public Dibujar() {
        
        setBackground(Color.decode(String.valueOf(0)));
        setFocusable(true);
        addKeyListener(new teclado());
        timer.start();
    }

    /**
     *
     * @param grafica
     */
  
    @Override
    public void paint(Graphics grafica) {
        super.paint(grafica);
        Graphics2D g2 =(Graphics2D) grafica;
        g2.drawImage(heroe.getImagen(), heroe.getX(), heroe.getY(),null);
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        heroe.mover();
        repaint();
        
    }

    /**
     *
     */
    private class teclado extends KeyAdapter {

        /**
         *
         * @param e
         */
        @Override
        public void keyPressed(KeyEvent e) {
            heroe.keyPressed(e);
        }

        /**
         *
         * @param e
         */
        @Override
        public void keyReleased(KeyEvent e) {
            heroe.keyReleased(e);
        }
    }
    
}
