/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

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

    Habilidad ataque1 = new Habilidad(10, 1, 4, "Golpe");
    Habilidad ataque2 = new Habilidad(25, 1, 4, "Codazo");
    Habilidad ataque3 = new Habilidad(20, 1, 1, "puño de fuego");
    Habilidad ataque4 = new Habilidad(30, 2, 2, "Trueno");
    Habilidad ataque5 = new Habilidad(23, 2, 1, "Lava");
    Habilidad ataque6 = new Habilidad(15, 1, 4, "Patada");
    Habilidad ataque7 = new Habilidad(10, 2, 3, "Mordisco");
    Habilidad ataque8 = new Habilidad(20, 2, 2, "Congelacion");
    Habilidad ataque9 = new Habilidad(30, 1, 3, "Cuchillada");
    Habilidad ataque10 = new Habilidad(16, 2, 3, "Zarpazo");

    private Personaje monstruo1 = new Personaje("Licantropo", 1, 5, 50, 10, 100, 0, 100, false, false, ataque10, ataque7, ataque2);

    private Personaje monstruo2 = new Personaje("Kimera", 1, 9, 35, 10, 110, 0, 110, false, false, ataque7, ataque4, ataque6);

    private Personaje monstruo3 = new Personaje("Ogro de las cavernas", 1, 8, 25, 10, 115, 0, 115, false, false, ataque4, ataque8, ataque9);

    private Personaje monstruo4 = new Personaje("Nocturne", 2, 10, 40, 20, 150, 0, 150, false, false, ataque3, ataque5, ataque1);

    private Personaje heroe = new Personaje("Kirito", 1, 5, 20, 25, 120, 0, 120, false, false, ataque1, ataque9, ataque6);

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

    /**
     * @return the monstruo2
     */
    public Personaje getMonstruo2() {
        return monstruo2;
    }

    /**
     * @param monstruo2 the monstruo2 to set
     */
    public void setMonstruo2(Personaje monstruo2) {
        this.monstruo2 = monstruo2;
    }

    /**
     * @return the monstruo3
     */
    public Personaje getMonstruo3() {
        return monstruo3;
    }

    /**
     * @param monstruo3 the monstruo3 to set
     */
    public void setMonstruo3(Personaje monstruo3) {
        this.monstruo3 = monstruo3;
    }

    /**
     * @return the monstruo4
     */
    public Personaje getMonstruo4() {
        return monstruo4;
    }

    /**
     * @param monstruo4 the monstruo4 to set
     */
    public void setMonstruo4(Personaje monstruo4) {
        this.monstruo4 = monstruo4;
    }
}
