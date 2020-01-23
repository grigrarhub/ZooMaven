package ru.zoo;

import org.apache.commons.lang3.StringUtils;
import ru.zoo.animal.Bird;
import ru.zoo.animal.Dog;
import ru.zoo.service.Zoo;
import ru.zoo.service.ZooAdministration;
import ru.zoo.service.ZooImpl;
import ru.zoo.strategy.ZooBirdStratagy;
import ru.zoo.strategy.ZooDogStratagy;


public class Main {
    public static void main(String[] args) {

        ZooAdministration administration = new ZooAdministration();
        Zoo birdZoo = new ZooImpl(new ZooBirdStratagy());
        Zoo dogZoo = new ZooImpl(new ZooDogStratagy());
        administration.addZoo(birdZoo);
        administration.addZoo(dogZoo);

        administration.addToZoo(new Bird("Арома", "муж", 3, 20, "Россия"));
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


