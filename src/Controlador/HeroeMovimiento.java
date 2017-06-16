/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 * Esta clase contiene los metodos para el movimiento del personaje.
 *
 * @author Jose Diaz & Brayan Herrera
 * @since 08/06/2017
 * @version 1.0
 */
public class HeroeMovimiento {

    private String heroe;
    private int dx;
    private int dy;
    private int x;
    private int y;
    private Image imagen;

    private int contadorPasos;

    /**
     * Este es el constructor de la clase movimiento.
     */
    public HeroeMovimiento() {
        this.x = 0;
        this.y = 0;
        heroe = "kirito.png";
        ImageIcon img = new ImageIcon(this.getClass().getResource(getHeroe()));
        imagen = img.getImage();
    }

    /**
     * Este metodo captura las entradas del teclado cuando se preciona alguna
     * flecha y da movimiento.
     *
     * @param e Evento del teclado.
     */
    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            setDx(-1);
        } else if (key == KeyEvent.VK_RIGHT) {
            setDx(1);
        } else if (key == KeyEvent.VK_UP) {
            setDy(-1);
        } else if (key == KeyEvent.VK_DOWN) {
            setDy(1);
        }
    }

    /**
     * Este metodo captura cuando se sueltan las teclas y frena el movimiento de
     * la imagen.
     *
     * @param e Evento del teclado.
     */
    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            setDx(0);
        } else if (key == KeyEvent.VK_RIGHT) {
            setDx(0);
        } else if (key == KeyEvent.VK_UP) {
            setDy(0);
        } else if (key == KeyEvent.VK_DOWN) {
            setDy(0);
        }
    }

    public void keyListener(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            setContadorPasos(getContadorPasos() + 1);
        } else if (key == KeyEvent.VK_RIGHT) {
            setContadorPasos(getContadorPasos() + 1);
        } else if (key == KeyEvent.VK_UP) {
            setContadorPasos(getContadorPasos() + 1);
        } else if (key == KeyEvent.VK_DOWN) {
            setContadorPasos(getContadorPasos() + 1);
        }

    }

    /**
     * Llama el contador de pasos.
     *
     * @return the contadorPasos
     */
    public int getContadorPasos() {
        return contadorPasos;
    }

    /**
     * Modifica el contador de pasos.
     *
     * @param contadorPasos the contadorPasos to set
     */
    public void setContadorPasos(int contadorPasos) {
        this.contadorPasos = contadorPasos;
    }

    /**
     * Metodo basico para mover.
     */
    public void mover() {

        setX(getX() + getDx());
        setY(getY() + getDy());
    }

    /**
     * Llama la variable heroe.
     *
     * @return the heroe
     */
    public String getHeroe() {
        return heroe;
    }

    /**
     * Modifica la variable heroe.
     *
     * @param heroe the heroe to set
     */
    public void setHeroe(String heroe) {
        this.heroe = heroe;
    }

    /**
     * Llama la variable dx.
     *
     * @return the dx
     */
    public int getDx() {
        return dx;
    }

    /**
     * Modifica la variable dx.
     *
     * @param dx the dx to set
     */
    public void setDx(int dx) {
        this.dx = dx;
    }

    /**
     * Llama la variable dy.
     *
     * @return the dy
     */
    public int getDy() {
        return dy;
    }

    /**
     * Modifica la variable dy.
     *
     * @param dy the dy to set
     */
    public void setDy(int dy) {
        this.dy = dy;
    }

    /**
     * Llama la variable x.
     *
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * Modifica la variable x.
     *
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Llama la variable y.
     *
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * Modifica la variable y.
     *
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Llama la variable imagen.
     *
     * @return the imagen
     */
    public Image getImagen() {
        return imagen;
    }

    /**
     * Modifica la variable imagen.
     *
     * @param imagen the imagen to set
     */
    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }

}
