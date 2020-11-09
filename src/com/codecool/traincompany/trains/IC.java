package com.codecool.traincompany.trains;

import java.util.Random;

public class IC extends Train {
    public IC() {
        super();
        this.ticketPrice = 2;
        this.costPerMonth = 1200;
    }


    @Override
    public void calculateRevenue() {
        this.totalRevenue += this.amountOfPeople + getTicketOnTrainPrice() * 0.25;
        this.totalRevenue += this.amountOfPeople * this.ticketPrice * 0.75;
        if (chanceToPunish()) {
            this.totalRevenue += twentyPercentOfPeople() * 6;
        }

    }

    public boolean chanceToPunish() {
        Random random = new Random();
        int chance = random.nextInt(100) + 1;
        return chance <= 8;
    }

    public int twentyPercentOfPeople() {
        return (this.amountOfPeople * 20) / 100;
    }


}
