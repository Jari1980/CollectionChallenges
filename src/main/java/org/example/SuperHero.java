package org.example;

public class SuperHero implements Comparable<SuperHero>{
    private int id;
    private String name;
    private int age;

    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(SuperHero superHero) {
        if(this.age > superHero.getAge()){
            return 1;
        }
        else if(this.age < superHero.getAge()){
            return -1;
        }
        else{
            return 0;
        }
    }
}
