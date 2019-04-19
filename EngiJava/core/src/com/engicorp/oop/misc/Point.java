package com.engicorp.oop.misc;

public class Point {
    public int x, y, z;

    public Point()
    {
        x = 0;
        y = 0;
        z = 0;
    }

    public Point(int _x, int _y)
    {
        this.x = _x;
        this.y = _y;
        this.z = 0;
    }

    public Point(int _x, int _y, int _z)
    {
        this.x = _x;
        this.y = _y;
        this.z = _z;
    }

}
