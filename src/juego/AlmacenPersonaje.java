/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.List;

/**
 * Esta clase crea el espacio y almacena los personajes entre heroes y monstruos.
 *
 * @author Jose Diaz & Brayan Herrera
 * @since 08/06/2017
 * @version 1.0
 */
public class AlmacenPersonaje {

    private List almacenMonstruos;
    private List alamacenHeroes;
    
    
    /**
     *
     * @return
     */
    public List getAlmacenMonstruos() {
        return almacenMonstruos;
    }

    /**
     *
     * @param almacenMonstruos
     */
    public void setAlmacenMonstruos(List almacenMonstruos) {
        this.almacenMonstruos = almacenMonstruos;
    }

    /**
     *
     * @return
     */
    public List getAlamacenHeroes() {
        return alamacenHeroes;
    }

    /**
     *
     * @param alamacenHeroes
     */
    public void setAlamacenHeroes(List alamacenHeroes) {
        this.alamacenHeroes = alamacenHeroes;
    }

    public void bestiario(){
        almacenMonstruos.add(new Personaje("licantropo", 1, 3, 20, 40, 150, 0, 150, null, null, null, alamacenHeroes));
        almacenMonstruos.add(new Personaje("kimera", 2, 4, 25, 35, 200, 0, 200, null, null, null, alamacenHeroes));
    }
}
