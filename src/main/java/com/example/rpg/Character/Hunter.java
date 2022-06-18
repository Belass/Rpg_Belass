package com.example.rpg.Character;

public class Hunter extends Hero {

    private int arrows ;

    public Hunter(String name){

        this.name = name ;
        this.PV = 15;
        this.armor=4;
        this.weaponDamage=8;
        this.arrows=10;
        this.heroType = "Hunter";
    }



    @Override
    public int attack() {
        return 0;
    }

    @Override
    public int defend() {
        return 0;
    }



}
