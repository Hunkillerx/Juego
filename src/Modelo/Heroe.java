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
     */
    public Heroe() {
        this.x = 0;
        this.y = 0;
        heroe = "kirito.png";
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

    public String getHeroe() {
        return heroe;
    }

    public void setHeroe(String heroe) {
        this.heroe = heroe;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

}
