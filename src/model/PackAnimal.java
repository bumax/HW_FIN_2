package model;

import java.util.Date;
import java.util.List;

public abstract class PackAnimal extends Animal{
    public PackAnimal(String name, List<String> command, Date bdate) {
        super(name, command, bdate);
    }
}
