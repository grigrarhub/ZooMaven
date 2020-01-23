package ru.zoo.service;

import ru.zoo.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZooAdministration {


    List<Zoo> zoos = new ArrayList<>();


    public ZooAdministration(){

    }

    public void PrintZoo(){
        for (Zoo zoo : zoos) {
            zoo.printPark();
        }

    }

    public void addZoo(Zoo zoo) {
        zoos.add(zoo);

    }

    public void addToZoo(Animal animal) {
        for (Zoo zoo : zoos) {
            zoo.addAnimal(animal);
        }

    }


}
