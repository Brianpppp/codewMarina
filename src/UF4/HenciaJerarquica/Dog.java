package UF4.HenciaJerarquica;

public class Dog extends Animal {
    /**
     * escribe el sonido del perro
     */
    private void bark() {
        System.out.println("Dog '" + getId() + "' is barking");
    }

    // Overriding super class behavior
    @Override
    public void sound() {
        bark();
    }
}

