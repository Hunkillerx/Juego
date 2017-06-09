/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

/**
 * Esta clase contiene los atributos de los items y contiene un arreglo con ellos.
 * 
 * @author Jose Diaz & Brayan Herrera
 * @since 08/06/2017
 * @version 1.0
 */
public class Items {

    private int tipo;
    private int efecto;
    private String nombre;

    /**
     * Este es el constructor de la clase items.
     *
     * @param tipo Define que tipo de item es.
     * @param efecto El efecto que hace el item.
     * @param nombre nombre del item.
     */
    public Items(int tipo, int efecto, String nombre) {
        this.tipo = tipo;
        this.efecto = efecto;
        this.nombre = nombre;
    }

    Items() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    /**
     * almacena y crea los objetos del juego.
     */
    public void almacenObjetos() {

        Items[] objetos = new Items[10];

        objetos[0] = new Items(1, 1, "Posicion de curacion");
        objetos[1] = new Items(2, 2, "Aumento de Ataque");
        objetos[2] = new Items(3, 3, "Posicion grande de curacion");
        objetos[3] = new Items(4, 4, "Aumento de defensa");
        objetos[4] = new Items(5, 5, "Armadura");
        objetos[5] = new Items(6, 6, "Espada de plata");
        objetos[6] = new Items(7, 7, "Llave");
    }
}
