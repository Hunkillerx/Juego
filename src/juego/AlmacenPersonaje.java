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

    private Personaje[] almacenMonstruos = new Personaje[4];
    private Personaje monstruo1;
    Habilidad ataque1 = new Habilidad(10, 1, 4, "Golpe");
    Habilidad ataque2 = new Habilidad(25, 1, 4, "Codazo");
    Habilidad ataque3 = new Habilidad(20, 1, 1, "puño de fuego");
    Habilidad ataque4 = new Habilidad(30, 2, 2, "Trueno");
    Habilidad ataque5 = new Habilidad(23, 2, 1, "Lava");
    Habilidad ataque6 = new Habilidad(15, 1, 4, "Patada");
    Habilidad ataque7 = new Habilidad(10, 2, 3, "Mordisco");
    Habilidad ataque8 = new Habilidad(20, 2, 2, "Congelacion");
    Habilidad ataque9 = new Habilidad(30, 1, 3, "Cuchillada");
    Habilidad ataque10 = new Habilidad(17, 2, 3, "Zarpazo");

    /**
     * Aqui estan almacenados los monstruos.
     */
    public void bestiario() {

        almacenMonstruos[0] = new Personaje("Licantropo", 1, 0, 0, 0, 0, 0, 0, false, false, null, null, null);

        almacenMonstruos[1] = new Personaje("Kimera", 1, 0, 0, 0, 0, 0, 0, false, false, null, null, null);

        almacenMonstruos[2] = new Personaje("Ogro de las cavernas", 1, 0, 0, 0, 0, 0, 0, false, false, null, null, null);

        almacenMonstruos[3] = new Personaje("Nocturne", 2, 0, 0, 0, 0, 0, 0, false, false, null, null, null);

        for (int i = 0; i < almacenMonstruos.length; i++) {
            monstruo1 = almacenMonstruos[i];
        }

    }

    /**
     * Metodo para vincular un monstruo creado con Monstruo1.
     *
     * @param numero numero que se ingresa de forma aleatoria.
     */
    public void vincular(int numero) {
        if (numero == 1) {
            monstruo1 = almacenMonstruos[0];
        } else if (numero == 2) {
            monstruo1 = almacenMonstruos[1];
        } else if (numero == 3) {
            monstruo1 = almacenMonstruos[2];
        } else if (numero == 4) {
            monstruo1 = almacenMonstruos[3];
        }
    }

    private Personaje heroe = new Personaje("Kirito", 1, 0, 0, 0, 0, 0, 0, false, false, ataque1, ataque9, ataque6);

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
