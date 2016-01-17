package com.lampst.canyon.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.packtpub.libgdx.canyonbunny.CanyonBunnyMain;

public class DesktopLauncher {
	private static boolean rebuildAtlas = true;
	private static boolean drawDebugOutline = true;
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new CanyonBunnyMain(), config);
	}
}
