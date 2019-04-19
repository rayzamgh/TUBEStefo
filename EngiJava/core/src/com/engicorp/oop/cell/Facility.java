package com.engicorp.oop.cell;

import com.engicorp.oop.cell.Cell;
import com.engicorp.oop.misc.Point;

public abstract class Facility extends Cell
{
    public Facility(Point pos, String texPath)
    {
        super(pos, texPath);
    }

    public void interact(){}
}