package animal;

import animal.Animal;

public class Dog extends Animal {
    private static final String typeAnimal = "Собака";
    private String breed;
    private String color;

    public Dog(String name, String sex, int age, String breed, String color) {
        setName(name);
        setSex(sex);
        setAge(age);
        setColor(color);
        setBreed(breed);
    }

    public String getTypeAnimal() {
        return typeAnimal;
    }

    public String sayHallo() {
        return "Привет, я " + typeAnimal + " " + getName();
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public String getColor() {
        return color;
    }
}
