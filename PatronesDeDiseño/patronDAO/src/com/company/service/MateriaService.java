package com.company.service;

import com.company.dao.IDao;
import com.company.model.Materia;

import java.util.List;

public class MateriaService {
    private IDao<Materia> materiaIDao;

    public MateriaService(IDao<Materia> materiaIDao) {
        this.materiaIDao = materiaIDao;
    }

    public Materia guardar(Materia materia) throws Exception {
        return materiaIDao.guardar(materia);
    }

    public List<Materia> listarTodo() throws Exception {
        return materiaIDao.listarTodo();
    }
}
