package ru.zoo.strategy;

import ru.zoo.animal.Animal;
import ru.zoo.animal.Dog;

public class ZooDogStratagy implements ZooAddStrategy {

    @Override
    public boolean shouldAddAnimalToPark(Animal animal) {
        return animal instanceof Dog;
    }
}
