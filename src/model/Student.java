package model;

public class Student { String name;
    int id;
    int age;
    int rating;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.rating = rating;
    }
}

