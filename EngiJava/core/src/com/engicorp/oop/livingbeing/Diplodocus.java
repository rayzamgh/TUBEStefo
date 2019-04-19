package com.engicorp.oop.livingbeing;

public class Diplodocus extends Animal implements MeatProducingAnimal, EggProducingAnimal
{
    /*
    protected int maxHunger;
    protected int hungerMeter;
    protected String animalSound;
    protected boolean isAlive;
    */
    public Diplodocus(Point _pos)
    {
        String _sound = "Rawr XD"; 
        String texPath = "D";
        int _maxHunger = 10;
        super(_pos, _sound, texPath, _maxHunger);
    }

    public boolean moveRandom()
    {
        boolean moveValid = false;
        int i = 0;
        while (i < 4 && !moveValid)
        {
            //srand(World.getInstance().getTick());
            //kemungkinan bug disini tergantung cara implementasi cell di world
            /*
            0 up
            1 down
            2 left
            3 right
            */
            int random = Math.abs(Math.random()) % 4;
            if (random == 0 && y > 0 && (World.getInstance().getLand(x, y - 1).isBarn() || World.getInstance().getLand(x, y - 1).isCoop()))
            {
                moveValid = true;
            }
            else if (random == 1 && y < World.getInstance().getSize().getOrdinat() && (World.getInstance().getLand(x, y + 1).isBarn() || World.getInstance().getLand(x, y + 1).isCoop()))
            {
                moveValid = true;
            }
            else if (random == 2 && x > 0 && (World.getInstance().getLand(x - 1, y).isBarn() || World.getInstance().getLand(x - 1, y).isCoop()))
            {
                moveValid = true;
            }
            else if (random == 3 && x < World.getInstance().getSize().getAbsis() && (World.getInstance().getLand(x + 1, y).isBarn() || World.getInstance().getLand(x + 1, y).isCoop()))
            {
                moveValid = true;
            }
            i++;
        }
        // World.getInstance().addMsg("EggAnimal Bergerak");
        if(moveValid)
        {
            this->Move(random);
        }
        return moveValid;
    }

    public void Die(boolean diedOfHunger)
    {
        if(!diedOfHunger)
        {
            Player.getInstance().AddInventory(new DiplodocusMeat());
        }
        World.getInstance().addMsg("1 Diplodocus Mati");
    }

    public void Interract()
    {
        Player.getInstance().AddInventory(new DiplodocusEgg());
        World.getInstance().addMsg("Kamu mendapat telur diplodocus, WOW");
    }
}