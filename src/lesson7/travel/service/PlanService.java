package lesson7.travel.service;

import lesson7.travel.entities.Plan;
import lesson7.travel.entities.Vehicle;

public class PlanService extends Vehicle {
    @Override
    public double calculateTime(double s) {
        return s/ Plan.V_PLAN;
    }
}
