package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Konstanta PI " + Math.PI);
        System.out.println("Konstanta E " + Math.E);

        System.out.println("Sabiranje dva broja " + Math.addExact(2, 3));
        System.out.println("Oduzimanje dva broja " + Math.subtractExact(2, 3));
        System.out.println("Množenje dva broja " + Math.multiplyExact(2, 3));
        System.out.println("Množenje dva broja " + Math.multiplyFull(2, 3));
        System.out.println("Dijeljenje dva broja " + Math.floorDiv(2, 3));
        System.out.println("Dijeljenje dva broja " + Math.floorMod(7, 3));

        System.out.println("Apsolutni broj " + Math.abs(-2.3));
        System.out.println("Negativan broj " + Math.negateExact(2));

        System.out.println("Sinus " + Math.sin(2.3));
        System.out.println("Kosinus " + Math.cos(2.3));
        System.out.println("Tan " + Math.tan(2.3));

        System.out.println("Log " + Math.log(4.5));
        System.out.println("Log10 " + Math.log10(4.5));
        System.out.println("Log1p " + Math.log1p(4.5));

        System.out.println("Kvadriranje " + Math.pow(6, 3));
        System.out.println("Kvadratni korijen " + Math.sqrt(4.5));

        System.out.println("Max vrijednost " + Math.max(67, 98));
        System.out.println("Min vrijednost " + Math.min(3.4f, 5.6f));

        System.out.println("round() " + Math.round(5.6));
        System.out.println("ceil() " + Math.ceil(5.6));
        System.out.println("floor() " + Math.floor(5.6));

        System.out.println("Random broj " + Math.random());
        System.out.println("Random cijeli broj " + new Random().nextInt());
        System.out.println("Random broj od 1 do 10 " + (int)(Math.random()*13 + 1));

        System.out.println(Math.addExact(2147483647L, 9));

        //zadatak
        double doubleVar = 4.5;
        System.out.println("Prvobitna vrijednost varijable: " + doubleVar);
        doubleVar = Math.floor(doubleVar);
        System.out.println("Nakon koristenja metode Math.floor(): " + doubleVar + "\n");

        int randNum1 = (int)(Math.random()*9+1);
        System.out.println("Dodjeljivanje random broja intNum1 varijabli: " +randNum1);

        int number1 = 5;
        int number2 = 8;
        int number3 = 3;
        System.out.println("najveća vrijendost " + Math.max(Math.max(number1, number2), number3));
        System.out.println("najmanja " + Math.min(Math.min(number1, number2), number3));
    }
}
