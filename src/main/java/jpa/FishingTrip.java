package jpa;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class FishingTrip {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @ManyToOne
    @JoinColumn(name = "boat_id")
    private FishingBoat boat;
    private Date departureDate;
    private Date returnDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public FishingBoat getBoat() {
        return boat;
    }

    public void setBoat(FishingBoat boat) {
        this.boat = boat;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }
}
