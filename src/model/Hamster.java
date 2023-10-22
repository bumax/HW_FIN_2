package model;

import java.util.Date;
import java.util.List;

public class Hamster extends Pet{
    public Hamster(String name, List<String> command, Date bdate, String type) {
        super(name, command, bdate);
    }

    @Override
    public String toString() {
        return "Hamster{"  +  super.toString();
    }
}