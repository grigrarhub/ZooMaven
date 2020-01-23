package ru.zoo.animal;

import java.util.Objects;

public abstract class Animal {
    private static final String typeAnimal = " ";
    private String name;
    private String sex;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name) &&
                Objects.equals(sex, animal.sex);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    public abstract String sayHallo();

    void setName(String name) {
        this.name = name;
    }

    void setSex(String sex) {
        this.sex = sex;
    }

    void setAge(int age) {
        this.age = age;
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    int getAge() {
        return age;
    }

}
