package ru.zoo.strategy;

import org.apache.commons.lang3.StringUtils;
import ru.zoo.animal.Animal;
import ru.zoo.animal.Bird;


public class ZooBirdStratagy implements ZooAddStrategy {

    @Override
    public boolean shouldAddAnimalToPark(Animal animal) {
        
        if(StringUtils.indexOf(animal.getName(), 'а')==0 ||
                StringUtils.indexOf(animal.getName(), 'А')==0){
            return animal instanceof Bird;
        }else
            return false;
    }
}
