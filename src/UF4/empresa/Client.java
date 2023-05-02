package UF4.empresa;

public class Client {
    private String nom;
    private String adreça;
    private String telefon;
    private String email;

    public String getNom() {
        return nom;
    }

    /**
     *
     * @param nom
     * @return
     */
    public Client setNom(String nom) {
        this.nom = nom;
        return this;
    }

    /**
     *
     * @return
     */
    public String getAdreça() {
        return adreça;
    }

    /**
     *
     * @param adreça
     * @return
     */
    public Client setAdreça(String adreça) {
        this.adreça = adreça;
        return this;
    }

    /**
     *
     * @return
     */
    public String getTelefon() {
        return telefon;
    }

    /**
     *
     * @param telefon
     * @return
     */
    public Client setTelefon(String telefon) {
        this.telefon = telefon;
        return this;
    }

    /**
     *
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * @return
     */
    public Client setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     *
     * @param encarrec
     */
    public void assinarEncarrec(String encarrec){

    }

    /**
     *
     * @param encarrec
     */
    public void anularEncarrwc( String encarrec){

    }
}

