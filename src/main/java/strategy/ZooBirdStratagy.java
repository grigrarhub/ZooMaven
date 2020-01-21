package strategy;

import animal.Animal;
import animal.Bird;
import interfaces.ZooAddStrategy;

public class ZooBirdStratagy implements ZooAddStrategy {

    @Override
    public boolean shouldAddAnimalToPark(Animal animal) {
        return animal instanceof Bird;
    }
}
