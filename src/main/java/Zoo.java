import animal.Animal;
import animal.Bird;
import animal.Dog;
import interfaces.ZooAddStrategy;
import interfaces.Zooimpl;
import strategy.ZooBirdStratagy;
import strategy.ZooDogStratagy;
import java.util.HashSet;
import java.util.Set;

class Zoo {
    public static void main(String[] args) {
        ZooAdministration administration = new ZooAdministration();
        Zooimpl birdZoo = new Zoopark(new ZooBirdStratagy());
        Zooimpl dogZoo = new Zoopark(new ZooDogStratagy());
        administration.addZoo(birdZoo);
        administration.addZoo(dogZoo);

        administration.addToZoo(new Dog("Вася", "муж", 12, "дворняга", "белый"));
        administration.addToZoo(new Dog("Дуся", "жен", 2, "пудель", "черный"));
        administration.addToZoo(new Bird("Рома", "муж", 3, 20, "Россия"));
        administration.addToZoo(new Bird("Лиза", "жен", 5, 15, "Африка"));
        administration.addToZoo(new Bird("Лиза", "жен", 5, 15, "Африка"));
        administration.addToZoo(new Dog("Лиза", "жен", 5, "дворняга", "белый"));
        administration.addToZoo(new Bird(new String("Лиза"), "жен", 5, 15, "Африка"));
        administration.PrintZoo();

    }
}
// Изменения в файле


class Zoopark implements Zooimpl   {
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

