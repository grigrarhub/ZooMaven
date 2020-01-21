package strategy;

import animal.Animal;
import animal.Dog;
import interfaces.ZooAddStrategy;

public class ZooDogStratagy implements ZooAddStrategy {

    @Override
    public boolean shouldAddAnimalToPark(Animal animal) {
        return animal instanceof Dog;
    }
}
