package model;

import java.util.Date;
import java.util.List;

public abstract class Pet extends Animal {
    public Pet(String name, List<String> command, Date bdate) {
        super(name, command, bdate);
    }
}
