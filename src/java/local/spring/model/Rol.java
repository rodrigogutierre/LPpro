package local.spring.model;
// Generated 03/07/2017 01:54:50 AM by Hibernate Tools 4.3.1



/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private int idrol;
     private char rol;
     private Usuario usuario;

    public Rol() {
    }

	
    public Rol(int idrol, char rol) {
        this.idrol = idrol;
        this.rol = rol;
    }
    public Rol(int idrol, char rol, Usuario usuario) {
       this.idrol = idrol;
       this.rol = rol;
       this.usuario = usuario;
    }
   
    public int getIdrol() {
        return this.idrol;
    }
    
    public void setIdrol(int idrol) {
        this.idrol = idrol;
    }
    public char getRol() {
        return this.rol;
    }
    
    public void setRol(char rol) {
        this.rol = rol;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }




}


