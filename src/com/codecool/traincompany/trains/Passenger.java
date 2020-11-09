package com.codecool.traincompany.trains;

import java.util.Random;

public class Passenger extends Train {

    public Passenger() {
        super();
        this.ticketPrice = 1.50;
        this.costPerMonth = 1000;
    }


    @Override
    public void calculateRevenue() {
        this.totalRevenue += this.amountOfPeople + getTicketOnTrainPrice() * 0.25;
        this.totalRevenue += this.amountOfPeople * this.ticketPrice * 0.75;
        if(chanceToPunish()){
            this.totalRevenue += twentyPercentOfPeople() * 6;
        }
    }

    public boolean chanceToPunish(){
        Random random = new Random();
        int chance = random.nextInt(100) + 1;
        return chance <= 10;
    }

    public int twentyPercentOfPeople(){
        return (this.amountOfPeople * 20) / 100;
    }
}
