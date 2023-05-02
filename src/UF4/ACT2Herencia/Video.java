package UF4.ACT2Herencia;

public class Video extends Media{
    private String director;
    private String idioma;

    public String getDirector() {
        return director;
    }

    public Video setDirector(String director) {
        this.director = director;
        return this;
    }

    public String getIdioma() {
        return idioma;
    }

    public Video setIdioma(String idioma) {
        this.idioma = idioma;
        return this;
    }
}
