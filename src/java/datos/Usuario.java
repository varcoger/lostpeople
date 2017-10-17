package datos;
// Generated 17-oct-2017 1:11:48 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private int usuarioid;
     private String nombre;
     private String apellido;
     private String sexo;
     private String email;
     private String pass;
     private String estado;
     private Date fechacre;
     private Date fechamod;
     private Set anuncios = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(int usuarioid, String nombre, String apellido, String email, String pass) {
        this.usuarioid = usuarioid;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.pass = pass;
    }
    public Usuario(int usuarioid, String nombre, String apellido, String sexo, String email, String pass, String estado, Date fechacre, Date fechamod, Set anuncios) {
       this.usuarioid = usuarioid;
       this.nombre = nombre;
       this.apellido = apellido;
       this.sexo = sexo;
       this.email = email;
       this.pass = pass;
       this.estado = estado;
       this.fechacre = fechacre;
       this.fechamod = fechamod;
       this.anuncios = anuncios;
    }
   
    public int getUsuarioid() {
        return this.usuarioid;
    }
    
    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getSexo() {
        return this.sexo;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPass() {
        return this.pass;
    }
    
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Date getFechacre() {
        return this.fechacre;
    }
    
    public void setFechacre(Date fechacre) {
        this.fechacre = fechacre;
    }
    public Date getFechamod() {
        return this.fechamod;
    }
    
    public void setFechamod(Date fechamod) {
        this.fechamod = fechamod;
    }
    public Set getAnuncios() {
        return this.anuncios;
    }
    
    public void setAnuncios(Set anuncios) {
        this.anuncios = anuncios;
    }




}


