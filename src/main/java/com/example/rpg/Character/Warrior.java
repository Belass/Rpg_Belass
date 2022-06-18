package com.example.rpg.Character;

public class Warrior extends Hero{

    public Warrior(String name){
        this.name=name;
        this.heroType = "Warrior";
        this.PV = 20;
        this.armor=9;
        this.weaponDamage=7;
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
