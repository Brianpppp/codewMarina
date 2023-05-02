package UF4.empresa;

public class transportista {
    private String nombre;
    private String telefono;
    private  int nomLicencia;

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     * @return
     */
    public transportista setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    /**
     *
     * @return
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     *
     * @param telefono
     * @return
     */
    public transportista setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    /**
     *
     * @return
     */
    public int getNomLicencia() {
        return nomLicencia;
    }

    /**
     *
     * @param nomLicencia
     * @return
     */
    public transportista setNomLicencia(int nomLicencia) {
        this.nomLicencia = nomLicencia;
        return this;
    }

    /**
     *
     * @param c
     */
    public void assignarEncarrec(String c ){

    }
}
