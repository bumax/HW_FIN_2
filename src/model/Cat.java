package model;

import java.util.Date;
import java.util.List;

public class Cat extends Pet{
    public Cat(String name, List<String> command, Date bdate, String type) {
        super(name, command, bdate);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    private String type;

    @Override
    public String toString() {
        return "Cat{" +
                "type='" + type + '\'' + ", " +
                super.toString();
    }
}
