package com.example.rpg.Character;

public class Mage extends SpellCaster{


    public Mage(String name){

        this.name = name;
        this.PV = 15;
        this.armor=4;
        this.weaponDamage=12;
        this.heroType = "Mage";
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
