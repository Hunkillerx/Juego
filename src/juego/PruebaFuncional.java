/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

import java.util.stream.IntStream;

/**
 *
 * @author Josex
 */
public class PruebaFuncional {

    boolean esPrimo(int num) {
        return num > 1 && IntStream.range(2, num).noneMatch(index -> num % index == 0);
    }

    boolean esPrimo2(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return num > 1;
    }
}
