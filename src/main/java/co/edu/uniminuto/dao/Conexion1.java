/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author sonia
 */
public class Conexion1 {

    private String usuario;
    private String contra;
    private String puerto;
    private String servidor;
    private String nombreDB;
    private String cadena;
    Connection conex;

    public Conexion1() {
        this.usuario = "root";
        this.contra = "";
        this.puerto = "3306";
        this.servidor = "localhost";
        this.nombreDB = "inventario";
        this.cadena = "jdbc:mysql://" + this.servidor + ":" + this.puerto + "/" + this.nombreDB;
        this.conex = null;
    }

    private Connection conectar1() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conex = DriverManager.getConnection(this.cadena, this.usuario, this.contra);
            JOptionPane.showMessageDialog(null, "Hay conexion");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay conexion" + e.getMessage());
        } finally {
        }
        return this.conex;
    }

    public Connection getConectar1() {
        return this.conectar1();
    }
}
