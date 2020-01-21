package interfaces;

import animal.Animal;

import java.util.Set;

public interface Zooimpl {

    void addAnimal(Animal animal);

    String getAnimalsByType(Animal animal);

    void printPark();

    Set<Animal> getPark();
}
