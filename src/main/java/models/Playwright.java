package models;

import sun.font.Script;

import java.util.ArrayList;

public abstract class Playwright {


    private int id;
    private String name;
    private int age;
    private ArrayList<Script> scripts;

    public Playwright() {
    }

    public Playwright(String name, int age, ArrayList<Script> scripts) {
        this.name = name;
        this.age = age;
        this.scripts = scripts;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public ArrayList<Script> getScripts() {
        return scripts;
    }

    public void setScripts(ArrayList<Script> scripts) {
        this.scripts = scripts;
    }
}
