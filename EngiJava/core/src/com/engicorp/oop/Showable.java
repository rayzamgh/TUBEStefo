package com.engicorp.oop;

import com.engicorp.oop.misc.Point;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Showable {

    protected Point pos, projPos;
    protected String texturePath;
    protected Texture tex;
    protected Sprite spr;
    public Showable(Point _pos, String texPath)
    {
        pos = _pos;
        projPos = new Point(-1, -1);
        texturePath = texPath;
        tex = new Texture(texturePath);
        spr = new Sprite(tex);
    }

    public void render(SpriteBatch batch)
    {
        spr.draw(batch);
    }

    public void setTexPath(String _texPath)
    {
        texturePath = _texPath;
        tex = new Texture(_texPath);
        spr = new Sprite(tex);
    }

    public void setRealPos(Point real)
    {
        pos = real;
        //https://en.wikipedia.org/wiki/Isometric_projection
        projPos.x = (int)Math.round(Math.sqrt(3)*(real.x-real.z)/Math.sqrt(6));
        projPos.y = (int)Math.round((real.x+2*real.y+real.z)/Math.sqrt(6));
        projPos.z = 0;
        spr.setPosition(projPos.x+400, projPos.y+360);
    }
}
