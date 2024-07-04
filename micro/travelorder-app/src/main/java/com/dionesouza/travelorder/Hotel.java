package com.dionesouza.travelorder;

public class Hotel {
    
    private Long id;
    private Long travelOrderId;
    private int nights;


    public Hotel() {
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getTravelOrderId() {
        return travelOrderId;
    }
    public void setTravelOrderId(Long travelOrderId) {
        this.travelOrderId = travelOrderId;
    }
    public int getNights() {
        return nights;
    }
    public void setNights(int nights) {
        this.nights = nights;
    }

}
