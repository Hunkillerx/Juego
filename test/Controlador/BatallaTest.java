/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.util.Queue;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author SALA309
 */
public class BatallaTest {
    
    public BatallaTest() {
    }

    /**
     * Test of atacarAlMostruo method, of class Batalla.
     */
    @Test
    public void testAtacarAlMostruo() {
        System.out.println("atacarAlMostruo");
        int eleccionJugador = 0;
        Batalla instance = new Batalla();
        instance.atacarAlMostruo(eleccionJugador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of atacarAlHeroe method, of class Batalla.
     */
    @Test
    public void testAtacarAlHeroe() {
        System.out.println("atacarAlHeroe");
        int numero = 0;
        Batalla instance = new Batalla();
        instance.atacarAlHeroe(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of usarItem method, of class Batalla.
     */
    @Test
    public void testUsarItem() {
        System.out.println("usarItem");
        int eleccionJugador = 0;
        Batalla instance = new Batalla();
        instance.usarItem(eleccionJugador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turnoAleatorio method, of class Batalla.
     */
    @Test
    public void testTurnoAleatorio() {
        System.out.println("turnoAleatorio");
        Batalla instance = new Batalla();
        boolean expResult = false;
        boolean result = instance.turnoAleatorio();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of turnos method, of class Batalla.
     */
    @Test
    public void testTurnos() {
        System.out.println("turnos");
        int eleccionJugador = 0;
        Batalla instance = new Batalla();
        instance.turnos(eleccionJugador);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of lucha method, of class Batalla.
     */
    @Test
    public void testLucha() {
        System.out.println("lucha");
        Batalla instance = new Batalla();
        int expResult = 0;
        int result = instance.lucha();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEnemigos method, of class Batalla.
     */
    @Test
    public void testGetEnemigos() {
        System.out.println("getEnemigos");
        Batalla instance = new Batalla();
        Queue expResult = null;
        Queue result = instance.getEnemigos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEnemigos method, of class Batalla.
     */
    @Test
    public void testSetEnemigos() {
        System.out.println("setEnemigos");
        Queue enemigos = null;
        Batalla instance = new Batalla();
        instance.setEnemigos(enemigos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
