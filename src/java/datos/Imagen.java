package datos;
// Generated 16-oct-2017 23:50:06 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Imagen generated by hbm2java
 */
public class Imagen  implements java.io.Serializable {


     private int imagenid;
     private String nombre;
     private Date fechaingreso;
     private String dirarchivo;
     private String exencionimg;
     private String estado;
     private Set anuncios = new HashSet(0);

    public Imagen() {
    }

	
    public Imagen(int imagenid) {
        this.imagenid = imagenid;
    }
    public Imagen(int imagenid, String nombre, Date fechaingreso, String dirarchivo, String exencionimg, String estado, Set anuncios) {
       this.imagenid = imagenid;
       this.nombre = nombre;
       this.fechaingreso = fechaingreso;
       this.dirarchivo = dirarchivo;
       this.exencionimg = exencionimg;
       this.estado = estado;
       this.anuncios = anuncios;
    }
   
    public int getImagenid() {
        return this.imagenid;
    }
    
    public void setImagenid(int imagenid) {
        this.imagenid = imagenid;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechaingreso() {
        return this.fechaingreso;
    }
    
    public void setFechaingreso(Date fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
    public String getDirarchivo() {
        return this.dirarchivo;
    }
    
    public void setDirarchivo(String dirarchivo) {
        this.dirarchivo = dirarchivo;
    }
    public String getExencionimg() {
        return this.exencionimg;
    }
    
    public void setExencionimg(String exencionimg) {
        this.exencionimg = exencionimg;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public Set getAnuncios() {
        return this.anuncios;
    }
    
    public void setAnuncios(Set anuncios) {
        this.anuncios = anuncios;
    }




}


