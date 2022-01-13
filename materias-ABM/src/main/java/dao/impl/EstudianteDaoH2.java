package dao.impl;

import dao.ConfiguracionJDBC;
import dao.IDao;
import model.Materia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EstudianteDaoH2 implements IDao<Materia> {
    private ConfiguracionJDBC configuracionJDBC;

    public EstudianteDaoH2(ConfiguracionJDBC configuracionJDBC) {
        this.configuracionJDBC = configuracionJDBC;
    }

    @Override
    public Materia guardar(Materia materia) throws Exception{
        Connection connection = configuracionJDBC.getConnection();
        Statement stm = connection.createStatement();
        String guardar = String.format("INSERT INTO materias(nombre) VALUES('%s')", materia.getNombre());
        try{
            stm.execute(guardar, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = stm.getGeneratedKeys();
            if(rs.next()){
                materia.setId(rs.getInt(1));
            }
            stm.close();
            connection.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return materia;
    }

    @Override
    public List<Materia> listarTodo() throws Exception{
        Connection connection = configuracionJDBC.getConnection();
        Statement stm = connection.createStatement();
        String listarTodo = String.format("SELECT * FROM materias");
        List<Materia> listaMaterias = new ArrayList<>();
        try{
            ResultSet rs = stm.executeQuery(listarTodo);
            while (rs.next()){
                listaMaterias.add(new Materia(rs.getInt(1), rs.getString(2)));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return listaMaterias;
    }
}
