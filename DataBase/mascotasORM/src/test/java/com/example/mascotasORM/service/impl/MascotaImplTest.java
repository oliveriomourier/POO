package com.example.mascotasORM.service.impl;

import com.example.mascotasORM.entity.Mascota;
import com.example.mascotasORM.repository.IMascotaRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class MascotaImplTest {
    Mascota mascota1;
    Mascota mascota2;

    @Mock
    private IMascotaRepository mascotaRepository;

    @InjectMocks
    private MascotaImpl mascotaService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        mascota1 = new Mascota("perro", 10, 200);
        mascota2 = new Mascota("gato", 5, 100);
    }

    @Test
    void listarTodo() {
        when(mascotaRepository.findAll()).thenReturn(Arrays.asList(mascota1, mascota2));
        assertNotNull(mascotaService.listarTodo());
        assertEquals(2, mascotaService.listarTodo().size());
    }
}