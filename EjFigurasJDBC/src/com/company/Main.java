package com.company;
import java.sql.*;
public class Main {

    public static void main(String[] args) throws Exception{
        Connection connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", "");
        Statement stm = connection.createStatement();

        String tabla = "DROP TABLE IF EXISTS FIGURAS;" +
                "CREATE TABLE FIGURAS (ID INT PRIMARY KEY, NAME VARCHAR(20), COLOR VARCHAR(20))";
        String figura1 = "INSERT INTO FIGURAS VALUES (1, 'CIRCULO', 'ROJO')";
        String figura2 = "INSERT INTO FIGURAS VALUES (2, 'CIRCULO', 'BLANCO')";
        String figura3 = "INSERT INTO FIGURAS VALUES (3, 'CUADRADO', 'AZUL')";
        String figura4 = "INSERT INTO FIGURAS VALUES (4, 'CUADRADO', 'AMARILLO')";
        String figura5 = "INSERT INTO FIGURAS VALUES (5, 'CUADRADO', 'VERDE')";

        stm.execute(tabla);
        stm.execute(figura1);
        stm.execute(figura2);
        stm.execute(figura3);
        stm.execute(figura4);
        stm.execute(figura5);

        String allDatos = "SELECT * FROM FIGURAS";
        ResultSet allData = stm.executeQuery(allDatos);

        while (allData.next()){
            System.out.println(allData.getInt(1) + " " + allData.getString(2) + " " + allData.getString(3));
        }

        String circuloRojo = "SELECT * FROM FIGURAS WHERE FIGURAS.COLOR = 'ROJO' AND FIGURAS.NAME = 'CIRCULO'";
        ResultSet rd = stm.executeQuery(circuloRojo);

        while (rd.next()){
            System.out.println(rd.getInt(1) + " " + rd.getString(2) + " " + rd.getString(3));
        }
    }
}
