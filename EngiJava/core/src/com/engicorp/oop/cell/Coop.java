package com.engicorp.oop.cell;


import com.engicorp.oop.misc.Point;

public class Coop extends Land{
    public Coop(Point _pos, Boolean _grass){
        super(_pos, "tile/50x50/isometric_pixel_0023.png", _grass);
        if (_grass){
            this.setTexPath("");
        }
    }

    @Override
    public final boolean isCoop(){
        return true;
    }

    @Override
    public void setGrass(boolean hasGrass) {
        this.grass = hasGrass;
        if (hasGrass) {
            //this.setRenderChar('*');
        }
    }
}