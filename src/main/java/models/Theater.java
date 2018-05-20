package models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Theater {

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

    @Column(name = "capacity")
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @ManyToMany
    @JoinColumn(name = "play_id", nullable = false)
    public ArrayList<Showing> getShowings() {
        return showings;
    }

    public void setShowings(ArrayList<Showing> showings) {
        this.showings = showings;
    }
}
