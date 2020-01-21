package strategy;

import interfaces.Zooimpl;
import animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class ZooAdministration {


    List<Zooimpl> zoos = new ArrayList<>();


    public ZooAdministration(){

    }

    public void PrintZoo(){
        for (Zooimpl zoo : zoos) {
            zoo.printPark();
        }

    }

    public void addZoo(Zooimpl zoo) {
        zoos.add(zoo);

    }

    public void addToZoo(Animal animal) {
        for (Zooimpl zoo : zoos) {
            zoo.addAnimal(animal);
        }

    }


}
