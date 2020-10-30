package com.codecool.traincompany.trains;

import java.util.Random;

public class Passenger extends Train {

    public Passenger() {
        this.ticketPrice = calculateTicketPrice();
        this.costPerMonth = 1000;
    }

    @Override
    public int calculateTicketPrice() {
        if(chanceToBuyTicket()){
            this.ticketPrice += 3.50;
        }else{
            this.ticketPrice += 1.50;
        }
        return 0;
    }

    @Override
    public void calculateRevenue() {
        if(chanceToPunish()){
            this.totalRevenue += twentyPercentOfPeople() * 6;
        }
    }

    @Override
    public boolean chanceToBuyTicket(){
        Random random = new Random();
        int number = random.nextInt(100)+1;
        return number <= 25;
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
