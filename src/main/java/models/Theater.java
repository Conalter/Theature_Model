package models;

import java.util.ArrayList;

public abstract class Theater {

    private int id;
    private String name;
    private int capacity;
    private String address;
    private ArrayList<Showing> showings;

    public Theater() {
    }

    public Theater(String name, int capacity, String address, ArrayList<Showing> showings) {
        this.name = name;
        this.capacity = capacity;
        this.address = address;
        this.showings = showings;
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Showing> getShowings() {
        return showings;
    }

    public void setShowings(ArrayList<Showing> showings) {
        this.showings = showings;
    }
}
