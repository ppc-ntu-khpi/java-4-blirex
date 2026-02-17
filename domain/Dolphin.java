import java.io.*;
import java.util.*;

public class Dolphin extends MarineAnimal {
private String species;

    public Dolphin(String name, int weight, String species) {
        super(name, weight);
        this.species = species;
    }

    public void play() {
        System.out.println(name + " грається та стрибає над водою.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " видає клацаючі та свистячі звуки.");
    }

    @Override
    public String toString() {
        return "Дельфін: " + name + ", вид: " + species + ", вага: " + weight + " кг";
    }
}