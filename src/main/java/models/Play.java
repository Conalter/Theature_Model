package models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
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

    @ManyToOne
    @JoinColumn(name = "playwright_id")
    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @ManyToOne
    @JoinColumn(name = "character_id")
    public ArrayList<Performer> getPerformers() {
        return performers;
    }

    public void setPerformers(ArrayList<Performer> performers) {
        this.performers = performers;
    }

    @Column(name = "performances")
    public int getPerformances() {
        return performances;
    }

    public void setPerformances(int performances) {
        this.performances = performances;
    }
}
