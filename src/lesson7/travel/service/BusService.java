package lesson7.travel.service;

import lesson7.travel.entities.Bus;
import lesson7.travel.entities.Vehicle;

public class BusService extends Vehicle {

    @Override
    public double calculateTime(double s) {
        return s/ Bus.V_BUS;
    }
}
