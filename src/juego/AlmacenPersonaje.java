/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.List;

/**
 *
 * @author Josex
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

}
