package presenter;

import model.*;
import view.View;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Presenter {
    public Presenter() {
        view = new View();
        zoo = new ArrayList<>();
        counter = new Counter();
    }

    public void mainMenu() {
        int cmd = 0;
        do {
            view.mainMenu();
            cmd = view.getIntValue("команду");
            selectCmd(cmd);
        } while (cmd != 0);
    }

    private void selectCmd(int command) {
        int cmd = 0;
        switch (command) {
            case 1:
                view.addMenu(1);
                cmd = view.getIntValue("команду");
                try {
                    selectCmd(cmd + 10);
                    counter.Add();
                }
                catch (Exception e){
                    System.out.println(e);
                }
                      break;
            case 2:
                int i = 0;
                System.out.println("Выберете животное: ");
                for (Animal animal: zoo) {
                    System.out.print(i++ + ": ");
                    System.out.println(animal.toString());
                }
                i = view.getIntValue("номер животного");
                zoo.get(i).addCommand(view.getStrValue("команду"));
                break;
            case 11:
                    view.addMenu(2);
                    cmd = view.getIntValue("команду");
                    selectCmd(cmd + 100);
                break;
            case 12:
                    view.addMenu(3);
                    cmd = view.getIntValue("команду");
                    selectCmd(cmd + 200);
                break;
            case 101:
                zoo.add(new Dog(view.getStrValue("имя"), new ArrayList<>(), new Date(view.getStrValue("дату рождения (ММ/ДД/ГГГГ)")), view.getStrValue("породу")));
                break;
            case 102:
                zoo.add(new Cat(view.getStrValue("имя"), new ArrayList<>(), new Date(view.getStrValue("дату рождения (ММ/ДД/ГГГГ)")), view.getStrValue("породу")));
                break;
            case 103:
                zoo.add(new Hamster(view.getStrValue("имя"), new ArrayList<>(), new Date(view.getStrValue("дату рождения (ММ/ДД/ГГГГ)")), view.getStrValue("породу")));
                break;
            case 201:
                zoo.add(new Horse(view.getStrValue("имя"), new ArrayList<>(), new Date(view.getStrValue("дату рождения (ММ/ДД/ГГГГ)")), view.getDblValue("массу")));
                break;
            case 202:
                zoo.add(new Camel(view.getStrValue("имя"), new ArrayList<>(), new Date(view.getStrValue("дату рождения (ММ/ДД/ГГГГ)")), view.getIntValue("количество горбов")));
                break;
            case 203:
                zoo.add(new Donkey(view.getStrValue("имя"), new ArrayList<>(), new Date(view.getStrValue("дату рождения (ММ/ДД/ГГГГ)")), view.getDblValue("длину ушей")));
                break;
        }
    }


    private View view;
    private List<Animal> zoo;

private Counter counter;
}
