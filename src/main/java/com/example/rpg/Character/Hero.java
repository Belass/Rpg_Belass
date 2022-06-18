package com.example.rpg.Character;

import com.example.rpg.Object.Food;
import com.example.rpg.Object.Potion;

import java.util.ArrayList;
import java.util.List;

public abstract class Hero extends Fighter {

    public Hero(String name) {
        this.name=name;
    }

    protected String name;
    protected int PV;
    protected int armor;
    protected int weaponDamage;
    protected String heroType;
    protected ArrayList<Potion> Potions = new ArrayList();
    protected ArrayList<Food> Lambas = new ArrayList();
    protected double consumableEfficency = 1;

    protected Hero() {
    }

    abstract public int attack();
    abstract public int defend();


}
