package view;

import java.util.Scanner;

public class View {
    public View() {
    }

    public void mainMenu() {
        System.out.println("Выберите действие:\n" +
                "1 - Завести новое животное 2 - Выбрать животное:");
    }

    public void addMenu(int level) {
        switch (level){
            case 1:
                System.out.println("Выберите действие:\n" +
                        "1 - Завести новое домашнее животное 2 - Завести новое вьючное животное:");
                break;
            case 2:
                System.out.println("Выберите домашнее животное:\n" +
                        "1 - Собака 2 - Кошка 3 - Хомяк:");
                break;
            case 3:
                System.out.println("Выберите вьючное животное:\n" +
                        "1 - Лошадь 2 - Верюлюд 3 - Осёл:");
                break;
        }

    }

    private Scanner scan = new Scanner(System.in);

    /**
     * Получение целочисленного значения от пользователя
     *
     * @param msg Текст в диалоге
     * @return
     */
    public int getIntValue(String msg) {
        System.out.println("Введите " + msg + " (целочисленное):");
        return scan.nextInt();
    }

    /**
     * Получение числа с плавающей точкой от пользователя
     *
     * @param msg Текст в диалоге
     * @return
     */
    public Double getDblValue(String msg) {
        System.out.println("Введите " + msg + " (с плавающей точкой):");
        return scan.nextDouble();
    }

    /**
     * Получение строкового значения от пользователя
     *
     * @param msg Текст в диалоге
     * @return
     */
    public String getStrValue(String msg) {
        System.out.println("Введите " + msg + " (строка):");
        String line = new String();
        while(line.isEmpty())
            line = scan.nextLine();
        return line;
    }

}