package models;

import java.util.ArrayList;

public abstract class Play {

    private int id;
    private String name;
    private String writer;
    private ArrayList<Performer> performers;
    private int performances;

    public Play() {
    }

    public Play(String name, String writer, ArrayList<Performer> performers, int performances) {
        this.name = name;
        this.writer = writer;
        this.performers = performers;
        this.performances = performances;
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

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public void setPerformers(ArrayList<Performer> performers) {
        this.performers = performers;
    }

    public int getPerformances() {
        return performances;
    }

    public void setPerformances(int performances) {
        this.performances = performances;
    }
}
