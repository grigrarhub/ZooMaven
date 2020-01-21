import animal.Animal;
import interfaces.ZooAddStrategy;
import interfaces.Zooimpl;

import java.util.HashSet;
import java.util.Set;

class Zoopark implements Zooimpl {
    private final ZooAddStrategy strategy;
    private Set<Animal> park = new HashSet<>();

    public Zoopark(ZooAddStrategy strategy) {

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
