package datos;
// Generated 16-oct-2017 23:50:06 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Comentario generated by hbm2java
 */
public class Comentario  implements java.io.Serializable {


     private int comentarioid;
     private Anuncio anuncio;
     private String descripcion;
     private Date fechacre;
     private Date fechamod;

    public Comentario() {
    }

	
    public Comentario(int comentarioid, Anuncio anuncio) {
        this.comentarioid = comentarioid;
        this.anuncio = anuncio;
    }
    public Comentario(int comentarioid, Anuncio anuncio, String descripcion, Date fechacre, Date fechamod) {
       this.comentarioid = comentarioid;
       this.anuncio = anuncio;
       this.descripcion = descripcion;
       this.fechacre = fechacre;
       this.fechamod = fechamod;
    }
   
    public int getComentarioid() {
        return this.comentarioid;
    }
    
    public void setComentarioid(int comentarioid) {
        this.comentarioid = comentarioid;
    }
    public Anuncio getAnuncio() {
        return this.anuncio;
    }
    
    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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




}


