package services;

public class Booking{
    public double booking(int noOfPersons, int rates){
        double totalRate;
        totalRate = noOfPersons * rates;
        return totalRate;
    }
}

