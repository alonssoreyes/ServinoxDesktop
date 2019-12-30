
package Models;


public class Producto {
    private int id_producto;
    private int id_categoria;
    private String Nombre_Producto;
    private String Descripcion_Producto;
    private String Marca;
    private int Stock;
    private float Precio;
    private String Imagen_Producto;
    private String Creado;
    private String Actualizado;

    public Producto() {
    }

    public Producto(int id_producto, int id_categoria, String Nombre_Producto, String Descripcion_Producto, String Marca, int Stock, float Precio, String Imagen_Producto, String Creado, String Actualizado) {
        this.id_producto = id_producto;
        this.id_categoria = id_categoria;
        this.Nombre_Producto = Nombre_Producto;
        this.Descripcion_Producto = Descripcion_Producto;
        this.Marca = Marca;
        this.Stock = Stock;
        this.Precio = Precio;
        this.Imagen_Producto = Imagen_Producto;
        this.Creado = Creado;
        this.Actualizado = Actualizado;
    }
    

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNombre_Producto() {
        return Nombre_Producto;
    }

    public void setNombre_Producto(String Nombre_Producto) {
        this.Nombre_Producto = Nombre_Producto;
    }

    public String getDescripcion_Producto() {
        return Descripcion_Producto;
    }

    public void setDescripcion_Producto(String Descripcion_Producto) {
        this.Descripcion_Producto = Descripcion_Producto;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public String getImagen_Producto() {
        return Imagen_Producto;
    }

    public void setImagen_Producto(String Imagen_Producto) {
        this.Imagen_Producto = Imagen_Producto;
    }

    public String getCreado() {
        return Creado;
    }

    public void setCreado(String Creado) {
        this.Creado = Creado;
    }

    public String getActualizado() {
        return Actualizado;
    }

    public void setActualizado(String Actualizado) {
        this.Actualizado = Actualizado;
    }
    
    
}
