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

    public Personaje[] getAlmacenMonstruos() {
        return almacenMonstruos;
    }

    Personaje[] almacenMonstruos = new Personaje[5];

    /**
     * Aqui estan almacenados los monstruos.
     */
    public void bestiario() {

        almacenMonstruos[0] = new Personaje("Licantropo", 1, 0, 0, 0, 0, 0, 0, null, null, null);

        almacenMonstruos[1] = new Personaje("Kimera", 1, 0, 0, 0, 0, 0, 0, null, null, null);

        almacenMonstruos[2] = new Personaje("Ogro de las cavernas", 1, 0, 0, 0, 0, 0, 0, null, null, null);

        almacenMonstruos[3] = new Personaje("Nocturne", 2, 0, 0, 0, 0, 0, 0, null, null, null);

    }

    public Personaje getHeroe() {
        return heroe;
    }

    Personaje heroe = new Personaje("Kirito", 1, 0, 0, 0, 0, 0, 0,null , null, null);
    
}
