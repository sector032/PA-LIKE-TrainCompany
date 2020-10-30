package com.codecool.traincompany.trains;

import java.util.Random;

public class IC extends Train {
    public IC() {
        this.ticketPrice = calculateTicketPrice();
        this.costPerMonth = 1200;
    }

    @Override
    public int calculateTicketPrice() {
        if(chanceToBuyTicket()){
            this.ticketPrice += 4;
        }else{
            this.ticketPrice = 2;
        }
        return 0;
    }

    @Override
    public boolean chanceToBuyTicket() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        return number <= 25;
    }

    @Override
    public void calculateRevenue() {
        if(chanceToPunish()){
            this.totalRevenue += twentyPercentOfPeople() * 6;
        }

    }

    public boolean chanceToPunish(){
        Random random = new Random();
        int chance = random.nextInt(100) + 1;
        return chance <= 8;
    }

    public int twentyPercentOfPeople(){
        return (this.amountOfPeople * 20) / 100;
    }
}
