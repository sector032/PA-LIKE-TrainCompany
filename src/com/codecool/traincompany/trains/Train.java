package com.codecool.traincompany.trains;

import java.util.Random;
import java.util.UUID;

public abstract class Train {
    protected String serialNumber;
    protected int costPerMonth;
    protected double ticketPrice;
    protected int totalRevenue;
    protected int amountOfPeople;

    public Train() {
        this.serialNumber = UUID.randomUUID().toString();
        this.amountOfPeople = amountOfPeople();
    }


    public int amountOfPeople() {
        Random random = new Random();
        return random.nextInt(250-115) + 115;
    }
  


    public abstract void calculateRevenue();

    public double getTicketOnTrainPrice() {
        return this.ticketPrice + 2;
    }

    public int getTotalRevenue() {
        return totalRevenue;
    }

    public int getCostPerMonth() {
        return costPerMonth;
    }

    @Override
    public String toString() {
        return "Train{" +
                "serialNumber='" + serialNumber + '\'' +
                ", costPerMonth=" + costPerMonth +
                ", ticketPrice=" + ticketPrice +
                ", totalRevenue=" + totalRevenue +
                ", amountOfPeople=" + amountOfPeople +
                '}';
    }
}
