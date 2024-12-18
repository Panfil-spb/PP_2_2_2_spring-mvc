package web.model;

public class Car {
    private int id;
    private int age;
    private String name;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }
}
