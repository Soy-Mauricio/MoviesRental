
package beans;

public class Usuario {
     private int username;
     private String contraseña;
     private String nombre;
     private String apellido;
     private String email;
     private double saldo;
     private boolean premiun;

    public Usuario(int username, String contraseña, String nombre, String apellido, String email, double saldo, boolean premiun) {
        this.username = username;
        this.contraseña = contraseña;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.saldo = saldo;
        this.premiun = premiun;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isPremiun() {
        return premiun;
    }

    public void setPremiun(boolean premiun) {
        this.premiun = premiun;
    }

    @Override
    public String toString() {
        return "Usuario{" + "username=" + username + ", contrase\u00f1a=" + contraseña + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email + ", saldo=" + saldo + ", premiun=" + premiun + '}';
    }
     
     
}
