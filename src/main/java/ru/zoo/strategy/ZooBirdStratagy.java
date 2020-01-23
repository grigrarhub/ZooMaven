package ru.zoo.strategy;

import org.apache.commons.lang3.StringUtils;
import ru.zoo.animal.Animal;
import ru.zoo.animal.Bird;


public class ZooBirdStratagy implements ZooAddStrategy {

    @Override
    public boolean shouldAddAnimalToPark(Animal animal) {

        if(StringUtils.left(animal.getName(),1).equals("а") ||
                StringUtils.left(animal.getName(),1).equals("А")){
            return animal instanceof Bird;
        }else
            return false;
    }
}
