package com.company;

public class Worker {
    private String name, post, phone;
    private int pay, age;

    public Worker(String name, String post, String phone, int pay, int age) {
        this.name = name;
        this.post = post;
        this.phone = phone;
        this.pay = pay;
        this.age = age;
    }

    public void info(){
        System.out.println("Имя сотрудника: " + name + "\nДолжность: " + post + "\nТелефон: " + phone +
                "\nВозраст: " + age + "\nЗаработная плата: " + pay);
    }

    public int getAge() {
        return age;
    }
}
