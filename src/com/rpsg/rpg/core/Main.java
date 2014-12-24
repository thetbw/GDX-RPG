package com.rpsg.rpg.core;


import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.graphics.Color;
import com.rpsg.rpg.view.GameViews;

public class Main {
	public static void main(String[] args) {
		final LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "RPG";
		cfg.width = 1024;
		cfg.height = 576;
		cfg.samples=0;
		cfg.resizable=true;
		cfg.initialBackgroundColor=Color.WHITE; 
		new LwjglApplication(new GameViews(), cfg);
	}
}
