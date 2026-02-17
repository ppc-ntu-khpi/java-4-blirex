
import java.io.*;
import java.util.*;

public class MarineAnimal extends Animal {

    public MarineAnimal(String name, int weight) {
        super(name, weight);
    }

    public void swim() {
        System.out.println(name + " пливе у воді.");
    }
}