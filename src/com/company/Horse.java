package com.company;

public class Horse extends DomesticAnimal{
    private String color;
    public Horse(){

    }


    public Horse(double weight, int age, char gender, String nickName) {
        super(weight, age, gender, nickName);
        this.color = color;
    }

    public Horse(int weight, int age, String tulpar, char m) {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
