
package Models;


public class Pedidos {
    private int id_pedido;
    private int id_cliente;
    private String Estado;
    private String Municipio;
    private String Direccion;
    private String Codigo_Postal;
    private String Telefono;
    private String Hecho;
    private String Actualizado;
    private String Estado_Actual;
    private double Monto;

    public Pedidos() {
    }

    public Pedidos(int id_pedido, int id_cliente, String Estado, String Municipio, String Direccion, String Codigo_Postal, String Telefono, String Hecho, String Actualizado, String Estado_Actual, double Monto) {
        this.id_pedido = id_pedido;
        this.id_cliente = id_cliente;
        this.Estado = Estado;
        this.Municipio = Municipio;
        this.Direccion = Direccion;
        this.Codigo_Postal = Codigo_Postal;
        this.Telefono = Telefono;
        this.Hecho = Hecho;
        this.Actualizado = Actualizado;
        this.Estado_Actual = Estado_Actual;
        this.Monto=Monto;
    }

    public Double getMonto() {
        return Monto;
    }

    public void setMonto(Double Monto) {
        this.Monto = Monto;
    }
    

    public int getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(int id_pedido) {
        this.id_pedido = id_pedido;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String Municipio) {
        this.Municipio = Municipio;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCodigo_Postal() {
        return Codigo_Postal;
    }

    public void setCodigo_Postal(String Codigo_Postal) {
        this.Codigo_Postal = Codigo_Postal;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getHecho() {
        return Hecho;
    }

    public void setHecho(String Hecho) {
        this.Hecho = Hecho;
    }

    public String getActualizado() {
        return Actualizado;
    }

    public void setActualizado(String Actualizado) {
        this.Actualizado = Actualizado;
    }

    public String getEstado_Actual() {
        return Estado_Actual;
    }

    public void setEstado_Actual(String Estado_Actual) {
        this.Estado_Actual = Estado_Actual;
    }
    
    
}
