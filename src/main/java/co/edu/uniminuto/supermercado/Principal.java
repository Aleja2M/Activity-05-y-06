
package co.edu.uniminuto.supermercado;

import co.edu.uniminuto.dao.Conexion1;
import co.edu.uniminuto.dao.ProductoDao;
import co.edu.uniminuto.entidades.Producto;

/**
 *
 * @author sonia
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*  Conexion1 conexion= new Conexion1();
        conexion.getConectar1();    */
      int cantidad=2;
      double precio=3;
      Producto producto;
      Producto producto = new Producto("Arroz",cantidad,precio);
      ProductoDao dao=new ProductoDao();
      dao.registrarProducto(producto);
    }
    
}
