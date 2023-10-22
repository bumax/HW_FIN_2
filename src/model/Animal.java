package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract  class Animal {
    public Animal(String name, List<String> command, Date bdate) {
        this.name = name;
        this.bdate = bdate;
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getCommand() {
        return command;
    }
    public void deleteCommand(String command) {
        if(this.command.contains(command))
            this.command.remove(command);
    }
    public void addCommand(String command) {
        if(!this.command.contains(command))
            this.command.add(command);
    }

    public Date getBdate() {
        return bdate;
    }

    public void setBdate(Date bdate) {
        this.bdate = bdate;
    }

    private String name;
    private List<String> command;
    private Date bdate;

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", command=" + command +
                ", bdate=" + bdate +
                '}';
    }
}
