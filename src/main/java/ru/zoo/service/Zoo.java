package ru.zoo.service;

import ru.zoo.animal.Animal;

import java.util.Set;

public interface Zoo {

    void addAnimal(Animal animal);

    String getAnimalsByType(Animal animal);

    void printPark();

    Set<Animal> getPark();
}
