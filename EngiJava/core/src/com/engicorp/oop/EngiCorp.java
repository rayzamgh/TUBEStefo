package com.engicorp.oop;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import java.lang.Math;

public class EngiCorp extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private Pixmap Player;
	private Sprite spr;
	private int w, h;
	//Dunia
	private Texture[][] texDunia;
	private Sprite[][] sprDunia;
	///////
	@Override
	public void create () {
		batch = new SpriteBatch();
		Player = new Pixmap(10, 10, Pixmap.Format.RGBA8888);
		Player.setColor(Color.GOLD);
		Player.fill();
		img = new Texture(Player);
		Player.dispose();
		spr = new Sprite(img);
		//Buat Dunia
		World.getInstance().init(20, 20);
//		w = 20;
//		h = 20;
//		texDunia = new Texture[w][h];
//		sprDunia = new Sprite[w][h];
//		for(int y = 0; y < h; y++)
//		{
//			for(int x = 0; x < w; x++)
//			{
//				texDunia[y][x] = new Texture("tile/50x50/isometric_pixel_0027.png");
//				sprDunia[y][x] = new Sprite(texDunia[y][x]);
//				//https://en.wikipedia.org/wiki/Isometric_projection
//				int xPosReal = x-(w/2);
//				if(x-(w/2) != 0) {
//					xPosReal = (x-(w/2)) * 25 + (int)((x-(w/2)) / Math.abs(x-(w/2)) * 12.5);
//				}
//				int zPosReal = y-(h/2);
//				if(y-(h/2) != 0) {
//					zPosReal = (y-(h/2)) * 25 + (int)((y-(h/2)) / Math.abs(y-(h/2)) * 12.5);
//				}
//				int yPosReal = 0;
//				int xProj = (int)Math.round(Math.sqrt(3)*(xPosReal-zPosReal)/Math.sqrt(6));
//				int yProj = (int)Math.round((xPosReal+2*yPosReal+zPosReal)/Math.sqrt(6));
//				sprDunia[y][x].setPosition(xProj+400, yProj+360);
//			}
//		}
	}
	private void checkKeyboard()
	{
		if(Gdx.input.isKeyPressed(Input.Keys.A)){
			spr.translateX(-1f);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.D)){
			spr.translateX(1f);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.W)){
			spr.translateY(1f);
		}
		if(Gdx.input.isKeyPressed(Input.Keys.S)){
			spr.translateY(-1f);
		}
	}
	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 1, 1, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		checkKeyboard();
		batch.begin();
		spr.draw(batch);
		World.getInstance().renderAll(batch);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
