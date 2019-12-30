
package Models;


public class detallePedido {
    private int id_detalle_pedido;
    private int id_pedido;
    private int id_producto;
    private int cantidad_producto;
    private float subtotal;

    public detallePedido() {
    }

    public detallePedido(int id_detalle_pedido, int id_pedido, int id_producto, int cantidad_producto, float subtotal) {
        this.id_detalle_pedido = id_detalle_pedido;
        this.id_pedido = id_pedido;
        this.id_producto = id_producto;
        this.cantidad_producto = cantidad_producto;
        this.subtotal = subtotal;
    }

    public int getId_detalle_pedido() {
        return id_detalle_pedido;
    }

    public void setId_detalle_pedido(int id_detalle_pedido) {
        this.id_detalle_pedido = id_detalle_pedido;
    }

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }
    
    
}
