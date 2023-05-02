package UF4.HerenciaMultinivelACT;

public class Car {

    private int id;
    public Car()
    {
        System.out.println("Class Car");
    }
    public void vehicleType()
    {
        System.out.println("Vehicle Type: Car");
    }

    /**
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * @return
     */
    public Car setId(int id) {
        this.id = id;
        return this;
    }
}
