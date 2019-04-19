package com.engicorp.oop;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.engicorp.oop.cell.*;
import com.engicorp.oop.livingbeing.Animal;
import com.engicorp.oop.misc.Point;

import java.util.ArrayList;

public class World {
    static World instance = new World();
    private int width, height;
    boolean[][] terisi;
    Land[][] mapLand;
    ArrayList<Animal> listAnimal;
    ArrayList<Facility> listFacil;
    ArrayList<String> listMsg;

    public World()
    {
        width = 0;
        height = 0;
    }

    public World(int _w, int _h)
    {
        width = _w;
        height = _h;
        terisi = new boolean[_h][_w];
        mapLand = new Land[_h][_w];
        //Default : Grassland
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                mapLand[y][x] = new Grassland(new Point(x, y),false);
            }
        }
        listAnimal = new ArrayList<Animal>();
        listFacil = new ArrayList<Facility>();
        listMsg  = new ArrayList<String>();
    }

    public static World getInstance()
    {
        return instance;
    }

    public void init(int _w, int _h)
    {
        instance = new World(_w, _h);
        for (int y = 0; y < 5; y++) {
            for (int x = 0; x < 5; x++) {
                instance.setLand(new Point(x,y), new Barn(new Point(x,y),false));
            }
        }

        for (int y = 8; y < 11; y++) {
            for (int x = 12; x < 15; x++) {
                instance.setLand(new Point(x,y), new Coop(new Point(x,y),false));
            }
        }
    }

    public void setLand(Point pos, Land l)
    {
        mapLand[pos.y][pos.x] = l;
    }

    public void addAnimal(Point pos, Animal a)
    {
        a.setPos(pos);
        listAnimal.add(a);
        terisi[pos.y][pos.x] = true;
    }

    public void addFacility(Point pos, Facility f)
    {
        f.setPos(pos);
        listFacil.add(f);
        terisi[pos.y][pos.x] = true;
    }

    public void addMsg(String s)
    {
        if(listMsg.size() >= 30)
        {
            listMsg.remove(0);
        }
        listMsg.add(s);
    }

    public Land getLand(Point pos)
    {
        return mapLand[pos.y][pos.x];
    }

    public void setTerisi(Point pos, boolean isi)
    {
        terisi[pos.y][pos.x] = isi;
    }

    public boolean isTerisi(Point pos)
    {
        return terisi[pos.y][pos.x];
    }


    //Harus dipanggil diantara batch begin dan batch end
    public void renderAll(SpriteBatch batch)
    {
        //Gambar map
        for(int y = height-1; y >= 0; y--)
        {
            for(int x = width-1; x >= 0; x--)
            {
                int xPosReal = x-(width/2);
                if(x-(width/2) != 0) {
                    xPosReal = (x-(width/2)) * 25 ;//+ (int)((x-(width/2)) / Math.abs(x-(width/2)) * 12.5);
                }
                int zPosReal = y-(height/2);
                if(y-(height/2) != 0) {
                    zPosReal = (y-(height/2)) * 25 ;//+ (int)((y-(height/2)) / Math.abs(y-(height/2)) * 12.5);
                }
                int yPosReal = 0;
                Point real = new Point(xPosReal, yPosReal, zPosReal);
                mapLand[y][x].setRealPos(real);
                mapLand[y][x].render(batch);
            }
        }

        //Gambar facility
        //TODO
        //Gambar animal
        //TODO
        //Gambar player
        //TODO
    }
}
