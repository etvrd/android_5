package com.company;

public class Main {

    public static void main(String[] args) {
        Worker[] workerArr = new Worker[5];
        workerArr[0] = new Worker("Василий", "Директор", "1", 1500, 50);
        workerArr[1] = new Worker("Иван", "Менеджер", "2", 1200, 45);
        workerArr[2] = new Worker("Людмила", "Бухгалтер", "3", 1200, 43);
        workerArr[3] = new Worker("Петр", "Инженер", "4", 1000, 35);
        workerArr[4] = new Worker("Сергей", "Работник", "5", 700, 25);
        workersOver40(workerArr);
    }

    private static void workersOver40(Worker[] workerArr) {
        System.out.println("Сотрудники старше 40: ");
        int a = 1;
        for (Worker worker : workerArr) {
            if (worker.getAge() > 40) {
                System.out.print(a + ". ");
                worker.info();
                a++;
            }
        }
    }
}