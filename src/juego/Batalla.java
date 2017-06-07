/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import juego.Items;
import java.util.Queue;

/**
 *
 * @author Josex
 */
public class Batalla {

    Items almcItem = new Items();
    Personaje person = new Personaje();
    private Queue enemigos;

    /**
     * Metedo para cuando algun personaje ataca.
     *
     * @param eleccionJugador eleccion del jugador.
     */
    public void atacar(int eleccionJugador) {

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
        return false;
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
