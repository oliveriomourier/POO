package com.company;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    static Animal leon;
    static Animal gato;

    @BeforeAll
    static void beforeAll(){
        leon = new Animal("Leon", "grande", 2500);
        gato = new Animal("Gato", "pequeño", 8);
    }

    @Test
    public void siElAnimalEsPesado(){
        assertTrue(leon.esPesado());
        assertFalse(gato.esPesado());
    }

    @Test
    public void soyUnGato(){
        assertEquals("Gato", gato.getTipo());
    }

    @Test
    public void soyUnLeon(){
        assertEquals("Leon", leon.getTipo());
    }
}