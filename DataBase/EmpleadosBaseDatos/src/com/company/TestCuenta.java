package com.company;
import java.sql.*;

public class TestCuenta {
    private static final String CREATE_TABLE = "DROP TABLE IF EXISTS CUENTA; CREATE TABLE CUENTA" +
            "(" +
            "ID PRIMARY KEY, "+
            "NOMBRE VARCHAR(30) NOT NULL,"+
            "NUMERO_CUENTA NUMERIC(10, 2) NOT NULL,"+
            "SALDO INT NOT NULL"+
            ")";

    private static final String INSERT_VALUES = "INSERT INTO CUENTA(ID, NOMBRE, NUMERO_CUENTA, SALDO) " +
            "VALUES(?,?,?,?)";

    private static final String UPDATE_VALUES = "UPDATE SET SALDO = ? WHERE ID = ?";
    public static Connection getConnection() throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        return connection;
    }
    public static void main(String[] args) throws Exception{
        Cuenta cuenta = new Cuenta(1, "Oliverio", 200);
        Connection connection = getConnection();

        try{
            Statement stm = connection.createStatement();
            stm.execute(CREATE_TABLE);

            PreparedStatement psmtm = connection.prepareStatement(INSERT_VALUES);
            psmtm.setInt(1,1);
            psmtm.setString(2, "Oliverio");
            psmtm.setDouble(3, 1);
            psmtm.setInt(4, 200);

            psmtm.executeUpdate();

            String sql = "SELECT * FROM CUENTA";
            ResultSet rd = stm.executeQuery(sql);
            while(rd.next()){
                System.out.println(rd.getInt(1)+rd.getString(2));
            }
        }catch (Exception e){
            connection.rollback();
        }finally {
            connection.close();
        }
    }


}
