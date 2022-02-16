package com.company;

public class Main {

    public static void main(String[] args) {
        Sheep sheep = new Sheep(45, 1, 'M', "Pffa");
        Sheep sheep1 = new Sheep(50, 1, 'M', "Kara");
        Sheep sheep2 = new Sheep(15, 1, 'M', "Kozu");
        Sheep sheep3 = new Sheep(75, 1, 'M', "Chon");
        Sheep[] sheeps = {sheep, sheep1, sheep2};
        Sheep[] sheeps1 = {sheep3};


        Cow cow1 = new Cow(100, 5, 'j', "Burka");
        Cow cow2 = new Cow(120, 4, 'm', "Pups");
        Cow cow3 = new Cow(100, 5, 'm', "Mups");
        Cow cow4 = new Cow(100, 5, 'j', "Wilk");
        Cow cow5 = new Cow(100, 5, 'j', "Zita");
        Cow cow6 = new Cow(80, 4, 'm', "Cow");
        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};
        Cow[] cows1 = {cow6};


        Horse horse = new Horse(300, 3, "Tulpar", 'M');
        Horse horse1 = new Horse(200, 3, "Tulpar", 'M');
        Horse horse2 = new Horse(250, 3, "Tulpar", 'M');
        Horse[] horses = {horse, horse1};
        Horse[] horses1 = {horse2};

        Farm farm1 = new Farm("Kara-Shoro", "Andrey", sheeps, horses, cows);
        Farm farm2 = new Farm("Arashan", "Vladimir", sheeps1, horses1, cows1);

        System.out.println(farm1);
        System.out.println("---------------------------------------------");
        System.out.println(farm2);

    }
}
