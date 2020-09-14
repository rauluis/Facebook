package elrizo.com.facebook;

public class publicacionP {
    private String nombre;
    private String fecha;
    private int imgPerfil;
    private String comentario;
    private int imgpublicada;



    public publicacionP(){

    }

    public publicacionP(String nombre, String fecha, int imgPerfil, String comentario, int imgpublicada) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.imgPerfil = imgPerfil;
        this.comentario = comentario;
        this.imgpublicada = imgpublicada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getImgPerfil() {
        return imgPerfil;
    }

    public void setImgPerfil(int imgPerfil) {
        this.imgPerfil = imgPerfil;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getImgpublicada() {
        return imgpublicada;
    }

    public void setImgpublicada(int imgpublicada) {
        this.imgpublicada = imgpublicada;
    }
}

