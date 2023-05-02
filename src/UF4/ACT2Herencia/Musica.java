package UF4.ACT2Herencia;

public class Musica extends Media {
    private String artista;
    private String estil;

    public String getArtista() {
        return artista;
    }

    public Musica setArtista(String artista) {
        this.artista = artista;
        return this;
    }

    public String getEstil() {
        return estil;
    }

    public Musica setEstil(String estil) {
        this.estil = estil;
        return this;
    }
}
