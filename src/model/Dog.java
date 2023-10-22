package model;

import java.util.Date;
import java.util.List;

public class Dog extends Pet{
    public Dog(String name, List<String> command, Date bdate, String type) {
        super(name, command, bdate);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    private String type;

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' + ", " +
                super.toString();
    }
}
