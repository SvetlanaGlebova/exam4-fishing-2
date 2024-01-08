package jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import javax.xml.crypto.Data;

@Entity
public class FishingBoat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String type;
    private double displacement;
    private Data buildDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public Data getBuildDate() {
        return buildDate;
    }

    public void setBuildDate(Data buildDate) {
        this.buildDate = buildDate;
    }
}
