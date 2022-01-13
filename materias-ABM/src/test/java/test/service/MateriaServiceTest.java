package test.service;

import dao.ConfiguracionJDBC;
import dao.impl.EstudianteDaoH2;
import model.Materia;
import org.junit.Assert;
import org.junit.Test;
import service.MateriasService;

public class MateriaServiceTest {
    public MateriasService materiasService = new MateriasService(new EstudianteDaoH2(new ConfiguracionJDBC()));

    @Test
    public void guardarMateria () throws Exception {
        Materia materia = new Materia("Matematica");
        Materia materia1 = materiasService.guardar(materia);
        Assert.assertTrue(materia1.getId() != null);
    }
}
