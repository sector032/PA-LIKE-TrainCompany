package com.codecool.traincompany;

import com.codecool.traincompany.trains.Freight;
import com.codecool.traincompany.trains.IC;
import com.codecool.traincompany.trains.Passenger;
import com.codecool.traincompany.trains.Train;

public class Main {
    public static void main(String[] args) {
        TrainCompany company = new TrainCompany();
        Passenger passenger = new Passenger();
        Passenger passenger2 = new Passenger();
        IC ic = new IC();
        IC ic2 = new IC();
        Freight freight = new Freight();
        Freight freight2 = new Freight();

        company.addToTrainList(passenger);
        company.addToTrainList(passenger2);
        company.addToTrainList(ic);
        company.addToTrainList(ic2);
        company.addToTrainList(freight);
        company.addToTrainList(freight2);

        for (int i = 0; i < 24; i++) {
            for (Train train : company.getTrainList()) {
                train.calculateRevenue();
                company.addMonthlyIncome(train.getTotalRevenue());
                company.decreaseMonthlyPayment(train.getCostPerMonth());
                System.out.println(train);
            }
            System.out.println(company);
        }
    }
}
