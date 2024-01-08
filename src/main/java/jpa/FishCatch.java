package jpa;

import jakarta.persistence.*;

@Entity
public class FishCatch {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
//    @ManyToOne
//    @JoinColumn(name = "trip_id")
//    private FishingTrip trip;

    private String fishType;
    private int quantity;
    private String quality;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

//    public FishingTrip getTrip() {
//        return trip;
//    }
//
//    public void setTrip(FishingTrip trip) {
//        this.trip = trip;
    //}

    public String getFishType() {
        return fishType;
    }

    public void setFishType(String fishType) {
        this.fishType = fishType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }
}
