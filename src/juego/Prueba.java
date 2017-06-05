/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.stream.StreamSupport;

/**
 *
 * @author Josex
 */
public class Prueba {
    boolean esPrimo(int num){
        return num> 1 && StreamSupport.intStream.range(2,num)
    }
}
