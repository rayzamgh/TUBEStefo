package com.engicorp.oop.cell;

import com.engicorp.oop.Showable;
import com.engicorp.oop.misc.Point;


public class Cell extends Showable{
    protected Point pos;

    /**
     * \brief Konstruktor berparameter cell
     * \param _pos posisi cell yang ingin dibentuk
     * \param _renderChar karakter yang akan di print saat rendering
     */
    public Cell(Point _pos, String texPath){
        super(_pos,texPath);
        pos = _pos;
    }

    /**
     * \brief return posisi cell berada sebagai point
     */
    public final Point getPos(){
        return pos;
    }

    /**
     * \brief Mengganti nilai pos sekarang
     * \param _pos posisi cell baru
     */
    public final void setPos(Point _pos){
        pos=_pos;
    }

    /**
     * \brief Mengembalikan false jika objek Cell yang
     * sekarang ditunjuk bukan Barn, true jika sebaliknya
     */
    public boolean isBarn(){
        return false;
    }

    /**
     * \brief Mengembalikan false jika objek Cell yang
     * sekarang ditunjuk bukan Coop, true jika sebaliknya
     */
    public boolean isCoop(){
        return false;
    }

    /**
     * \brief Mengembalikan false jika objek Cell yang
     * sekarang ditunjuk bukan Grassland, true jika sebaliknya
     */
    public boolean isGrassland(){
        return false;
    }

    /**
     * \brief Mengembalikan false jika objek Cell yang
     * sekarang ditunjuk bukan Mixer, true jika sebaliknya
     */
    public boolean isMixer(){
        return false;
    }

    /**
     * \brief Mengembalikan false jika objek Cell yang
     * sekarang ditunjuk bukan Truck, true jika sebaliknya
     */
    public boolean isTruck(){
        return false;
    }

    /**
     * \brief Mengembalikan false jika objek Cell yang
     * sekarang ditunjuk bukan Well, true jika sebaliknya
     */
    public boolean isWell(){ return false; }
}