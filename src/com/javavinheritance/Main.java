package com.javavinheritance;

import java.util.Scanner;

class Main
{
        public static void main(String[] args)
        {
                Person person1 = new Person("Murni", "Aminah", 27, 1.6, 50.0);
                Person person2 = new Person("Yahya", "Nasrun", "Rizal", 65, 1.75, 80.0);

                Car car = new Car("Ferrari", "Merah");
                // Atur instance person1 dapat membeli instance car
                person1.buy(car);

                Bicycle bicycle = new Bicycle("Bianchi", "Hijau");
                // Atur instance person2 dapat membeli instance bicycle
                person2.buy(bicycle);

                System.out.println("【Info Mobil】");
                car.printData();
                System.out.println("-----------------");
                System.out.println("【Info Pemilik Mobil】");
                // Dapatkan `owner` dari `car` menggunakan method instance `getOwner`,
                // dan gunakan `printData` untuk mencetak informasi pemilik
                car.getOwner().printData();

                System.out.println("=================");
                System.out.println("【Info Sepeda】");
                bicycle.printData();
                System.out.println("-----------------");
                System.out.println("【Info Pemilik Sepeda】");
                // Dapatkan `owner` dari `bicycle` menggunakan method instance `getOwner`,
                // dan gunakan `printData` untuk mencetak informasi pemilik
                bicycle.getOwner().printData();
    }
}