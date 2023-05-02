package UF4.HerenciaMultinivelACT;

public class seat extends Car{
    private String model;

    public void speed()
    {
        System.out.println("Max: 90Kmph");
    }
    public void brand()
    {
        System.out.println("Brand: arona");
    }

    /**
     *
     * @return
     */
    public String getModel() {
        return model;
    }

    /**
     *
     * @param model
     * @return
     */
    public seat setModel(String model) {
        this.model = model;
        return this;
    }
}
