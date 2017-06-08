/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Herrera Hernandez
 */
public class Heroe {

    private String heroe;
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image imagen;

    /**
     *
     * @param x
     * @param y
     * @param imagen
     */
    public Heroe(int x, int y, Image imagen) {
        this.x = 0;
        this.y = 0;
        heroe = "h.gif";
        ImageIcon img = new ImageIcon(this.getClass().getResource(heroe));
        imagen = img.getImage();
    }

    /**
     *
     * @param e
     */
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        } else if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        } else if (key == KeyEvent.VK_UP) {
            dy = -1;
        } else if (key == KeyEvent.VK_DOWN) {
            dy = 1;
        }
    }

    /**
     *
     * @param e
     */
    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        } else if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        } else if (key == KeyEvent.VK_UP) {
            dy = 0;
        } else if (key == KeyEvent.VK_DOWN) {
            dy = 0;
        }
    }

    /**
     *
     */
    public void mover() {

        x += dx;
        y += dy;
    }

    /**
     * 
     * @return 
     */
    public int tenerX() {
        return x;
    }

    /**
     * 
     * @return 
     */
    public int tenery() {
        return y;
    }

    /**
     * 
     * @return 
     */
    public Image tenerImagen() {
        return imagen;
    }

}
