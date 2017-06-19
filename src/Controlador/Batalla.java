/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.Queue;
import juego.Items;
import juego.Personaje;
import java.util.Random;

/**
 * Esta clase contiene los metodos para el evento de la batalla.
 *
 * @author Jose Diaz & Brayan Herrera
 * @since 08/06/2017
 * @version 1.0
 */
public class Batalla {

    Items almcItem;
    private Queue enemigos;

    /**
     * Metedo para cuando ataca el heroe.
     *
     * @param heroe Personaje principal.
     * @param monstruo Personaje rival o enemigo.
     * @param eleccionJugador eleccion del jugador.
     */
    public void atacarAlMostruo(Personaje heroe, Personaje monstruo, int eleccionJugador) {

        if (heroe.getCurrentHp() > 0) {
            switch (eleccionJugador) {
                case 1: {
                    int dmg = heroe.getAtaque() + heroe.getAtaque1().getDaño() - monstruo.getDefensa();
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
                    break;
                }
                case 2: {
                    int dmg = heroe.getAtaque() + heroe.getAtaque2().getDaño() - monstruo.getDefensa();
                    if (dmg < 1) {
                        dmg = 1;
                    }
                    monstruo.setCurrentHp(monstruo.getCurrentHp() - dmg);

                    if (monstruo.getCurrentHp() > 0) {
                        dmg = monstruo.getAtaque() + monstruo.getAtaque2().getDaño() - heroe.getDefensa();
                        if (dmg < 1) {
                            dmg = 1;
                        }
                    }
                    break;

                }
                case 3: {
                    int dmg = heroe.getAtaque() + heroe.getAtaque3().getDaño() - monstruo.getDefensa();
                    if (dmg < 1) {
                        dmg = 1;
                    }
                    monstruo.setCurrentHp(monstruo.getCurrentHp() - dmg);

                    if (monstruo.getCurrentHp() > 0) {
                        dmg = monstruo.getAtaque() + monstruo.getAtaque3().getDaño() - heroe.getDefensa();
                        if (dmg < 1) {
                            dmg = 1;
                        }
                        heroe.setCurrentHp(heroe.getCurrentHp() - dmg);
                    }
                    break;
                }
                default:
                    break;
            }
        }
        if (monstruo.getCurrentHp() <= 0) {
            System.out.println("El ganador es el heroe");
        } else if (heroe.getCurrentHp() <= 0) {
            System.out.println("El ganador es el monstruo");
        }

    }

    /**
     * Metodo para caundo ataca el monstruo.
     *
     * @param heroe Personaje principal.
     * @param monstruo Personaje rival o enemigo.
     */
    public void atacarAlHeroe(Personaje heroe, Personaje monstruo) {

        Random aleatorio = new Random();
        int numero = 1 + aleatorio.nextInt(3);
        if (monstruo.getCurrentHp() > 0) {
            int dmg;

            switch (numero) {
                case 1:
                    dmg = monstruo.getAtaque() + monstruo.getAtaque1().getDaño() - heroe.getDefensa();
                    if (dmg < 1) {
                        dmg = 1;
                    }
                    heroe.setCurrentHp(heroe.getCurrentHp() - dmg);
                    break;
                case 2:
                    dmg = monstruo.getAtaque() + monstruo.getAtaque2().getDaño() - heroe.getDefensa();
                    if (dmg < 1) {
                        dmg = 1;
                    }
                    heroe.setCurrentHp(heroe.getCurrentHp() - dmg);
                    break;
                case 3:
                    dmg = monstruo.getAtaque() + monstruo.getAtaque3().getDaño() - heroe.getDefensa();
                    if (dmg < 1) {
                        dmg = 1;
                    }
                    heroe.setCurrentHp(heroe.getCurrentHp() - dmg);
                    break;
                default:
                    break;
            }
        }

    }

    /**
     * Metodo para usar un item.
     *
     * @param heroe Personaje principal.
     * @param monstruo Personaje rival o enemigo.
     * @param eleccionJugador eleccion del jugador.
     */
    public void usarItem(Personaje heroe, Personaje monstruo, int eleccionJugador) {

        if (almcItem.getTipo() == eleccionJugador && eleccionJugador == 1) {
            heroe.setCurrentHp(heroe.getCurrentHp() + 15);
            atacarAlHeroe(heroe, monstruo);

        } else if (almcItem.getTipo() == eleccionJugador && eleccionJugador == 2) {
            heroe.setAtaque(heroe.getAtaque() + 10);
            atacarAlHeroe(heroe, monstruo);

        } else if (almcItem.getTipo() == eleccionJugador && eleccionJugador == 3) {
            heroe.setCurrentHp(heroe.getCurrentHp() + 30);
            atacarAlHeroe(heroe, monstruo);

        } else if (almcItem.getTipo() == eleccionJugador && eleccionJugador == 4) {
            heroe.setDefensa(heroe.getDefensa() + 10);
            atacarAlHeroe(heroe, monstruo);

        } else if (almcItem.getTipo() == eleccionJugador && eleccionJugador == 5) {
            heroe.setDefensa(heroe.getDefensa() + 30);
            atacarAlHeroe(heroe, monstruo);

        } else if (almcItem.getTipo() == eleccionJugador && eleccionJugador == 6) {
            heroe.setAtaque(heroe.getAtaque() + 30);
            atacarAlHeroe(heroe, monstruo);
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
     * Metodo que define al que ataca primero y como se llevan los turnos.
     *
     * @param heroe Personaje principal.
     * @param monstruo Personaje rival o enemigo.
     * @param eleccionJugador eleccion del jugador 1 si va ha atacar y 2 si va
     * ha usar un Item.
     */
    public void turnos(Personaje heroe, Personaje monstruo, int eleccionJugador) {

        Random AtaqueMonstuo = new Random();
        int numero = 1 + AtaqueMonstuo.nextInt(3);

        if (turnoAleatorio() == true) {
            heroe.setInicia(true);
            if (eleccionJugador == 1) {
                atacarAlMostruo(heroe, monstruo, eleccionJugador);
            } else if (eleccionJugador == 2) {
                usarItem(heroe, monstruo, eleccionJugador);
            }
            monstruo.setSiguiente(true);
        } else if (turnoAleatorio() == false) {
            monstruo.setInicia(true);
            atacarAlHeroe(heroe, monstruo);
            heroe.setSiguiente(true);
        }

        if (heroe.isSiguiente() && heroe.getCurrentHp() > 0) {

            if (eleccionJugador == 1) {
                atacarAlMostruo(heroe, monstruo, eleccionJugador);
            } else if (eleccionJugador == 2) {
                usarItem(heroe, monstruo, eleccionJugador);
            }
            monstruo.setSiguiente(true);

        } else if (monstruo.isSiguiente() && monstruo.getCurrentHp() < 0) {
            atacarAlHeroe(heroe, monstruo);
            heroe.setSiguiente(true);
        }
    }

    /**
     * Metodo que determina como se va ha llevar a cabo la lucha.
     *
     * @param heroe Personaje principal.
     * @param monstruo Personaje rival o enemigo.
     * @return Retorna 1 si gana el monstruo, 2 si gana el heroe y 0 si la pelea
     * continua.
     */
    public int lucha(Personaje heroe, Personaje monstruo) {
        if (heroe.getCurrentHp() < 0 || heroe.getCurrentHp() == 0) {
            return 1;

        } else if (monstruo.getCurrentHp() < 0 || monstruo.getCurrentHp() == 0) {
            return 2;
        } else {
            return 0;
        }
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
