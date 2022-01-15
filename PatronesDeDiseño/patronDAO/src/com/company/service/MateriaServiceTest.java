package com.company.service;

import com.company.dao.ConfiguracionJDBC;
import com.company.dao.impl.MateriaDaoH2;
import com.company.model.Materia;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MateriaServiceTest {

    @Test
    public void guardarMateria() throws Exception {
        MateriaService materiaService = new MateriaService(new MateriaDaoH2(new ConfiguracionJDBC()));
        Materia materia = new Materia("Backend");
        Materia materia1 = materiaService.guardar(materia);

        Assert.assertTrue(materia1.getId() != null);
    }

    @Test
    public void listarTodo() throws Exception{
        MateriaService materiaService = new MateriaService(new MateriaDaoH2(new ConfiguracionJDBC()));
        List<Materia> listaMaterias= materiaService.listarTodo();
        assertTrue(listaMaterias.size() >= 1);
        System.out.println(listaMaterias.size());
    }
}