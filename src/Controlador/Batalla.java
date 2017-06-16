/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.Arrays;
import java.util.Queue;
import juego.Items;
import juego.Personaje;
import java.util.Random;
import juego.AlmacenPersonaje;

/**
 * Esta clase contiene los metodos para el evento de la batalla.
 *
 * @author Jose Diaz & Brayan Herrera
 * @since 08/06/2017
 * @version 1.0
 */
public class Batalla {

    Items almcItem;
    Personaje person;
    private Queue enemigos;
    Personaje heroe = new AlmacenPersonaje().getHeroe();
    Personaje monstruo = new AlmacenPersonaje().getMonstruo1();

    /**
     * Metedo para cuando algun personaje ataca.
     *
     * @param eleccionJugador eleccion del jugador.
     */
    public void atacar(int eleccionJugador) {

        int dmg = heroe.getAtaque() + heroe.getAtaque1().getDaño();
        if (dmg < 1) {
            dmg = 1;
        }
        monstruo.setCurrentHp(monstruo.getCurrentHp() - dmg);
        if (monstruo.getCurrentHp() > 0) {
            dmg = monstruo.getAtaque() + monstruo.getAtaque1().getDaño() - heroe.getDefensa();
            if (dmg < 1) {
                dmg = 1;
            }
            heroe.setCurrentHp(heroe.getCurrentHp() - dmg);
        }
    }

    /**
     * Metodo para usar un item.
     *
     * @param eleccionJugador eleccion del jugador.
     */
    public void usarItem(int eleccionJugador) {

        if (almcItem.getTipo() == eleccionJugador && eleccionJugador == 1) {
            person.setCurrentHp(person.getCurrentHp() + 15);

        } else if (almcItem.getTipo() == eleccionJugador && eleccionJugador == 2) {
            person.setAtaque(person.getAtaque() + 10);

        } else if (almcItem.getTipo() == eleccionJugador && eleccionJugador == 3) {
            person.setCurrentHp(person.getCurrentHp() + 30);

        } else if (almcItem.getTipo() == eleccionJugador && eleccionJugador == 4) {
            person.setDefensa(person.getDefensa() + 10);

        } else if (almcItem.getTipo() == eleccionJugador && eleccionJugador == 5) {
            person.setDefensa(person.getDefensa() + 30);

        } else if (almcItem.getTipo() == eleccionJugador && eleccionJugador == 6) {
            person.setAtaque(person.getAtaque() + 30);
        }

    }

    /**
     * Metodo para determinar quien ataca primero de forma aleatoria.
     *
     * @return return true si ataca el heroe y false si ataca el monstruo.
     */
    public boolean turnoAleatorio() {
        Random aleatorio = new Random();
        int numero = 1 + aleatorio.nextInt(100);
        return numero % 2 == 0;
    }

    /**
     * Metodo que determina como se va ha llevar a cabo la lucha.
     *
     * @return Retorna code quien es el siguiente turno.
     */
    public boolean lucha() {
        return false;
    }

    /**
     * Llama la cola en la que se guarda los enemigos que van a luchar.
     *
     * @return cola con los enemigos.
     */
    public Queue getEnemigos() {
        return enemigos;
    }

    /**
     * Modifica la cola en la que se guarda los enemigos que van a luchar.
     *
     * @param enemigos Enemigos con los que se va a luchar.
     */
    public void setEnemigos(Queue enemigos) {
        this.enemigos = enemigos;
    }

}
