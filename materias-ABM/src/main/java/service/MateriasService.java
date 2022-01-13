package service;

import dao.IDao;
import model.Materia;

import java.util.List;

public class MateriasService {
    private IDao<Materia> materiaIDao;

    public MateriasService(IDao<Materia> materiaIDao) {
        this.materiaIDao = materiaIDao;
    }

    public Materia guardar(Materia materia) throws Exception {
        return materiaIDao.guardar(materia);
    }

    public List<Materia> listarTodo() throws Exception {
        return materiaIDao.listarTodo();
    }
}
