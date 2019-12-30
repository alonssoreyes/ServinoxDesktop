
package Models;


public class Cliente {
    private int id;
    private String Nombre;
    private String Apellidos;
    private String Email;
    private String Password;
    private String Creado;
    private String Actualizado;
    
    public Cliente(){
        
    }

    public Cliente(int id, String Nombre, String Apellidos, String Email, String Password, String Creado, String Actualizado) {
        this.id = id;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Email = Email;
        this.Password = Password;
        this.Creado = Creado;
        this.Actualizado = Actualizado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
