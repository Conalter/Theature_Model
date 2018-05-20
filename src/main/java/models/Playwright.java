package models;

import sun.font.Script;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age")
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @OneToMany(mappedBy = "playwright")
    public ArrayList<Script> getScripts() {
        return scripts;
    }

    public void setScripts(ArrayList<Script> scripts) {
        this.scripts = scripts;
    }
}
