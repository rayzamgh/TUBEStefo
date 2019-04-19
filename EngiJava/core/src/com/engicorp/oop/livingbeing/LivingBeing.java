package com.engicorp.oop.livingbeing;

import com.engicorp.oop.Showable;
import com.engicorp.oop.misc.Point;

public abstract class LivingBeing extends Showable
{
    protected Point pos;

    public LivingBeing(Point _pos, String texPath)
    {
        super(_pos, texPath);
    }

    public Point getPos() {
        return pos;
    }

    public void setPos(Point pos) {
        this.pos = pos;
    }

    public boolean move(int dir)
    {
        //TODO
        return true;
    }
}