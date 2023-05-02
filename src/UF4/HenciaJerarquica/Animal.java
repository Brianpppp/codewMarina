package UF4.HenciaJerarquica;

public class Animal {
    int id;

    /**
     *
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     */
    public void sound() {
        System.out.println("By default it is mute");
    }
}
