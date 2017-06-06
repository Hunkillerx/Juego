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
public class Inventario {

    /**
     * Lista que va ser el inventario.
     */
    private List inventarioItems;

    /**
     * Metodo para llamar el inventario de items.
     *
     * @return Retorna la lista del inventario.
     */
    public List getInventarioItems() {
        return inventarioItems;
    }

    /**
     * Metodo para modificar el inventario.
     *
     * @param inventarioItems lista en donde se guardan los items.
     */
    public void setInventarioItems(List inventarioItems) {
        this.inventarioItems = inventarioItems;
    }
}
