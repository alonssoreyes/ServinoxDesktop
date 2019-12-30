
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class PedidosDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    int r=0;
    Pedidos p = new Pedidos();
    
    
    public String idPedido(){
        String idp="";
        String sql="SELECT * FROM pedido";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            
            rs=ps.executeQuery();
            
            while(rs.next()){
                idp=rs.getString(1);
            }
        }catch(Exception e){
            
        }
        return idp;
    }
    public List getPedido(int id){
        
        List<Pedidos> lista = new ArrayList<>();
        String idp="";
        String sql="SELECT * FROM pedido WHERE id_pedido=?";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            
            while(rs.next()){
                
                
                p.setId_cliente(rs.getInt(1));
                p.setId_pedido(rs.getInt(2));
                p.setTelefono(String.valueOf(rs.getInt(7)));
                p.setHecho(rs.getString(8));
                p.setActualizado(rs.getString(9));
                p.setEstado_Actual(rs.getString(10));
                p.setMonto(rs.getDouble(11));
                lista.add(p);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lista;
    }
    
    public int GuardarPedido(Pedidos p){
        Pedidos pedido = new Pedidos();
        String sql= "INSERT INTO Pedido(id_cliente,Estado,Municipio,Direccion,Codigo_Postal,Telefono,created_at,updated_at,Estado_Actual,Monto) "
                + "VALUES (?,?,?,?,?,?,GETDATE(),GETDATE(),?,?)";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, p.getId_cliente());
            ps.setString(2, "Jalisco");
            ps.setString(3, "Tlaquepaque");
            ps.setString(4, "Av. Lazaro Cardenas #10 Col. Alamo Industrial");
            ps.setInt(5, 45570);
            ps.setInt(6, 0);
            ps.setString(7, "Entregado");
            ps.setDouble(8, p.getMonto());
            r=ps.executeUpdate();
        }catch(Exception e){
            
        }
                
            
            
        
        return r;
    }
    
    
    
    public int guardarDetallePedido(detallePedido dp){
        String sql ="INSERT INTO detalle_pedido (id_pedido,id_producto,cantidad_producto,subtotal) "
                + "VALUES (?,?,?,?)";
        String reduceStock = "UPDATE Producto SET Stock-=? WHERE id_producto=?";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, dp.getId_pedido());
            ps.setInt(2, dp.getId_producto());
            ps.setInt(3, dp.getCantidad_producto());
            ps.setFloat(4, dp.getSubtotal());
            r=ps.executeUpdate();
            
            //Reducir stock
            ps=con.prepareStatement(reduceStock);
            ps.setInt(1, dp.getCantidad_producto());
            ps.setInt(2, dp.getId_producto());
            r=ps.executeUpdate();
        }catch(Exception e){
            
        }
        return r;
    }
    public List listart() {
        List<Pedidos> lista = new ArrayList<>();
        String sql = "SELECT * FROM  pedido ORDER BY id_pedido DESC";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Pedidos p = new Pedidos();
                p.setId_pedido(rs.getInt(1));
                p.setId_cliente(rs.getInt(2));
                p.setTelefono(String.valueOf(rs.getInt(7)));
                p.setHecho(rs.getString(8));
                p.setActualizado(rs.getString(9));
                p.setEstado_Actual(rs.getString(10));
                p.setMonto(rs.getDouble(11));

                lista.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
    public List listarDetalle(int id){
        List<detallePedido> lista = new ArrayList<>();
        String sql = "SELECT * FROM  detalle_pedido WHERE id_pedido=?";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {
                detallePedido dp = new detallePedido();
                dp.setId_pedido(rs.getInt(2));
                dp.setId_producto(rs.getInt(3));
                dp.setCantidad_producto(rs.getInt(4));
                dp.setSubtotal(rs.getInt(5));

                lista.add(dp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }
    public int actualizarPedido(String estado,int id){
        String sql = "UPDATE Pedido SET Estado_Actual=?, updated_at=GETDATE() WHERE id_pedido=?";
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            
            ps.setString(1, estado);
            ps.setInt(2, id);
            
            int r = ps.executeUpdate();
            if(r>0){
                JOptionPane.showMessageDialog(null, "Pedido Actualizado!");
            }else{
                JOptionPane.showMessageDialog(null, "Error al actualizar el pedido, intente nuevamente");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        return r;
    }
}
