package com.codecool.traincompany;

import com.codecool.traincompany.trains.Train;

import java.util.HashSet;

public class TrainCompany {
    private HashSet<Train> trainList;
    private double totalIncome;

    public TrainCompany() {
      this.trainList = new HashSet<>();
    }

    public void addToTrainList(Train train){
        trainList.add(train);
    }

    public HashSet<Train> getTrainList() {
        return trainList;
    }

    public double getTotalIncome() {
        return totalIncome;
    }

    public void addMonthlyIncome(double totalIncome) {
        this.totalIncome += totalIncome;
    }

    public void decreaseMonthlyPayment(double trainCost){
        this.totalIncome -= trainCost;
    }

    @Override
    public String toString() {
        return "TrainCompany{" +
                " totalIncome=" + totalIncome +
                '}';
    }
}
