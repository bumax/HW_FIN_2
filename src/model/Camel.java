package model;

import java.util.Date;
import java.util.List;

public class Camel extends PackAnimal{
    public Camel(String name, List<String> command, Date bdate, int nHumps) {
        super(name, command, bdate);
        this.nHumps = nHumps;
    }
    public int getHumps() {
        return nHumps;
    }
    private int nHumps;

    @Override
    public String toString() {
        return "Camel{" +
                "nHumps=" + nHumps + ", " +
                super.toString();
    }
}
