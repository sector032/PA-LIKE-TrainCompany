package com.codecool.traincompany.trains;

import java.util.Random;

public class Freight extends Train {

    public Freight() {
        super();
        this.costPerMonth = 1000;
        this.totalRevenue = 550;
    }


    @Override
    public void calculateRevenue() {
        if (chanceToGoAboard()) {
            totalRevenue += 110;
        }

    }

    public boolean chanceToGoAboard() {
        Random random = new Random();
        int chance = random.nextInt(100) + 1;
        return chance <= 35;
    }
}
