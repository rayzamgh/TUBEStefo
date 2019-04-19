package com.engicorp.oop.cell;

import java.util.*;
import com.engicorp.oop.product.*;
import com.engicorp.oop.misc.Point;

class Mixer extends Facility
{
    static ArrayList<SideProduct> catalog = new ArrayList<SideProduct>();
    
    public Mixer(Point pos)
    {
        super(pos, "M");
    }

    static SideProduct mix(ArrayList<Product> bahan)
    {
        for(SideProduct sp : catalog)
        {
//            if(sp.canMake(bahan))
//            {
//                return sp;
//            }
        }
        return null;
    }

    static void initCatalog()
    {
        catalog.add(new BeefRolade());
        catalog.add(new BlueFeather());
        catalog.add(new CheeseSteakOmelette());
        catalog.add(new CremeBrulee());
        catalog.add(new Lasagna());
        catalog.add(new STMJ());
    }

    @Override
    public void interact()
    {

    }

    @Override
    public boolean isMixer()
    {
        return true;
    }
}