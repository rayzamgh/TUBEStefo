package com.engicorp.oop.cell;

import com.engicorp.oop.misc.Point;

class Well extends Facility
{
    public Well(Point pos)
    {
        super(pos, "W");
    }

    @Override
    public void interact()
    {
//        Player.getInstance().setWater(100);
//        World.getInstance().addMsg("Penyiram tanaman berhasil dipenuhi");
    }

}