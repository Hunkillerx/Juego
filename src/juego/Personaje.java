/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.List;

/**
 *
 * @author Jose Diaz
 */
public class Personaje {
    
    private String nombre;
    private int tipo;
    private byte nivel;
    private byte ataque;
    private byte defensa;
    private byte hp;
    private int estado;
    private int currentHp;
    private Habilidad ataque1;
    private Habilidad ataque2;
    private Habilidad ataque3;
    private List almacenHabilidades;

    public Personaje(String nombre, int tipo, byte nivel, byte ataque, byte defensa, byte hp, int estado, int currentHp, Habilidad ataque1, Habilidad ataque2, Habilidad ataque3, List almacenHabilidades) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.ataque = ataque;
        this.defensa = defensa;
        this.hp = hp;
        this.estado = estado;
        this.currentHp = currentHp;
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
        this.ataque3 = ataque3;
        this.almacenHabilidades = almacenHabilidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public byte getNivel() {
        return nivel;
    }

    public void setNivel(byte nivel) {
        this.nivel = nivel;
    }

    public byte getAtaque() {
        return ataque;
    }

    public void setAtaque(byte ataque) {
        this.ataque = ataque;
    }

    public byte getDefensa() {
        return defensa;
    }

    public void setDefensa(byte defensa) {
        this.defensa = defensa;
    }

    public byte getHp() {
        return hp;
    }

    public void setHp(byte hp) {
        this.hp = hp;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public Habilidad getAtaque1() {
        return ataque1;
    }

    public void setAtaque1(Habilidad ataque1) {
        this.ataque1 = ataque1;
    }

    public Habilidad getAtaque2() {
        return ataque2;
    }

    public void setAtaque2(Habilidad ataque2) {
        this.ataque2 = ataque2;
    }

    public Habilidad getAtaque3() {
        return ataque3;
    }

    public void setAtaque3(Habilidad ataque3) {
        this.ataque3 = ataque3;
    }

    public List getAlmacenHabilidades() {
        return almacenHabilidades;
    }

    public void setAlmacenHabilidades(List almacenHabilidades) {
        this.almacenHabilidades = almacenHabilidades;
    }
    
    
}
