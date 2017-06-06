/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 *
 * @author Josex
 */
class Habilidad {

    private byte daño;
    private int tipo;
    private int efecto;
    private String nombre;

    /**
     * Llama la variable daño.
     *
     * @return the daño
     */
    public byte getDaño() {
        return daño;
    }

    /**
     * Modifica la variable daño.
     *
     * @param daño the daño to set
     */
    public void setDaño(byte daño) {
        this.daño = daño;
    }

    /**
     * Llama la variable tipo.
     *
     * @return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * Modifica la variable tipo.
     *
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * Llama la variable efecto.
     *
     * @return the efecto
     */
    public int getEfecto() {
        return efecto;
    }

    /**
     * Modifica la variable efecto.
     *
     * @param efecto the efecto to set
     */
    public void setEfecto(int efecto) {
        this.efecto = efecto;
    }

    /**
     * Llama la variable nombre.
     *
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica la variable nombre.
     *
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
