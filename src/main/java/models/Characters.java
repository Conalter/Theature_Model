package models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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

    @Id
    @GeneratedValue
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "play_id", nullable = false)
    public ArrayList<Play> getPlays() {
        return plays;
    }

    public void setPlays(ArrayList<Play> plays) {
        this.plays = plays;
    }
}
