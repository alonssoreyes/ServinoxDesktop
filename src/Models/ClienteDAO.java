/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author alons
 */
public class ClienteDAO implements CRUD {

    Connection con;

    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public Cliente listarID(int id){
        Cliente c = new Cliente();
        String sql = "SELECT * FROM Cliente WHERE id_cliente=?";
        
        try{
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            
            rs = ps.executeQuery();
            while(rs.next()){
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setEmail(rs.getString(4));
                c.setPassword(rs.getString(5));
                c.setCreado(rs.getString(6));
                c.setActualizado(rs.getString(7));
            }
        }catch(Exception e){
            
        }
        return c;
    }
    
    @Override
    public List listart() {
        List<Cliente> lista = new ArrayList<>();
        String sql = "SELECT * FROM  cliente";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Cliente c = new Cliente();
                c.setId(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellidos(rs.getString(3));
                c.setEmail(rs.getString(4));
                c.setPassword(rs.getString(5));
                c.setCreado(rs.getString(6));
                c.setActualizado(rs.getString(7));

                lista.add(c);
            }
        } catch (Exception e) {

        }

        return lista;
    }

    @Override
    public int add(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO cliente (Nombre_cliente,Apellidos_Cliente,Email,Password,created_at,updated_at)"
                + "VALUES(?,?,?,?,GETDATE(),GETDATE())";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;

    }

    @Override
    public int actualizar(Object[] o) {
        int r = 0;
        String sql = "UPDATE cliente SET Nombre_Cliente=?,"
                + "Apellidos_Cliente=?,"
                + "Email=?,"
                + "Password=? WHERE id_cliente=?";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;
    }

    @Override
    public void eliminar(int id) {
        String sql= "DELETE FROM Cliente WHERE id_cliente=?";
        try{
            con = cn.getConnection();
            ps=con.prepareStatement(sql);
            
            ps.setInt(1,id);
            
            ps.executeUpdate();
        }catch(Exception e){
            
        }
        
    }

}
