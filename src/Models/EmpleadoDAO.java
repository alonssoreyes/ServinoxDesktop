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
public class EmpleadoDAO {
    PreparedStatement ps;
    ResultSet rs;
    
    Conexion con = new Conexion();
    Connection acceso;
    
    public Empleado validarEmpleado(String Email,String Pas){
        Empleado e = new Empleado();
        String sql = "SELECT * FROM Empleado WHERE Email_Empleado=? AND password=?";
        try{
            acceso=con.getConnection();
            ps=acceso.prepareStatement(sql);
            
            ps.setString(1, Email);
            ps.setString(2, Pas);
            
            rs = ps.executeQuery();
            
            while(rs.next()){
                e.setId(rs.getInt(1));
                e.setNss(rs.getInt(2));
                e.setNombre(rs.getString(3));
                e.setApellidos(rs.getString(4));
                e.setPuesto(rs.getString(5));
                e.setEmail(rs.getString(6));
                e.setPassword(rs.getString(7));
                e.setTelefono(rs.getString(8));
                
            }
        }catch(Exception ex){
            
        }
        return e;
    }
    public List getEmpleados(){
        List<Empleado> lista = new ArrayList();
        String sql = "SELECT * FROM Empleado";
        try{
            acceso=con.getConnection();
            ps=acceso.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()){
                Empleado e = new Empleado();
                e.setId(rs.getInt(1));
                e.setNss(rs.getInt(2));
                e.setNombre(rs.getString(3));
                e.setApellidos(rs.getString(4));
                e.setPuesto(rs.getString(5));
                e.setEmail(rs.getString(6));
                e.setPassword(rs.getString(7));
                e.setTelefono(rs.getString(8));
                e.setEntrada(rs.getString(9));
                lista.add(e);
                
            }
        }catch(Exception ex){
            
        }
        return lista;
    }
    public int agregar(Object[] o) {
        int r = 0;
        String sql = "INSERT INTO Empleado (NSS,Nombre_Empleado,Apellidos_Empleado,Puesto,Email_Empleado,password,Telefono_Empleado,created_at,updated_at)"
                + "VALUES(?,?,?,?,?,?,?,GETDATE(),GETDATE())";
        try {
            acceso = con.getConnection();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[0]);
            ps.setObject(2, o[1]);
            ps.setObject(3, o[2]);
            ps.setObject(4, o[3]);
            ps.setObject(5, o[4]);
            ps.setObject(6, o[5]);
            ps.setObject(7, o[6]);
            
            r = ps.executeUpdate();
            
            if(r!=0){
                JOptionPane.showMessageDialog(null, "Empleado agregado");
                        
            }else{
                JOptionPane.showMessageDialog(null, "Operacion fallida");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;

    }
    public int actualizar(Object[] o){
        int r =0;
        String sql = "UPDATE Empleado SET Nombre_Empleado=?,Apellidos_Empleado=?,Puesto=?,Email_Empleado=?,"
                + "password=?,Telefono_Empleado=?,updated_at=GETDATE() WHERE NSS=?";
        
        try {
            acceso = con.getConnection();
            ps = acceso.prepareStatement(sql);
            ps.setObject(1, o[1]);
            ps.setObject(2, o[2]);
            ps.setObject(3, o[3]);
            ps.setObject(4, o[4]);
            ps.setObject(5, o[5]);
            ps.setObject(6, o[6]);
            ps.setObject(7, o[0]);
            r = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }
}
