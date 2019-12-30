/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


public class Empleado {
    private int id;
    private int nss;
    private String Nombre;
    private String Apellidos;
    private String Puesto;
    private String Email;
    private String Password;
    private String Telefono;
    private String Entrada;
    private String Modificado;
    
    public Empleado(){
        
    }

    public Empleado(int id, int nss, String Nombre, String Apellidos, String Puesto, String Email, String Password, String Telefono, String Entrada, String Modificado) {
        this.id = id;
        this.nss = nss;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Puesto = Puesto;
        this.Email = Email;
        this.Password = Password;
        this.Telefono = Telefono;
        this.Entrada = Entrada;
        this.Modificado = Modificado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNss() {
        return nss;
    }

    public void setNss(int nss) {
        this.nss = nss;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getPuesto() {
        return Puesto;
    }

    public void setPuesto(String Puesto) {
        this.Puesto = Puesto;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getEntrada() {
        return Entrada;
    }

    public void setEntrada(String Entrada) {
        this.Entrada = Entrada;
    }

    public String getModificado() {
        return Modificado;
    }

    public void setModificado(String Modificado) {
        this.Modificado = Modificado;
    }
    
}
