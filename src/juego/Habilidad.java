/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 * Esta clase contiene los atributos de una habilidad.
 *
 * @author Jose Diaz & Brayan Herrera
 * @since 08/06/2017
 * @version 1.0
 */
public class Habilidad {

    private int daño;
    private int tipo;
    private int efecto;
    private String nombre;

    // Tipo = 1. Cuerpo a cuerpo , 2. largo alcance
    // Efecto = 1. Quemadura, 2. Paralisis, 3. Sangrado, 4. Ninguno
    /**
     * Constructor de la clase Habilidad.
     *
     * @param daño Daño que hace el ataque o habilidad.
     * @param tipo Tipo de habilidad.
     * @param efecto Efecto que hace la habilidad.
     * @param nombre Nombre de la habilidad.
     */
    public Habilidad(int daño, int tipo, int efecto, String nombre) {
        this.daño = daño;
        this.tipo = tipo;
        this.efecto = efecto;
        this.nombre = nombre;
    }

    /**
     * Llama la variable daño.
     *
     * @return the daño
     */
    public int getDaño() {
        return daño;
    }

    /**
     * Modifica la variable daño.
     *
     * @param daño the daño to set
     */
    public void setDaño(int daño) {
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
