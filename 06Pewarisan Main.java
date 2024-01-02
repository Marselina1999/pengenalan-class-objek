package com.tutorial;

class Hero{
    //att
    String nama;
    float exp;
    float heallth;

    void display(){
        System.out.println("Nama Hero: " + this.nama);
        System.out.println("exp Hero:" + this.exp);
        System.out.println("health " + this.heallth);
    }

    }


    //subclass
    class HeroTank extends Hero{

    }



public class  Main {
    public static void main(String[] args) {
        // instansiasi objek
        HeroTank hero_1 = new HeroTank();
        hero_1.display();

        HeroTank hero_2 = new HeroTank();
        hero_2.nama = "biel";

        hero_2.display();
    }
}



