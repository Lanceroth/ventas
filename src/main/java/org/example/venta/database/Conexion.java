package org.example.venta.database;


import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    private Connection conn=null;

    public java.sql.Connection getConn() {
        return conn;
    }

    public void connect(){
        try{
            String sURL = "jdbc:mysql://localhost:3306/venta";
            conn = DriverManager.getConnection(sURL,"root","root");
            conn.setAutoCommit(false);
        }catch (Exception ex){
            ex.printStackTrace();
        }

    }



}
