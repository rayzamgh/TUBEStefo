package com.engicorp.oop.livingbeing;

import java.lang.String;

public class LandSalmon extends LivingBeing
{
    private int water;
    private int money;
    private LinkedList<Product> tas;

    public Player()
    {
        tas = new LinkedList<Product>();
        Point pt = new Point(0, 0); 
        super(pt, '<player.png path>');
        water = 100;
        money = 0;
    }

    public Player(Point _pos, int _water, int _money)
    {
        tas = new LinkedList<Product>();
        super(_pos, '<player.png path>');
        water = _water;
        money = _money;
    }

    public int getWater()
    {
        return(water);
    }
    public int getMoney()
    {
        return(money);
    }
    public void setWater(int _water)
    {
        water = _water;
    }
    public void setMoney(int _money)
    {
        money = _money;
    }

    public void Kill(Animal animalia)
    {
        World.getInstance().hapusAnimal(animalia);
        animal.Die(false);
    }

    public void addInventory(Product _p)
    {
        tas.addNext(_p);
    }

    public Product getInventory(int i)
    {
        return(tas.get(i));
    }

    public int searchInventory(String productName)
    {
        for(int i = 0; i < tas.getNeff(); i++)
        {
            String temp;
            temp = tas.get(i).getName().toLowerCase();
            if(temp == productName)
            {
                return i;
            }
        }
        return -1;
    }

    public void delInventory(int i)
    {
        tas.getLinkedList(i).removeThis();
    }

    public LinkedList<Product> getTas()
    {
        return(tas);
    }

    public void makeTas()
    {
        tas = new LinkedList<Product>();
    }
}