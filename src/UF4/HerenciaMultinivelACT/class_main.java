package UF4.HerenciaMultinivelACT;

public class class_main {
    public static void main(String args[]) {
        Arona coche=new Arona();

     coche.vehicleType();
        coche.brand();
        coche.speed();
        System.out.println("color car is " + coche.getColor());
        System.out.println(" KM the car is " + coche.getKm());

    }
}
