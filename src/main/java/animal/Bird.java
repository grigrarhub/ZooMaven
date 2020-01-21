package animal;

public class Bird extends Animal {
    private static final String typeAnimal = "Птица";
    private int length;
    private String country;

    public String sayHallo() {
        return "Привет, я " + typeAnimal + " " + getName();
    }

    public Bird(String name, String sex, int age, int length, String country) {
        setName(name);
        setSex(sex);
        setAge(age);
        setCountry(country);
        setLength(length);
    }

    void setCountry(String country) {
        this.country = country;
    }

    void setLength(int length) {
        this.length = length;
    }

    String getCountry() {
        return country;
    }

    int getLength() {
        return length;
    }
}
