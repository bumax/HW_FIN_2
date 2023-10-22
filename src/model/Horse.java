package model;

import java.util.Date;
import java.util.List;

public class Horse extends PackAnimal{
    public Horse(String name, List<String> command, Date bdate, double mass) {
        super(name, command, bdate);
        this.mass = mass;
    }
    public double getMass() {
        return mass;
    }
    private double mass;

    @Override
    public String toString() {
        return "Horse{" +
                "mass=" + mass + ", " +
                super.toString();
    }
}
