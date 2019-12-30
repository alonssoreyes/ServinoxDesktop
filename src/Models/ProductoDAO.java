/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author alons
 */
public class ProductoDAO {
    int r;
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion cn = new Conexion();
    
    
    public List listart() {
        
        List<Producto> lista = new ArrayList<>();
        String sql = "SELECT * FROM  Producto";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while(rs.next()){
                Producto pro = new Producto();
                pro.setId_producto(rs.getInt(1));
                pro.setId_categoria(rs.getInt(2));
                pro.setNombre_Producto(rs.getString(3));
                pro.setDescripcion_Producto(rs.getString(4));
                pro.setMarca(rs.getString(5));
                pro.setStock(rs.getInt(6));
                pro.setPrecio(rs.getFloat(7));
                pro.setImagen_Producto(rs.getString(8));
                pro.setCreado(rs.getString(9));
                pro.setActualizado(rs.getString(10));
                
                lista.add(pro);
            }
        } catch (Exception e) {

        }

        return lista;
    }
    //Agrega un producto a la base de datos
    public int add(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO Producto (id_categoria,Nombre_Producto,Descripcion_Producto,Marca,Stock,Precio,Imagen_Producto,created_at,updated_at)"
                + "VALUES(?,?,?,?,?,?,?,GETDATE(),GETDATE())";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            
            r = ps.executeUpdate();
            
            if(r!=0){
                JOptionPane.showMessageDialog(null, "Producto agregado");
                        
            }else{
                JOptionPane.showMessageDialog(null, "Operacion fallida");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;

    }
    //Lista por id de un producto
    public Producto listarID(int id){
        Producto p = new Producto();
        String sql = "SELECT * FROM producto WHERE id_producto=?";
        
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            rs=ps.executeQuery();
            
            while(rs.next()){
                p.setId_producto(rs.getInt(1));
                p.setId_categoria(rs.getInt(2));
                p.setNombre_Producto(rs.getString(3));
                p.setDescripcion_Producto(rs.getString(4));
                p.setMarca(rs.getString(5));
                p.setStock(rs.getInt(6));
                p.setPrecio(rs.getFloat(7));
                p.setImagen_Producto(rs.getString(8));
                p.setCreado(rs.getString(9));
                p.setActualizado(rs.getString(10));
            }
            
        }catch(Exception e){
            
        }
        return p;
    }
    //Actualiza el producto
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE Producto SET id_categoria=?,"
                + "Nombre_Producto=?,"
                + "Descripcion_Producto=?,"
                + "Marca=?,"
                + "Stock=?,"
                + "Precio=?,"
                + "Imagen_Producto=?,"
                + "updated_at=GETDATE() WHERE id_producto=?";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[1]);
            ps.setObject(2, o[2]);
            ps.setObject(3, o[3]);
            ps.setObject(4, o[4]);
            ps.setObject(5, o[5]);
            ps.setObject(6, o[6]);
            ps.setObject(7, o[7]);
            ps.setObject(8, o[0]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;
    }
    // Metodo para establecer el stock de un producto a 0 en vez de eliminarlo
    public void eliminar(int id) {
        String sql= "UPDATE Producto SET Stock=0 WHERE id_producto=?";
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            
            ps.setInt(1,id);
            
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        
    }
}
