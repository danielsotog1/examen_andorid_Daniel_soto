package objetos;

import java.util.Arrays;

public class Animal {

    private int id;
    private String[] animal = {"Animal Domestico", "Animal Salvaje ", "Otro"};
    private int[] costo = {25000, 45000, 18000};

    public Animal() {
        id = 1;

    }

    public Animal(int id, String[] animal) {
        this.id = id;
        this.animal = animal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getAnimal() {
        return animal;
    }

    public void setAnimal(String[] animal) {
        this.animal = animal;
    }


    public int[] getCosto() {
        return costo;
    }

    public void setCosto(int[] costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", animal=" + Arrays.toString(animal) +
                ", costo=" + Arrays.toString(costo) +
                '}';
    }
}