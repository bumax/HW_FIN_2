package model;

import java.util.Date;
import java.util.List;

public class Donkey extends PackAnimal{
    public Donkey(String name, List<String> command, Date bdate, double earLength) {
        super(name, command, bdate);
        this.earLength = earLength;
    }
    public double getEarLength() {
        return earLength;
    }
    private double earLength;

    @Override
    public String toString() {
        return "Donkey{" +
                "earLength=" + earLength + ", " +
                super.toString();
    }
}
