package ru.zoo.strategy;

import ru.zoo.animal.Animal;

public interface ZooAddStrategy {
    boolean shouldAddAnimalToPark(Animal animal);
}
