/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import Controlador.HeroeMovimiento;
import juego.Personaje;

/**
 * Esta clase crea el espacio y almacena los personajes entre heroes y
 * monstruos.
 *
 * @author Jose Diaz & Brayan Herrera
 * @since 08/06/2017
 * @version 1.0
 */
public class AlmacenPersonaje {

    private Personaje[] almacenMonstruos = new Personaje[5];
    private Personaje monstruo1;

    /**
     * Aqui estan almacenados los monstruos.
     */
    public void bestiario() {

        almacenMonstruos[0] = new Personaje("Licantropo", 1, 0, 0, 0, 0, 0, 0, false, false, null, null, null);

        almacenMonstruos[1] = new Personaje("Kimera", 1, 0, 0, 0, 0, 0, 0, false, false, null, null, null);

        almacenMonstruos[2] = new Personaje("Ogro de las cavernas", 1, 0, 0, 0, 0, 0, 0, false, false, null, null, null);

        almacenMonstruos[3] = new Personaje("Nocturne", 2, 0, 0, 0, 0, 0, 0, false, false, null, null, null);

    }

    private Personaje heroe = new Personaje("Kirito", 1, 0, 0, 0, 0, 0, 0, false, false, null, null, null);

    /**
     * Llama al almacen de mostruos.
     *
     * @return the almacenMonstruos
     */
    public Personaje[] getAlmacenMonstruos() {
        return almacenMonstruos;
    }

    /**
     * Llama al objeto creado denominado heroe.
     *
     * @return the heroe
     */
    public Personaje getHeroe() {
        return heroe;
    }

    /**
     * Llama la variable monstruo1
     *
     * @return the monstruo1
     */
    public Personaje getMonstruo1() {
        return monstruo1;
    }

    /**
     * Modifica la variable monstruo1.
     *
     * @param monstruo1 the monstruo1 to set
     */
    public void setMonstruo1(Personaje monstruo1) {
        this.monstruo1 = monstruo1;
    }
}
