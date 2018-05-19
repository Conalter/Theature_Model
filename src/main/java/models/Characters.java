package models;

import java.util.ArrayList;

public abstract class Characters {

    private int id;
    private String name;
    private ArrayList<Play> plays;

    public Characters() {
    }

    public Characters(String name, ArrayList<Play> plays) {
        this.name = name;
        this.plays = plays;
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

    public ArrayList<Play> getPlays() {
        return plays;
    }

    public void setPlays(ArrayList<Play> plays) {
        this.plays = plays;
    }
}
