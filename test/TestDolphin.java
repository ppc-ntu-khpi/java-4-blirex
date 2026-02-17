import java.io.*;
import java.util.*;
public class TestDolphin {

    public static void main(String[] args) {

        Dolphin dolphin = new Dolphin("Григорій", 150, "Афаліна");

        System.out.println(dolphin);

        dolphin.eat();
        dolphin.move();
        dolphin.swim();
        dolphin.makeSound();
        dolphin.play();
    }
}