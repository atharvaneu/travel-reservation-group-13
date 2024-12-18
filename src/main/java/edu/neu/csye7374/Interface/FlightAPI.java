package edu.neu.csye7374.Interface;

import java.util.Date;

public interface FlightAPI {
    int getFlightID();
    double getPrice();
    Date getFlightDate();
    String getStartSite();
    String getArriveSite();
    void setPrice(double price);
}
