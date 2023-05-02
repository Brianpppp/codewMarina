package UF4.HenciaJerarquica;

public class Cat extends Animal {
    /**
     * imprime el sonido del gato.
     */
    private void meow() {
        System.out.println("Cat '" + getId() + "' is meowing");
    }

    // Overriding super class behavior
    @Override
    /**
     *
     */
    public void sound() {
        meow();
    }
}
