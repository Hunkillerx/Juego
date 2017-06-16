/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.List;

/**
 * Esta clase contiene los atributos de los personajes.
 *
 * @author Jose Diaz & Brayan Herrera
 * @since 08/06/2017
 * @version 1.0
 */
public class Personaje {

    private String nombre;
    private int tipo;
    private int nivel;
    private int ataque;
    private int defensa;
    private int hp;
    private int estado;
    private int currentHp;
    private boolean inicia;
    private boolean siguiente;
    private Habilidad ataque1;
    private Habilidad ataque2;
    private Habilidad ataque3;
    private Habilidad[] almacenHabilidades = new Habilidad[10];

    /**
     * Este es el constructor de la clase Personaje.
     *
     * @param nombre Nombre del personaje.
     * @param tipo Tipo de personaje.
     * @param nivel Nivel del personaje.
     * @param ataque Ataque del personaje.
     * @param defensa Defensa del personaje.
     * @param hp Hp o salud total del personaje.
     * @param estado Estado del personaje.
     * @param currentHp Hp o salud actual del personaje.
     * @param incia Estado de si inicia atacando el personaje o no.
     * @param ataque1 Ataque1 del personaje.
     * @param ataque2 Ataque2 del personaje.
     * @param ataque3 Ataque3 del personaje.
     */
    public Personaje(String nombre, int tipo, int nivel, int ataque, int defensa, int hp, int estado, int currentHp, boolean incia, boolean siguiente,Habilidad ataque1, Habilidad ataque2, Habilidad ataque3) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defensa = defensa;
        this.hp = hp;
        this.estado = estado;
        this.currentHp = currentHp;
        this.inicia = false;
        this.siguiente = false;
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
        this.ataque3 = ataque3;
    }

    Personaje() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * Llama la variable nivel.
     *
     * @return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * Modifica la variable nivel.
     *
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    /**
     * Llama la variable ataque.
     *
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * Modifica la variable ataque.
     *
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * Llama la variable defensa.
     *
     * @return the defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * Modifica la variable defensa.
     *
     * @param defensa the defensa to set
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * Llama la variable hp.
     *
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * Modifica la variable hp.
     *
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * Llama la variable estado.
     *
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * Modifica la variable estado.
     *
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }

    /**
     * Llama la variable currentHp.
     *
     * @return the currentHp
     */
    public int getCurrentHp() {
        return currentHp;
    }

    /**
     * Modifica la variable currentHp.
     *
     * @param currentHp the currentHp to set
     */
    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    /**
     * Llama la variable inicia.
     *
     * @return the inicia
     */
    public boolean isInicia() {
        return inicia;
    }

    /**
     * Modifica la variable inicia.
     *
     * @param inicia the inicia to set
     */
    public void setInicia(boolean inicia) {
        this.inicia = inicia;
    }

    /**
     * Llama la varible sigueinte.
     *
     * @return the siguiente
     */
    public boolean isSiguiente() {
        return siguiente;
    }

    /**
     * Modifica la variable siguiente.
     *
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(boolean siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Llama la variable ataque1.
     *
     * @return the ataque1
     */
    public Habilidad getAtaque1() {
        return ataque1;
    }

    /**
     * Modifica la variable ataque1.
     *
     * @param ataque1 the ataque1 to set
     */
    public void setAtaque1(Habilidad ataque1) {
        this.ataque1 = ataque1;
    }

    /**
     * Llama la variable ataque2.
     *
     * @return the ataque2
     */
    public Habilidad getAtaque2() {
        return ataque2;
    }

    /**
     * Modifica la variable ataque2.
     *
     * @param ataque2 the ataque2 to set
     */
    public void setAtaque2(Habilidad ataque2) {
        this.ataque2 = ataque2;
    }

    /**
     * Llama la variable ataque3.
     *
     * @return the ataque3
     */
    public Habilidad getAtaque3() {
        return ataque3;
    }

    /**
     * Modifica la variable ataque3.
     *
     * @param ataque3 the ataque3 to set
     */
    public void setAtaque3(Habilidad ataque3) {
        this.ataque3 = ataque3;
    }

    /**
     * Llama la lista de almacenHabilidades.
     *
     * @return the almacenHabilidades
     */
    public Habilidad[] getAlmacenHabilidades() {
        return almacenHabilidades;
    }

    /**
     * Almacena habilidades creadas.
     */
    public void habilidades() {



    }
}
