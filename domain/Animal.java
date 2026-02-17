
import java.io.*;
import java.util.*;
public class Animal {
    protected String name;
    protected int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eat() {
        System.out.println(name + " їсть.");
    }

    public void move() {
        System.out.println(name + " рухається.");
    }

    public void makeSound() {
        System.out.println(name + " видає звук.");
    }

    @Override
    public String toString() {
        return "Тварина: " + name + ", вага: " + weight + " кг";
}