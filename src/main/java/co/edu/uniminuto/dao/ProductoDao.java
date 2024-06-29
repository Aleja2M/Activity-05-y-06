package co.edu.uniminuto.dao;

import co.edu.uniminuto.entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ProductoDao {

    Conexion1 conexion;
    PreparedStatement statement;

    public ProductoDao() {
        conexion = new Conexion1();
        this.statement = null;
    }

    public Producto registrarProducto(Producto producto) {
        Connection cone = conexion.getConectar1();
        int activo = 1;
        String query = "INSER INTO inventarios VALUES (null,?,?,?,?)";
        try {
            if (this.statement == null) {
                this.statement = cone.prepareStatement(query);
                this.statement.setString(1, producto.getNombre());
                this.statement.setInt(2, producto.getCantidad());
                this.statement.setDouble(3, producto.getPrecios());
                this.statement.setInt(4, activo);
                int calculo = this.statement.executeUpdate();
                if (calculo > 0) {
                    JOptionPane.showMessageDialog(null, "Producto Registrado:" + calculo);
                }
            }
        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        } finally {
            if (cone != null) {
                try {
                    this.statement.close();
                    cone.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return producto;
    }

}
