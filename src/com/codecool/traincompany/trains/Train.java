package com.codecool.traincompany.trains;

import java.util.Random;
import java.util.UUID;

public abstract class Train {
    public String serialNumber;
    public int costPerMonth;
    public double ticketPrice;
    public int totalRevenue;
    public int amountOfPeople;

    public Train() {
        this.serialNumber = UUID.randomUUID().toString();
        this.amountOfPeople = amountOfPeople();
    }


    public int amountOfPeople() {
        Random random = new Random();
        int minPeople = random.nextInt(115)+1;
        int maxPeople = random.nextInt(250)+1;
        int people = random.nextInt(maxPeople-minPeople) + minPeople;
        return people;
    }


    public abstract int calculateTicketPrice();

    public abstract boolean chanceToBuyTicket();

    public abstract void calculateRevenue();
}
