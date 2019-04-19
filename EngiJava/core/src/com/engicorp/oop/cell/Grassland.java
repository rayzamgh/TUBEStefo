package com.engicorp.oop.cell;

import com.engicorp.oop.misc.Point;

public class Grassland extends Land{
    public Grassland(Point _pos, Boolean _grass){
        super(_pos, "tile/50x50/isometric_pixel_0027.png", _grass);
        if (_grass){
            this.setTexPath("");
        }
    }

    public final boolean isGrassland(){
        return true;
    }

    @Override
    public void setGrass(boolean hasGrass) {
        this.grass = hasGrass;
        if (hasGrass) {
            //this.setRenderChar('#');
        }
    }
}