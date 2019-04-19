package com.engicorp.oop.livingbeing;

import com.engicorp.oop.misc.Point;

public class Animal extends LivingBeing
{

    protected int maxHunger;
    protected int hungerMeter;
    protected String animalSound;
    protected boolean isAlive;

    public Animal(Point _pos, String _sound, String texPath, int _maxHunger)
    {
        super(_pos, texPath);
    }

    public int getHungerMeter()
    {
        return hungerMeter;
    }

    public int getMaxHunger()
    {
        return maxHunger;
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setMaxHunger(int maxHunger) {
        this.maxHunger = maxHunger;
    }

    public void setHungerMeter(int hungerMeter) {
        this.hungerMeter = hungerMeter;
    }

    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

}