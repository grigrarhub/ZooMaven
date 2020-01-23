package ru.zoo.service;

import ru.zoo.animal.Animal;
import ru.zoo.strategy.ZooAddStrategy;

import java.util.HashSet;
import java.util.Set;

public class ZooImpl implements Zoo {
    private final ZooAddStrategy strategy;
    private Set<Animal> park = new HashSet<>();

    public ZooImpl(ZooAddStrategy strategy) {

        this.strategy = strategy;
    }

    @Override
    public void addAnimal(Animal animal) {
        if(strategy.shouldAddAnimalToPark(animal))
            park.add(animal);
    }

    @Override
    public String getAnimalsByType(Animal animal) {
        return animal.getTypeAnimal();
    }

    @Override
    public void printPark() {
        for (Animal animal: park) {
            System.out.println(animal.sayHallo());
        }

    }

    @Override
    public Set<Animal> getPark() {
        return park;
    }


}
