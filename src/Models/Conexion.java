/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    public Connection conn;

    public Connection getConnection() {
        String db = "snx";
        String un = "sa";
        String pass = "alonso";
//Javier\\SQLEXPRESS       DESKTOP-O604CQ4\\SQLEXPRESS
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://DESKTOP-VMJU37F\\SQLEXPRESS:1433;databaseName=" + db + ";user=" + un + ";password=" + pass + ";";
            conn = DriverManager.getConnection(connectionUrl);
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        return conn;
    }

}

