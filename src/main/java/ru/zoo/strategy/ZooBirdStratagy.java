package ru.zoo.strategy;

import org.apache.commons.lang3.StringUtils;
import ru.zoo.animal.Animal;
import ru.zoo.animal.Bird;


public class ZooBirdStratagy implements ZooAddStrategy {

    @Override
    public boolean shouldAddAnimalToPark(Animal animal) {

        if(StringUtils.startsWithIgnoreCase(animal.getName(), "А")){
            return animal instanceof Bird;
        }else
            return false;
    }
}
