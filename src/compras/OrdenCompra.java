package compras;
//importa el paquete de gestionHumana
import gestionHumana.Empleado;
import java.util.ArrayList;
//se nombra la clase OrdenCompra
public class OrdenCompra   {
//se declaran los accesos de los atributos de la clase, todos privados menos el codigo
    public int codigo;
    private String tipo;
    private  Empleado comprador;
    private ArrayList<Producto> productos;

    public OrdenCompra(int codigo, String tipo, Empleado comprador,
            ArrayList<Producto> productos) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.comprador = comprador;
        this.productos = productos;
        Producto.totalProductosPedidos += productos.size();
    }
//se asigna public ya que es un metodo
    public void agregarProducto(Producto producto) {
        if (producto.tipo.equals(tipo)) {
            productos.add(producto);
            Producto.totalProductosPedidos++;
        }
    }

    public void retirarProducto(Empleado empleado, Producto producto) {
        if (!empleado.tengoPermiso()) {
            return;
        }
        retirarProducto(producto);
    }

    private void retirarProducto(Producto producto) {
        for (int i = 0; i < productos.size(); i++) {
            if (producto.getCodigo() == productos.get(i).getCodigo()) {
                productos.remove(i);
                Producto.totalProductosPedidos--;
                producto.imprimirNombre();
                System.out.println(" retirado");
                break;
            }
        }
    }
//se rellena con void ya que no retorna nada, sino que realiza un proceso
    public void descontar() {
        Producto.totalProductosPedidos -= productos.size();
    }

}
