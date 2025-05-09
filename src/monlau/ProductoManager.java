
package monlau;

import monlau.dao.ProductoDAO;
import monlau.dao.ProductoDAOImpl;
import monlau.model.Producto;

public class ProductoManager {
    public static void main(String[] args) {
        ProductoDAO producto =new ProductoDAOImpl();
        
        //agregar nuevo producto
        // producto.insert(new Producto(200,"Pollo",10.0));

        // actualizar un producto
        // producto.update(new Producto(200, "Pollo", 20.0));

        // eliminar un producto
        producto.delete(new Producto(200));
        
        //obtener el producto con el ID = 100
        Producto p = producto.read(200);
        System.out.println(p);
    }
}
