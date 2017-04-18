package com.app.classes.abstracts;

/**
 * Created by pivithuru on 4/6/17 9:39 AM.
 */
public abstract class Fighter {
    protected String name;
    protected int age;
    protected String country;

    public abstract void eat();

    public abstract void talk();

    public abstract void fight(String beast);

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String toString() {
        return "Name: " + name + "\tCountry: " + country;
    }
}
